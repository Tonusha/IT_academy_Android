package by.nca.it_academy.work.cw1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import by.nca.it_academy.BuildConfig;
import by.nca.it_academy.R;

/**
 * Created by miruk on 12.02.2018.
 */

public class ActivityCW1 extends AppCompatActivity {

    private static final String TAG = ActivityCW1.class.getSimpleName();

    private Button button1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork1);

        button1 = findViewById(R.id.button1);
        button1.setText(BuildConfig.API_URL);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ActivityCW1.this, "Hello", Toast.LENGTH_SHORT).show();
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
