package by.nca.it_academy.hw1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import by.nca.it_academy.R;


public class ActivityHW1 extends AppCompatActivity implements View.OnClickListener {
    private Button button1;
    private TextView textView1, textView2;
    public static final String KEY_TEXT = " KET_TEXT";

    /*способ 3:в виде переменной отдельно как делали в классе*/
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            changeText(textView1, textView2);
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);

        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        /*способ 2: делать имплемент OnClickListener на текущую активити*/
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeText(textView1, textView2);
            }
        });

        /*способ 3:в виде переменной отдельно как делали в классе*/
        textView2.setOnClickListener(listener);
    }


    /*способ 1: анонимным классом прямо впихивая его в аргумент*/
    @Override
    public void onClick(View v) {
        changeText(textView1, textView2);
    }

            /*Функция для смены текста в TextView*/
        public void changeText(TextView textView1, TextView textView2) {
            String textView1Save = (String) textView1.getText();
            textView1.setText(textView2.getText());
            textView2.setText(textView1Save);
        }

    }
