package by.nca.it_academy.cw6;

import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import by.nca.it_academy.R;

/**
 * Created by user on 23.02.2018.
 */

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<User> itemList = new ArrayList<>();
    private onUserClickListener listener;

    public void setItemUser(List<User> itemList) {
        this.itemList.clear();
        this.itemList.addAll(itemList);

        //метод заставляет RecyclerView перерисовывать элементы
        notifyDataSetChanged();
    }

    //создает холдер, содержит layout - xml, он кэшируется, т.е.
    //для разных позиций может использоваться один и тот же холдер
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);

        return new Holder(view);
    }
    public void setListener(onUserClickListener listener) {
        this.listener = listener;
    }

    //вызывается для каждого элемента, используется для заполения данных item - один элемент
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        Holder myHolder = (Holder)holder;
        final User user = itemList.get(position);
        Uri imgUri= Uri.parse(user.getImageUrl());
        myHolder.imageView.setImageURI(imgUri);
        myHolder.nameTextView.setText(user.getName());
        myHolder.surnameTextView.setText(user.getSurname());
        myHolder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if(listener!= null) listener.onClick(user, position);
            }
        });

    }


    /*AsycTask, rxClick, RxAndroid*/
    /*ставить крутелку при загрузке*/


    //возвращается количесвто элементов
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    //технический класс для хранения item и ссылок на элементы
    static class Holder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView surnameTextView;


        public Holder(View itemView) {
            super(itemView);
            Log.e("Adapter", "Holder");
            imageView = itemView.findViewById(R.id.imageView1);
            nameTextView = itemView.findViewById(R.id.textView1);
            surnameTextView = itemView.findViewById(R.id.textView2);

        }
    }

    interface onUserClickListener {
        void onClick(User user, int position);
    }
}
