package by.nca.it_academy.hw6;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import by.nca.it_academy.R;
import by.nca.it_academy.hw6.*;
import by.nca.it_academy.hw6.People;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityHW6 extends AppCompatActivity {

    private static final String TAG = ActivityHW6.class.getSimpleName();

    private RecyclerView recyclerView1;
    private UserAdapter userAdapter;
    private List<People> userList;
    private EditText editText1;

    private ProgressBar progressBar1;
    private Timer timer;

    private TextWatcher searchTextWatcher = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable arg0) {
            // user typed: start the timer
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    // do your actual work here
                    ActivityHW6.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar1.setVisibility(View.VISIBLE);
                            recyclerView1.setVisibility(View.INVISIBLE);
                            ActivityHW6.this.userAdapter.filter(editText1.getText().toString());
                        }
                    });

                    // задержка для проверки прогрессбара
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    ActivityHW6.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar1.setVisibility(View.INVISIBLE);
                            recyclerView1.setVisibility(View.VISIBLE);
                        }
                    });

                    // hide keyboard as well?
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(editText1.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
            }, 600); // 600ms delay before the timer executes the "run" method from TimerTask
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            // nothing to do here
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // user is typing: reset already started timer (if existing)
            if (timer != null) {
                timer.cancel();
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework6);

        editText1 = findViewById(R.id.editText1);
        progressBar1 = findViewById(R.id.progressBar1);


        userList = (List<People>) GetJSON.parseFromJson(GetJSON.readJsonFileFromAssets(this, "user.json"), PeopleFile.class);

        userAdapter = new UserAdapter();
        userAdapter.setUserList(userList);



        recyclerView1 = findViewById(R.id.recyclerView1);
        recyclerView1.setAdapter(userAdapter);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this));
        recyclerView1.setHasFixedSize(true);

        editText1.addTextChangedListener(searchTextWatcher);

    }
}
