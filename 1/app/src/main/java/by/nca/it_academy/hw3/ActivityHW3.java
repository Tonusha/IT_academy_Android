package by.nca.it_academy.hw3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import by.nca.it_academy.R;

/**
 * Created by miruk on 16.02.2018.
 */

public class ActivityHW3 extends Activity{
    private EditText editText1;
    private Button button1;
    private ImageView imageView1;
    private Context context;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_homework3);
        super.onCreate(savedInstanceState);
        /*editText1  =findViewById(R.id.editText1);
        button1 = findViewById(R.id.button1);
        imageView1 = findViewById(R.id.imageView1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = ActivityHW3.this;
                Picasso.with(context).load(editText1.getText().toString()).into(imageView1);
            }
        });*/
    }

   /* @Override public void getView(int position, View convertView, ViewGroup parent) {
        SquaredImageView view = (SquaredImageView) convertView;
        if (view == null) {
            view = new SquaredImageView(context);
        }
        editText1 = findViewById(R.id.editText1);
        String url = getItem(editText1);

        imageView1 = findViewById(R.id.imageView1);
        Picasso.with(context).load(url).into(imageView1);
    }*/


}
