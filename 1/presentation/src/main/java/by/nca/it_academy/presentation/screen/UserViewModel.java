package by.nca.it_academy.presentation.screen;

import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;

import com.crashlytics.android.Crashlytics;

import javax.inject.Inject;

import by.nca.it_academy.app.App;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import by.nca.data.entity.Error;
import by.nca.data.entity.ErrorType;
import by.nca.domain.entity.UserEntity;
import by.nca.domain.interactor.GetUserByIdUseCase;
import by.nca.it_academy.presentation.base.BaseAdapter;
import by.nca.it_academy.presentation.base.BaseViewModel;
import by.nca.it_academy.presentation.screen.list.UserAdapter;


public class UserViewModel extends BaseViewModel<UserRouter> {

    @Inject
    public GetUserByIdUseCase getUserByIdUseCase;

    public UserAdapter userAdapter = new UserAdapter();

    public ObservableField<String> username = new ObservableField<String>("");
    public ObservableField<String> profileUrl = new ObservableField<String>("");
    public ObservableInt age = new ObservableInt();
    public ObservableBoolean progressVisible = new ObservableBoolean(false);

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }

    public UserViewModel() {
        super();

        if (router != null) router.navigateToUser("dfs");

        userAdapter
                .observeClick()
                .subscribe(new Observer<BaseAdapter.ItemEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {


                    }

                    @Override
                    public void onNext(BaseAdapter.ItemEntity itemEntity) {


                    }

                    @Override
                    public void onError(Throwable e) {

                        if (e instanceof Error) {
                            Error myError = (Error) e;

                            if (myError.getFriendlyError() == ErrorType.NO_INTERNET) {

                            } else if (myError.getFriendlyError() == ErrorType.SERVER_NOT_AVAILABLE) {

                            }

                        } else {

                        }
                    }

                    @Override
                    public void onComplete() {

                    }
                });

        progressVisible.set(true);

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

                        username.set(userEntity.getUsername());
                        profileUrl.set(userEntity.getProfileUrl());
                        age.set(userEntity.getAge());
                    }



                    @Override
                    public void onError(Throwable e) {
                        Crashlytics.logException(e);
                        Log.e("AAA", "onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("AAA", "onComplete");
                        progressVisible.set(false);
                    }
                });
    }
}
