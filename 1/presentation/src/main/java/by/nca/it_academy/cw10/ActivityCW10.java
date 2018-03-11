package by.nca.it_academy.cw9;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import by.nca.it_academy.BuildConfig;
import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityClasswork9Binding;

/**
 * Created by miruk on 12.02.2018.
 */

public class ActivityCW9 extends AppCompatActivity {

    private static final String TAG = ActivityCW9.class.getSimpleName();

    private Button button15;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyEntity myEntity = new MyEntity("Ура работает", "супер кнопка");

        ActivityClasswork9Binding binding =  DataBindingUtil.setContentView(this, R.layout.activity_classwork9);
        binding.setMyEntity(myEntity);
    }

}
