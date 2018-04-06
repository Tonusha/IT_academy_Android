package by.nca.data.net;

import java.util.List;

import by.nca.data.entity.Data;
import by.nca.data.entity.User;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApi {

    @GET("data/User")
    Observable<List<User>> loadUsers();

    @GET("data/User/{id}")
    Observable<User> loadUserById(@Path("id") String id);

    @GET("v1/gifs/search")
    @Headers("api_key: " + Constants.API_IMAGE_KEY)
    Observable<Data> searchImages(@Query("q") String search);

    @GET("v1/gifs/trending")
    @Headers("api_key: " + Constants.API_IMAGE_KEY)
    Observable<Data> trendingImages();
}