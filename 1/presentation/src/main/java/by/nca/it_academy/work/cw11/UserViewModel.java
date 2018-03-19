package by.nca.it_academy.work.cw11;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.Log;

import by.nca.data.repository.UserRepositoryImpl;
import by.nca.domain.entity.UserEntity;
import by.nca.domain.interactor.GetUserByIdUseCaseCW11;
import by.nca.domain.interactor.GetUserByIdUseCaseCW11;
import by.nca.it_academy.executor.UIThread;
import by.nca.it_academy.presentation.base.BaseViewModel;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by user on 12.03.2018.
 */

public class UserViewModel extends BaseViewModel {
    public ObservableField<String> username = new ObservableField(null);
    public ObservableField<String> profileUrl = new ObservableField(null);
    public ObservableField<Integer> age = new ObservableField(null);
    public ObservableBoolean progressVisible = new ObservableBoolean(true);
    public GetUserByIdUseCaseCW11 getUserByIdUseCase = new GetUserByIdUseCaseCW11(new UIThread(), new UserRepositoryImpl());

    public UserViewModel() {
        progressVisible.set(true);


        getUserByIdUseCase.get("id").subscribe(new Observer<UserEntity>() {

            @Override
            public void onSubscribe(Disposable d) {
                Log.e("df", "fd");
                compositeDisposable.add(d);
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
    }

    ;

}
