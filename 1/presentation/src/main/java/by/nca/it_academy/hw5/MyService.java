package by.nca.it_academy.hw5;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by HomePC on 22.02.2018.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("Service", "SERVICE CREATE");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("Service", "SERVICE CREATE");
        return super.onUnbind(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("Service", "SERVICE CREATE");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Service", "SERVICE destroy");
    }

    public void disableWifi(Context context, Boolean bool) {
        WifiManager wifi = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);

        if(bool)
            wifi.setWifiEnabled(false);
        else
            wifi.setWifiEnabled(true);
    }

}
