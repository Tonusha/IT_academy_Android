package by.nca.it_academy.homework1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import by.nca.it_academy.R;
import by.nca.it_academy.classwork2.Singleton;


public class MainActivity extends Activity {
    private Button button1;
    private TextView textView1, textView2;

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Singleton singleton = Singleton.getInstance();
            if(singleton.text.contains("Hello")){
                Log.e("AAA", "contain");
            }else
            {
                Log.e("AAA","not contain");
            }
        }
    };

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
        changeTextTextView1();
    }

    public void onMyTextViewClick(View v){
        final String textViewText3 = textView1.getText().toString();
        textView1.setText(textView2.getText().toString());
        textView2.setText(textViewText3);
    }

    public void changeTextTextView1(){
        ChangeText changeText = new ChangeText();
        changeText.clickListener(textView1,textView2);
    };


}
