package by.nca.data.net;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import by.nca.data.entity.Data;
import by.nca.data.entity.Error;
import by.nca.data.entity.ErrorRest;
import by.nca.data.entity.Image;
import by.nca.data.entity.User;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

@Singleton
public class RestService {

    private RestApi restApi;
    private ErrorTransformers errorTransformers;

    @Inject
    public RestService(RestApi restApi,ErrorTransformers errorTransformers) {
        this.restApi = restApi;
        this.errorTransformers = errorTransformers;
    }

    public Observable<List<User>> loadUsers() {
        return restApi
                .loadUsers()
                .compose(errorTransformers.<List<User>,ErrorRest>parseHttpError());
    }

    public Observable<User> loadUserById(String id) {
        return restApi
                .loadUserById(id)
                .compose(errorTransformers.<User,ErrorRest>parseHttpError());
    }

    public Observable<List<Image>> searchImages(String search) {
        return restApi
                .searchImages(search)
                .map(new Function<Data, List<Image>>() {
                    @Override
                    public List<Image> apply(Data data) throws Exception {
                        return data.getData();
                    }
                });
    }

    public Observable<List<Image>> trendingImages() {
        return restApi
                .trendingImages()
                .map(new Function<Data, List<Image>>() {
                    @Override
                    public List<Image> apply(Data data) throws Exception {
                        return data.getData();
                    }
                });
    }
}