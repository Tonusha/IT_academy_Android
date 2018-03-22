package by.nca.it_academy.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import by.nca.it_academy.R;
import by.nca.it_academy.work.cw1.ActivityCW1;
import by.nca.it_academy.work.cw2.ActivityCW2;
import by.nca.it_academy.work.cw3.ActivityCW3;
import by.nca.it_academy.work.cw4.ActivityCW4;
import by.nca.it_academy.work.cw5.ActivityCW5;
import by.nca.it_academy.work.cw6.ActivityCW6;
import by.nca.it_academy.work.cw7.ActivityCW7;
import by.nca.it_academy.work.cw9.ActivityCW9;
import by.nca.it_academy.work.hw2.ActivityHW2;
import by.nca.it_academy.work.hw3.ActivityHW3;
import by.nca.it_academy.work.hw4.ActivityHW4;
import by.nca.it_academy.work.hw5.ActivityHW5;
import by.nca.it_academy.work.hw6.ActivityHW6;
import by.nca.it_academy.work.hw7.ActivityHW7;
import by.nca.it_academy.work.hw8.ActivityHW8;
import by.nca.it_academy.work.hw9.ActivityHW9;
import by.nca.it_academy.work_mvvm.hw1.ActivityHW1;

public class ActivityMain extends Activity implements View.OnClickListener {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    /*private Button button18;
    private Button button19;*/

    /*использовать butter knife бибилиотеку*/

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
            case R.id.button5:
                startActivity(new Intent(ActivityMain.this, ActivityCW3.class));
                break;
            case R.id.button6:
                startActivity(new Intent(ActivityMain.this, ActivityHW3.class));
                break;
            case R.id.button7:
                startActivity(new Intent(ActivityMain.this, ActivityCW4.class));
                break;
            case R.id.button8:
                startActivity(new Intent(ActivityMain.this, ActivityHW4.class));
                break;
            case R.id.button9:
                startActivity(new Intent(ActivityMain.this, ActivityCW5.class));
                break;
            case R.id.button10:
                startActivity(new Intent(ActivityMain.this, ActivityHW5.class));
                break;
            case R.id.button11:
                startActivity(new Intent(ActivityMain.this, ActivityCW6.class));
                break;
            case R.id.button12:
                startActivity(new Intent(ActivityMain.this, ActivityHW6.class));
                break;
            case R.id.button13:
                startActivity(new Intent(ActivityMain.this, ActivityCW7.class));
                break;
            case R.id.button14:
                startActivity(new Intent(ActivityMain.this, ActivityHW7.class));
                break;
            case R.id.button15:
                startActivity(new Intent(ActivityMain.this, ActivityCW9.class));
                break;
            case R.id.button16:
                startActivity(new Intent(ActivityMain.this, ActivityHW8.class));
                break;
            case R.id.button17:
                startActivity(new Intent(ActivityMain.this, ActivityHW9.class));
                break;
            /*case R.id.button17:
                startActivity(new Intent(ActivityMain.this, ActivityCW10.class));
                break;*/
            /*case R.id.button18:
                startActivity(new Intent(ActivityMain.this, ActivityCW11.class));
                break;*/
            /*case R.id.button19:
                startActivity(new Intent(ActivityMain.this, ActivityCW12.class));
                break;*/
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
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(this);
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(this);
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(this);
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(this);
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(this);
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(this);
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(this);
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(this);
        button13 = findViewById(R.id.button13);
        button13.setOnClickListener(this);
        button14 = findViewById(R.id.button14);
        button14.setOnClickListener(this);
        button15 = findViewById(R.id.button15);
        button15.setOnClickListener(this);
        button16 = findViewById(R.id.button16);
        button16.setOnClickListener(this);
        button17 = findViewById(R.id.button17);
        button17.setOnClickListener(this);
        /*button17 = findViewById(R.id.button17);
        button17.setOnClickListener(this);
        button18 = findViewById(R.id.button18);
        button18.setOnClickListener(this);
        button19 = findViewById(R.id.button19);
        button19.setOnClickListener(this);*/
    }
}
