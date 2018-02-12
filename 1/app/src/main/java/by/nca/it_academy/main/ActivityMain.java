package by.nca.it_academy.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import by.nca.it_academy.R;
import by.nca.it_academy.cw1.ActivityCW1;

/**
 * Created by miruk on 12.02.2018.
 */

public class ActivityMain extends AppCompatActivity {
    private Button button1;
    private View.OnClickListener listener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ActivityMain.this, ActivityCW1.class);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork1);
        button1.findViewById(R.id.button1);
        button1.setOnClickListener(listener);
    }
}
