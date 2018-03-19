package by.nca.it_academy.work.cw5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import by.nca.it_academy.R;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityCW5 extends AppCompatActivity {

    private Button button1;
    private static final String ACTION_MY_MESSAGE = "by.nca.it_academy.ACTION_MY_MESSAGE";
    private LocalBroadcastManager localBroadcastManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classwork5);

        button1 = findViewById(R.id.button1);
        localBroadcastManager = LocalBroadcastManager.getInstance(this);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(ACTION_MY_MESSAGE);

                localBroadcastManager.sendBroadcast(intent);
                //sendBroadcast(intent);
            }
        });


    }

    private BroadcastReceiver myReciever = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            Log.e("aaaaaaaaaa", "MY_MESSAGE");

            /*intent.getAction();

            boolean isAirPlaneModeOn = intent.getBooleanExtra("state",
                    false);
            if (isAirPlaneModeOn) {
                Log.e("aaaaaaaaaa", "MY_MESSAGE FROM ACTIVITY_ON");
            } else {
                Log.e("aaaaaaaaaa", "MESSAGE FROM ACTIVITY_OFF");
            }
            ;*/
        }

    };

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_MY_MESSAGE);
        registerReceiver(myReciever, intentFilter);
        //registerReceiver(myReciever, intentFilter);

        Intent intent = new Intent(this, MyService.class);
        startService(intent);

        Intent intent2 = new Intent(this, MyIntentClass.class);
        intent2.putExtra(MyIntentClass.KEY_LINK, "http://film1");
        startService(intent2);

        Intent intent3 = new Intent(this, MyIntentClass.class);
        intent3.putExtra(MyIntentClass.KEY_LINK, "http://film2");
        startService(intent3);

        Intent intent4 = new Intent(this, MyIntentClass.class);
        intent4.putExtra(MyIntentClass.KEY_LINK, "http://film3");
        startService(intent4);
    }

    @Override
    protected void onStop() {
        super.onStop();
//        unregisterReceiver(myReciever);
        stopService(new Intent(this, MyService.class));
    }
}
