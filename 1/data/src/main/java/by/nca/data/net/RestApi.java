package by.nca.data.net;

import java.util.List;

import by.nca.data.entity.User;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RestApi {

    @GET("data/User")
    Observable<List<User>> loadUsers();

    @GET("data/User/{objectId}")
    Observable<User> loadUserById(@Path("objectId") String id);
}