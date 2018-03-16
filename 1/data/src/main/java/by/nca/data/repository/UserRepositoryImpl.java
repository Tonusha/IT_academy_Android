package by.nca.data.repository;

import java.util.ArrayList;
import java.util.List;

import by.nca.domain.entity.UserEntity;
import by.nca.domain.repository.UserRepository;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by user on 16.03.2018.
 */

public class UserRepositoryImpl implements UserRepository{

    @Override
    public Observable<UserEntity> get(String id) {
        return Observable.create(new ObservableOnSubscribe<UserEntity>() {
            @Override
            public void subscribe(ObservableEmitter<UserEntity> emitter) throws Exception {
                Thread.sleep(5000);
                UserEntity entity = new UserEntity("Tonya", 20, "vxc");
                emitter.onNext(entity);
                emitter.onComplete();
            }
        });
    }

    @Override
    public Observable<List<UserEntity>> get() {
        return null;
    }

    @Override
    public Completable save() {
        return null;
    }

    @Override
    public Comparable remove() {
        return null;
    }
}
