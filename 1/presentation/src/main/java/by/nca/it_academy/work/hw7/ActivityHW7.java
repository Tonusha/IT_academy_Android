package by.nca.it_academy.work.hw7;

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
import io.reactivex.Observable;
import io.reactivex.subjects.ReplaySubject;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityHW7 extends AppCompatActivity implements PublishContract {
    private View buttonFragment1;
    public static final String TAG = ActivityHW7.class.getSimpleName();
    public static final String SHARED_PREF_NAME = "dfsg";
    public static final String KEY_NAME = "name";
    private SharedPreferences sharedPreferences;
    public ReplaySubject<Integer> publishSubject = ReplaySubject.create();
    private int count = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework7);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        changeFragment();

        findViewById(R.id.buttonFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                publishSubject.onNext(count);
                count++;
            }
        });


        if (savedInstanceState==null) {
            showFragment(OneFragment.getInstance(), false);
        }

    }

    private void changeFragment() {
            showFragment(OneFragment.getInstance(), true);
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

    @Override
    public Observable<Integer> getObservable() {
        return publishSubject;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }


}

//где хранить файлы getFile
//getExternalFilesDir для получения доступа к папке
//getCasheFile сохранение кэшированныъ данных

//библиотеки для бд realm, room (мало весит, но сложнее),

//мукап приложения
