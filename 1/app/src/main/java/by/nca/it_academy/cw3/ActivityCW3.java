package by.nca.it_academy.cw3;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import by.nca.it_academy.R;
import by.nca.it_academy.cw1.ActivityCW1;
import by.nca.it_academy.hw3.ActivityHW3;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityCW3 extends AppCompatActivity {

    private static final String TAG = ActivityCW3.class.getSimpleName();

    private Button button1;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork3);

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //editText1  =findViewById(R.id.editText1);
                button1 = findViewById(R.id.button1);
                final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
                button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        context = ActivityCW3.this;
                        Picasso.with(context).load(/*editText1.getText().toString()*/"https://i.imgur.com/DvpvklR.jpg").into(imageView1);
                    }
                });
            }
        });
        Log.e(TAG, "onCreate()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onRause()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop()");
    }
}
