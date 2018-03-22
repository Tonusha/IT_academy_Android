package by.nca.it_academy.app;


import android.app.Application;
import android.content.Context;

import by.nca.data.repository.UserRepositoryImpl;
import by.nca.domain.executor.PostExecutionThread;
import by.nca.domain.repository.UserRepository;
import by.nca.it_academy.executor.UIThread;
import by.nca.it_academy.injection.AppComponent;
import by.nca.it_academy.injection.AppModule;

import javax.inject.Singleton;

import dagger.Provides;

public class App extends Application {

    private static AppComponent appComponent;

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

}
