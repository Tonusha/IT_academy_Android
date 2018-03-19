package by.nca.it_academy.work.cw5;

import android.app.IntentService;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by user on 19.02.2018.
 */

public class MyIntentClass extends IntentService{



    public static final String KEY_LINK = "KEY_LINK";

    public MyIntentClass() {
        super("MyIntentClass");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String link = intent.getStringExtra(KEY_LINK);
        Log.e("IntentService", "onHandleIntent"+link);

        try {
            Thread.sleep(5000);
        }
           catch (InterruptedException e) {
            e.printStackTrace();
        } ;


    }


}
