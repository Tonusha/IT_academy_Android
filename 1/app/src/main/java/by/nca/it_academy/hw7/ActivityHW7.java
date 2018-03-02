package by.nca.it_academy.hw7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import by.nca.it_academy.R;
import by.nca.it_academy.hw1.ActivityHW1;

/**
 * Created by user on 09.02.2018.
 */

public class ActivityHW7 extends Activity{

    private Button button1;
    private View.OnClickListener lictener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(ActivityHW7.this,ActivityHW1.class);
            //intent.putExtra(ActivityHW1.KEY_TEXT, "Helloooooooooooo");
            startActivity(intent);

            //finish();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_homework7);
        super.onCreate(savedInstanceState);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(lictener);
       // Singleton singleton = Singleton.getInstance();
       // singleton.text = "dfgfd";
    }
}
