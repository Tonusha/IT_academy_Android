package by.nca.it_academy.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import by.nca.it_academy.R;
import by.nca.it_academy.cw1.ActivityCW1;
import by.nca.it_academy.cw2.ActivityCW2;
import by.nca.it_academy.hw1.ActivityHW1;
import by.nca.it_academy.hw2.ActivityHW2;

public class ActivityMain extends Activity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                startActivity(new Intent(ActivityMain.this, ActivityCW1.class));
                break;
            case R.id.button2:
                startActivity(new Intent(ActivityMain.this, ActivityHW1.class));
                break;
            case R.id.button3:
                startActivity(new Intent(ActivityMain.this, ActivityCW2.class));
                break;
            case R.id.button4:
                startActivity(new Intent(ActivityMain.this, ActivityHW2.class));
                break;
        }
        ;
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }
}
