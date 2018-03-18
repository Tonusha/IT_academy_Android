package by.nca.it_academy.cw8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import by.nca.it_academy.R;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityCW8 extends AppCompatActivity {
    private View buttonFragment1;
    private boolean isOneVisible = true;
    public static final String TAG = ActivityCW8.class.getSimpleName();
    public static final String SHARED_PREF_NAME = "dfsg";
    public static final String KEY_NAME = "name";
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork8);

        //shared preference
        //для сохранения своих настроек

        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);


        findViewById(R.id.buttonFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment();
            }
        });

        if (savedInstanceState==null) {
            showFragment(OneFragment.getInstance(), false);
        }

    }

    private void changeFragment() {
        if (isOneVisible) {
            showFragment(TwoFragment.getInstance(), true);
            isOneVisible = false;
        } else {
            showFragment(OneFragment.getInstance(), true);
            isOneVisible = true;
        }
    }

    private void showFragment(Fragment fragment, Boolean addToBackStack) {
        FragmentManager fragmentManager = getSupportFragmentManager();


        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container,fragment, fragment.getClass().getSimpleName());
        if (addToBackStack) fragmentTransaction.addToBackStack(fragment.getClass().getSimpleName());

        fragmentTransaction.commit();


    }

    @Override
    protected void onResume() {
        super.onResume();
        String text =  sharedPreferences.getString(KEY_NAME, "");
        Log.e("AAA", "text=" + text);
    }

    @Override
    protected void onPause() {
        super.onPause();
        sharedPreferences.edit().putString(KEY_NAME, "Hello").apply();
    }
}

//где хранить файлы getFile
//getExternalFilesDir для получения доступа к папке
//getCasheFile сохранение кэшированныъ данных

//библиотеки для бд realm, room (мало весит, но сложнее),

//мукап приложения

