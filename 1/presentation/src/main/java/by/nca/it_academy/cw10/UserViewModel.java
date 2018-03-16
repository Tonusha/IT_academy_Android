package by.nca.it_academy.cw10;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.Log;

import by.nca.domain.UserEntity;
import by.nca.presentation.base.BaseViewModel;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 12.03.2018.
 */

public class UserViewModel extends BaseViewModel {
    public ObservableField<String> username = new ObservableField(null);
    public ObservableField<String> profileUrl = new ObservableField(null);
    public ObservableField<Integer> age = new ObservableField(null);
    public ObservableBoolean progressVisible = new ObservableBoolean(true);


    @Override
    public void onResume() {
        super.onResume();

        progressVisible.set(true);

        Observable.create(new ObservableOnSubscribe<UserEntity>() {
            @Override
            public void subscribe(ObservableEmitter<UserEntity> emitter) throws Exception {
                Thread.sleep(5000);
                UserEntity entity = new UserEntity("Tonya", 20, "vxc");
                emitter.onNext(entity);
                emitter.onComplete();}
            }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<UserEntity>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("df", "fd");
                    }

                    @Override
                    public void onNext(UserEntity userEntity) {
                        Log.e("df", "fd");
                        username.set(userEntity.getUsername());
                        age.set(userEntity.getAge());
                        profileUrl.set(userEntity.getProfileUrl());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("df", "fd");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("df", "fd");
                    }
                });
        progressVisible.set(false);
    };


}
