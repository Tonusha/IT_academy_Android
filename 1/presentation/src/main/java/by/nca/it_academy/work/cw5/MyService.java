package by.nca.it_academy.work.cw5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by user on 19.02.2018.
 */

public class MyService extends Service {
/*для фоновой работы, теряет уже актуальность, т.к. есть много бибилтотек*/

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

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("Service", "SERVICE unbinde");
        return super.onUnbind(intent);
    }

    @Override
    public void onLowMemory() {
        Log.e("Service", "onLowMemory");
        super.onLowMemory();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("Service", "onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("Service", "onBind");
        return null;
    }
}
