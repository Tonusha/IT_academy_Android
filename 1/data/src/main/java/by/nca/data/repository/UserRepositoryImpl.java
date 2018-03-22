package by.nca.data.repository;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import by.nca.data.entity.User;
import by.nca.data.net.RestService;
import by.nca.domain.entity.UserEntity;
import by.nca.domain.repository.UserRepository;
import io.reactivex.Completable;
import io.reactivex.Observable;

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

    @Override
    public Observable<UserEntity> get(String id) {
        return restService
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
        return restService
                .loadUsers()
                .map(new Function<User, List<UserEntity>>() {
                    @Override
                    public List<UserEntity> apply(List<User> users) throws Exception {
                        List<UserEntity> userEntities = new ArrayList<>();
                        for (User user: users) {
                            userEntities.add(new UserEntity(user.getUsername(), user.getAge(), user.getProfileUrl()));
                        }
                        return userEntities;
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
