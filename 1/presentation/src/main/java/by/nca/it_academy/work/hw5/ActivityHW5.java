package by.nca.it_academy.work.hw5;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import by.nca.it_academy.R;

/**
 * Created by user on 12.02.2018.
 */

public class ActivityHW5 extends Activity {

    private TextView textView1;
    private Button button1;
    private WifiManager wifi;
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework5);
        textView1 = (TextView) findViewById(R.id.textView1);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                by.nca.it_academy.work.hw5.MyService myService = new by.nca.it_academy.work.hw5.MyService();
                context = ActivityHW5.this;
                WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
                boolean rez;
                if((Integer)wifi.getWifiState()==1) {
                    rez = false;}
                else
                    rez = true;
                myService.disableWifi(context, rez);
            }
        });
    }

    private BroadcastReceiver myReciever = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            if (netInfo != null && netInfo.isConnected() && netInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                Log.e("MyBroadcastReceiver", " WI-FI ON");
                textView1.setText(" WI-FI ON");
            } else {
                Log.e("MyBroadcastReceiver", " WI-FI OFF");
                textView1.setText(" WI-FI OFF");
            }
        }

    };


    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
        registerReceiver(myReciever, intentFilter);

        Intent intent = new Intent(this, by.nca.it_academy.work.hw5.MyService.class);
        startService(intent);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(myReciever);
        stopService(new Intent(this, by.nca.it_academy.work.hw5.MyService.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopService(new Intent(this, by.nca.it_academy.work.hw5.MyService.class));
    }
}
