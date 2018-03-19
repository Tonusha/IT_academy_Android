package by.nca.it_academy.injection;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import by.nca.data.repository.UserRepositoryImpl;
import by.nca.domain.executor.PostExecutionThread;
import by.nca.it_academy.executor.UIThread;
import by.nca.it_academy.net.RestApi;
import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AppModule {
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
    public PostExecutionThread getUIThread(){
        return new UIThread();
    }

    /*2 способ (сделать абстрактным класс)*/
   /* @Binds
    public abstract PostExecutionThread getUIThread(UIThread uiThread);*/

    @Provides
    @Singleton
    public UserRepositoryImpl getUserRepository(){
        return new UserRepositoryImpl();
    }

@Provides
    @Singleton
    public RestApi getRestApi(Gson gson){

}


    @Provides
    @Singleton
    public RestApi getRestService(Retrofit retrofit){
        return retrofit.create(RestApi.class);
    }

    @Provides
    @Singleton
    public Gson getGson(){
        return new GsonBuilder().create();
    }

}
