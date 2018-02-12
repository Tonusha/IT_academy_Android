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

        private Button button;
        private TextView textView1;
        private TextView textView2;

        private View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exchange(textView1, textView2);
            }
        };

    public void exchange(TextView tv1, TextView tv2) {
        String textView1Text = (String)tv1.getText();
        tv1.setText(tv2.getText());
        tv2.setText(textView1Text);
    }

    @Override
    public void onClick(View v) {
        exchange(textView1, textView2);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework1);

        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                exchange(textView1, textView2);
            }
        });

        textView2.setOnClickListener(listener);

    }
    // Повесьте клик плиз 3-мя разными способами: сделать имплемент OnClickListener на текущую активити, анонимным классом прямо впихивая его в аргумент и в виде переменной отдельно как делали в классе.

}