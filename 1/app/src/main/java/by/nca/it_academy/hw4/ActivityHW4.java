package by.nca.it_academy.hw4;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import by.nca.it_academy.R;

/**
 * Created by HomePC on 17.02.2018.
 */

public class ActivityHW4 extends Activity {
    private ImageView sovaImage;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_homework4);
        super.onCreate(savedInstanceState);

        sovaImage = findViewById(R.id.sovaImage);
        sovaImage.setBackgroundResource(R.drawable.sova_animation);
        animationDrawable = (AnimationDrawable)sovaImage.getBackground();
        animationDrawable.start();








    }
}
