package by.nca.it_academy.cw6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import by.nca.it_academy.R;
import by.nca.it_academy.cw5.MyIntentClass;
import by.nca.it_academy.cw5.MyService;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityCW6 extends AppCompatActivity {

    private RecyclerView recyclerView1;
    private static final String ACTION_MY_MESSAGE = "by.nca.it_academy.ACTION_MY_MESSAGE";
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork6);
        recyclerView1 = (RecyclerView) findViewById(R.id.recyclerView1);

        List<User> userList = new ArrayList<>();
        userList.add(new User ("",
                "Ivan", "Ivanovich"));
        userList.add(new User ("",
                "Slava", "User2"));
        userList.add(new User ("",
                "Pasha", "User3"));
        userList.add(new User ("https://www.google.by/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwin3POetbzZAhULLMAKHX5tAEYQjRx6BAgAEAY&url=https%3A%2F%2Fimagejournal.org%2F&psig=AOvVaw27xeicE9YWUipgPNbXxVnN&ust=1519488321210864",
                "Kostia", "User4"));
        userList.add(new User ("https://www.google.by/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwin3POetbzZAhULLMAKHX5tAEYQjRx6BAgAEAY&url=https%3A%2F%2Fimagejournal.org%2F&psig=AOvVaw27xeicE9YWUipgPNbXxVnN&ust=1519488321210864",
                "Dima", "User5"));

        userAdapter = new UserAdapter();
        userAdapter.setItemUser(userList);
        recyclerView1.setAdapter(userAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setHasFixedSize(true);






    }
}

