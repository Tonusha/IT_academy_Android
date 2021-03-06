package by.nca.it_academy.app;

import android.app.Application;

import by.nca.it_academy.injection.AppComponent;
import by.nca.it_academy.injection.AppModule;
import by.nca.it_academy.injection.DaggerAppComponent;
import com.crashlytics.android.Crashlytics;
import io.fabric.sdk.android.Fabric;

public class App extends Application{

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}