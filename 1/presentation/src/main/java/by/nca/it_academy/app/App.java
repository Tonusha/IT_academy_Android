package by.nca.it_academy.app;


import android.app.Application;

import by.nca.it_academy.injection.AppComponent;

public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }



}

