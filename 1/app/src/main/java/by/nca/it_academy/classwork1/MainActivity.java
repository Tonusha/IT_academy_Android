package by.nca.it_academy.classwork1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import by.nca.it_academy.R;


public class MainActivity extends Activity {
    private Button button1;
    private TextView textView1, textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork1);

        button1 = findViewById(R.id.button1);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);


        final String textViewText1 = textView1.getText().toString();
        final String textViewText2 = textView2.getText().toString();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.getText().toString() == textViewText1) {
                    textView1.setText(textViewText2);
                    textView2.setText(textViewText1);
                } else {
                    textView1.setText(textViewText1);
                    textView2.setText(textViewText2);
                }
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.getText().toString() == textViewText1) {
                    textView1.setText(textViewText2);
                    textView2.setText(textViewText1);
                } else {
                    textView1.setText(textViewText1);
                    textView2.setText(textViewText2);
                }
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView1.getText().toString() == textViewText1) {
                    textView1.setText(textViewText2);
                    textView2.setText(textViewText1);
                } else {
                    textView1.setText(textViewText1);
                    textView2.setText(textViewText2);
                }
            }
        });
    }
}
