package by.nca.it_academy.hw3;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

//import com.squareup.picasso.Picasso;
//import com.squareup.picasso.Transformation;

import by.nca.it_academy.R;
//import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by miruk on 16.02.2018.
 */

public class ActivityHW3 extends AppCompatActivity {
    private Button button1;
    private Context context;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_homework3);
        super.onCreate(savedInstanceState);
        final EditText editText1  = (EditText)findViewById(R.id.editText1);
        button1 = findViewById(R.id.button1);
       // final ImageView imageView1 = (ImageView) findViewById(R.id.imageView1);
     //   final CircleImageView imageView2 = (CircleImageView ) findViewById(R.id.image2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context = ActivityHW3.this;
               // Picasso.with(context).load(editText1.getText().toString()).error(R.drawable.my_picture).into(imageView2);
            }
        });
    }





}
