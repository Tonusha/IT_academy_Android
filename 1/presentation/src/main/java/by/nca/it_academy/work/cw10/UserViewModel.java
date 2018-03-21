package by.nca.it_academy.work.cw10;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

/**
 * Created by user on 12.03.2018.
 */

public class UserViewModel /*extends BaseViewModel*/ {

    public ObservableField<String> username = new ObservableField(null);
    public ObservableField<String> profileUrl = new ObservableField(null);
    public ObservableField<Integer> age = new ObservableField(null);
    public ObservableBoolean progressVisible = new ObservableBoolean(true);


  /*  @Override
    public void onResume() {
        super.onResume();

        progressVisible.set(true);

        Observable.create(new ObservableOnSubscribe<UserEntity>() {
            @Override
            public void subscribe(ObservableEmitter<UserEntity> emitter) throws Exception {
                Thread.sleep(5000);
                UserEntity entity = new UserEntity("Tonya", "vxc", "fds", 20, false,"sfdasf");
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
                        username.set(userEntity.getFirstName());
                        age.set(userEntity.getAge());
                        profileUrl.set(userEntity.getImageUrl());
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
    };*/


}
