package by.nca.domain.repository;


import java.util.List;

import by.nca.domain.entity.UserEntity;
import io.reactivex.Completable;
import io.reactivex.Observable;

/**
 * Created by user on 16.03.2018.
 */

public interface UserRepository {
    Observable<UserEntity> get (String id);
    Observable<List<UserEntity>> get();
    Completable save();
    Completable remove();
}
