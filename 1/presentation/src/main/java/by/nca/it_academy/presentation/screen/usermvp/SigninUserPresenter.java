package by.nca.it_academy.presentation.screen.usermvp;

import android.util.Log;

import javax.inject.Inject;

import by.nca.domain.entity.UserEntity;
import by.nca.domain.interactor.GetUserByIdUseCase;
import by.nca.it_academy.app.App;
import by.nca.it_academy.presentation.screen.list.UserAdapter;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class SigninUserPresenter extends UserPresenter {


    @Inject
    public GetUserByIdUseCase getUserByIdUseCase;

    public UserAdapter userAdapter = new UserAdapter();

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }

    public SigninUserPresenter() {

        view.showProgress();

        getUserByIdUseCase
                .get("id")
                .subscribe(new Observer<UserEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("AAA", "onSubscribe");
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(UserEntity userEntity) {
                        Log.e("AAA", "onNext");
                        view.showUser(userEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("AAA", "onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("AAA", "onComplete");
                        view.dismissProgress();
                    }
                });
    }

    public void onUserClic() {

    }

    @Override
    public UserAdapter getUserAdapter() {
        return null;
    }

    /*архитектурный гитхаб, где смотреть примеры*/
}

