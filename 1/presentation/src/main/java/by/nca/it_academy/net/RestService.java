package by.nca.it_academy.net;

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
        return this.restApi = restApi;
    }

    Observable<List<User>> loadUser(){
        return restApi.LoadUsers();
    }

    Observable<User> loadUserById(){
        return restApi.LoadUserById("id");
    }
}
