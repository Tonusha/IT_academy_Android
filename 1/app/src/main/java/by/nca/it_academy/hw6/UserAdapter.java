package by.nca.it_academy.hw6;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import by.nca.it_academy.R;

/**
 * Created by user on 23.02.2018.
 */

public class UserAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<People> itemList = new ArrayList<>();
    private List<People> itemOriginalList = new ArrayList<>();
    private List<People> itemListFiltred = new ArrayList<>();
    private OnUserClickListener listener;

    public void setListener(OnUserClickListener listener) {
        this.listener = listener;

    }

    public void setUserList(List<People> itemList) {
        this.itemList.clear();
        this.itemList.addAll(itemList);
        if (itemOriginalList.size() == 0) {
            itemOriginalList.addAll(itemList);
        }
        // метод заставлят перерисовать элементы
        notifyDataSetChanged();
    }

    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        itemListFiltred = new ArrayList<>();
        if (charText.length() == 0) {
            itemListFiltred.addAll(itemOriginalList);
        } else {
            for (People item : itemOriginalList) {
                if (item.getName().toLowerCase(Locale.getDefault()).contains(charText) || item.getSurname().toLowerCase(Locale.getDefault()).contains(charText)) {
                    itemListFiltred.add(item);
                }
            }
        }
        setUserList(itemListFiltred);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user_hw6, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        Holder myHolder = (Holder) holder;
        final People people = itemList.get(position);

        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(people, position);
                }
            }
        });

        myHolder.textView1.setText(people.getName());
        myHolder.textView2.setText(people.getSurname());
        myHolder.textView3.setText(people.getAge().toString());
    }

    // возвращет размер
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    // технический клас для хранаения item и ссылок на элменты
    private static class Holder extends RecyclerView.ViewHolder {

        TextView textView1;
        TextView textView2;
        TextView textView3;

        public Holder(View itemView) {
            super(itemView);
            Log.e("UserAdapter", "Holder");
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
        }
    }

    interface OnUserClickListener {
        void onClick(People people, int position);
    }
}