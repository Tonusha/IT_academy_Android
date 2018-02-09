package by.nca.it_academy.classwork2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import by.nca.it_academy.R;
import by.nca.it_academy.homework1.MainActivity;

/**
 * Created by user on 09.02.2018.
 */

public class Classwork2Activity extends Activity{

    private Button button1;
    private View.OnClickListener lictener = new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Classwork2Activity.this,MainActivity.class);
            intent.putExtra(MainActivity.KEY_TEX, "Helloooooooooooo");
            startActivity(intent);

            //finish();
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_classwork2);
        super.onCreate(savedInstanceState);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(lictener);
       // Singleton singleton = Singleton.getInstance();
       // singleton.text = "dfgfd";
    }
}
