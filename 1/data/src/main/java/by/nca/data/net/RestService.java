package by.nca.data.net;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import by.nca.data.entity.User;
import io.reactivex.Observable;

@Singleton
public class RestService {

    private RestApi restApi;

    @Inject
    public RestService(RestApi restApi) {
        this.restApi = restApi;
    }

    //    @Override
    public Observable<List<User>> loadUsers() {
        return restApi.loadUsers()
               // .compose()
                ;
    }

    //    @Override
    public Observable<User> loadUserById(String id) {
        return restApi.loadUserById(id);
    }
}