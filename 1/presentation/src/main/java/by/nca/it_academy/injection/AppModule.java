package by.nca.it_academy.injection;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Named;
import javax.inject.Singleton;

import by.nca.data.net.RestApi;
import by.nca.data.net.RestService;
import by.nca.data.repository.UserRepositoryImpl;
import by.nca.domain.executor.PostExecutionThread;
import by.nca.domain.repository.UserRepository;
import by.nca.it_academy.BuildConfig;
import by.nca.it_academy.executor.UIThread;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AppModule {

    Context context;
    RestService restService;

    public AppModule(Context context) {
        this.context = context;
    }


    @Provides
    @Singleton
    public Context getContext() {
        return context;
    }

    @Provides
    @Singleton
    public PostExecutionThread getUiThread() {
        return new UIThread();
    }

//    @Binds
//    public abstract  PostExecutionThread getUiThread(UIThread uiThread);

    @Provides
    @Singleton
    @Named("rep1")
    public UserRepository getUserRepository(Context context) {
        return new UserRepositoryImpl(context, restService);
    }

    @Provides
    @Singleton
    @Named("rep2")
    public UserRepository getUserRepository2(Context context) {
        return new UserRepositoryImpl(context, restService);
    }

    @Provides
    @Singleton
    public Retrofit getRetrofit(Gson gson) {
        return new Retrofit
                .Builder()
//                .addCallAdapterFactory( /*Rx in Gson*/)
//                .addConverterFactory()
                .baseUrl(BuildConfig.APPLICATION_ID).build();

        // в градле
        // https://api.backendless.com/FD247E47-9C63-BE0D-FF02-EE6FC26EE800/57954579-3843-763B-FF76-3458E1999F00
        // gson подлючит на сайте retrofita
    }

    @Provides
    @Singleton
    public RestApi getRestApi(Retrofit retrofit) {
        return retrofit.create(RestApi.class);
    }

//    @Provides
//    @Singleton
//    public RestService getRestServiсe() {
//
//    }

    @Provides
    @Singleton
    public Gson getGson() {

        return new GsonBuilder()
                // туту можно добавить настройки для прасинга даты например
                .create();

    }

}
