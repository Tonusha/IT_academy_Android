package by.nca.data.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import by.nca.data.entity.User;
import by.nca.domain.entity.UserEntity;
import by.nca.domain.repository.UserRepository;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by user on 16.03.2018.
 */

public class UserRepositoryImpl implements UserRepository {

    private Context context;
    private RestService restService;

    public UserRepositoryImpl(Context context, RestService restService) {
        this.context = context;
        this.restService = restService;
    }

    public UserRepositoryImpl() {

    }

    @Override
    public Observable<UserEntity> get(String id) {
        return /*Observable.create(new ObservableOnSubscribe<UserEntity>() {
            @Override
            public void subscribe(ObservableEmitter<UserEntity> emitter) throws Exception {
                Thread.sleep(5000);
                UserEntity entity = new UserEntity("Tonya", 20, "vxc");
                emitter.onNext(entity);
                emitter.onComplete();*/
                restService
                        .loadUserById(id)
                        .map(new Function<User, UserEntity>() {
                            @Override
                            public UserEntity apply(User user) throws Exception {
                                return new UserEntity(user.getUsername(), user.getAge(), user.getProfileUrl());
                            }
                        });
    }

    @Override
    public Observable<List<UserEntity>> get() {
        restService
                .loadUser()
                .map(new Function<User, UserEntity>() {
                    @Override
                    public UserEntity apply(User user) throws Exception {
                        return new UserEntity(user.getUsername(), user.getAge(), user.getProfileUrl());
                    }
                });
    }


        @Override
        public Completable save () {
            return null;
        }

        @Override
        public Comparable remove () {
            return null;
        }
    }
