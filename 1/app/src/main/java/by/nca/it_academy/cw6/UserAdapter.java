package by.nca.it_academy.cw6;

import android.content.DialogInterface;
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

    public void setItemUser(List<User> itemList) {
        this.itemList.clear();
        this.itemList.addAll(itemList);
        notifyDataSetChanged();
    }

    //создает холдер, содержит layout - xml, он кэшируется, т.е.
    //для разных позиций может использоваться один и тот же холдер
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new Holder(view);
    }

    //вызывается для каждого элемента, используется для заполения данных item - один элемент
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Holder myHolder = (Holder)holder;
        User user = itemList.get(position);
        myHolder.nameTextView.setText(user.getName());
        myHolder.surnameTextView.setText(user.getSurname());

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

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
}
