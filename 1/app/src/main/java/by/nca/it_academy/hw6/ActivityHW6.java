package by.nca.it_academy.hw6;

import android.content.Context;
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

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import by.nca.it_academy.R;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityHW6 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<People> peopleList;
    private EditText editText1;
    private ProgressBar progressBar;
    private Timer timer;

    private TextWatcher searchTextWatcher = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable arg0) {
            timer = new Timer();
            timer.schedule(new TimerTask() {

                @Override
                public void run() {
                    ActivityHW6.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setVisibility(View.VISIBLE);
                            recyclerView.setVisibility(View.INVISIBLE);
                            ActivityHW6.this.userAdapter.filter(editText1.getText().toString());
                        }
                    });
                    try {
                        Thread.sleep(600);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ActivityHW6.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            progressBar.setVisibility(View.INVISIBLE);
                            recyclerView.setVisibility(View.VISIBLE);
                        }
                    });
                    InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    in.hideSoftInputFromWindow(editText1.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                }
            }, 600);
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
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
        progressBar = findViewById(R.id.progressBar1);
        peopleList = (List<People>) GetJSON.parseFromJson(GetJSON.readJsonFileFromAssets(this, "test.json"), TestFile.class);
        userAdapter = new UserAdapter();



        userAdapter.setPeopleList(peopleList);

        userAdapter.setListener(new UserAdapter.OnUserClickListener() {

            @Override
            public void onClick(People people, int position) {
                Toast.makeText(ActivityHW6.this, people.getName()+position, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setAdapter(userAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        editText1.addTextChangedListener(searchTextWatcher);
    }
} 