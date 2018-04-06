package by.nca.it_academy.injection;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import by.nca.data.db.AppDatabase;
import by.nca.data.net.RestService;
import by.nca.data.repository.UserRepositoryImpl;
import by.nca.domain.executor.PostExecutionThread;
import by.nca.domain.repository.UserRepository;
import by.nca.it_academy.BuildConfig;
import by.nca.it_academy.executor.UIThread;
import by.nca.data.net.RestApi;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public  class AppModule {

    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context getContext(){
        return context;
    }

    @Provides
    @Singleton
    public PostExecutionThread getUiThread() {
        return new UIThread();
    }

    @Provides
    @Singleton
    public AppDatabase getAppDatabase(Context context) {

        AppDatabase appDatabase = Room.databaseBuilder(context,
                AppDatabase.class,
                "database")
                .fallbackToDestructiveMigration()
                .build();

        return appDatabase;
    }

    @Provides
    @Singleton
    public UserRepository getUserRepository(Context context,
                                            RestService restService,
                                            AppDatabase appDatabase) {
        return new UserRepositoryImpl(context, restService, appDatabase);
    }

    @Provides
    @Singleton
    public Retrofit getRetrofit(OkHttpClient okHttpClient, Gson gson){

        return new  Retrofit.Builder()
                .baseUrl("https://api.backendless.com/4C4D4A50-F9B6-65EB-FFFB-76F895429C00/0A8AF370-113D-95F0-FF4F-AA5DE2EDD500/")
                     //   .baseUrl("https://api.backendless.com/70E26EEB-3ACD-601D-FF12-541F239F8800/FDBEBFDC-2C3B-E045-FF00-D718E4134700/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();
    }

    @Provides
    @Singleton
    public OkHttpClient getOkHttp(){

        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        builder
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS);

        if(BuildConfig.DEBUG) {
            HttpLoggingInterceptor httpLogging =
                    new HttpLoggingInterceptor();
            httpLogging.setLevel(HttpLoggingInterceptor.Level.BODY);

            builder.addInterceptor(httpLogging);
        }

        return builder.build();
    }

    @Provides
    @Singleton
    public RestApi getRestApi(Retrofit retrofit) {
        return retrofit.create(RestApi.class);
    }

    @Provides
    @Singleton
    public Gson getGson() {
        return new GsonBuilder()
                .create();
    }
}