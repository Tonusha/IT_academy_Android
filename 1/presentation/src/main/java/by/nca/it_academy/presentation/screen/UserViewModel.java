package by.nca.it_academy.presentation.screen;

import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import by.nca.it_academy.app.App;
import by.nca.it_academy.presentation.base.BaseViewModel;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class UserViewModel extends BaseViewModel {

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }

    @Inject
    public GetUserByIdUseCase getUserByIdUseCase;
    public UserAdapter userAdapter = new UserAdapter();


    //GetUserByIdUseCase getUserByIdUseCase = new GetUserByIdUseCase(new UIThread(), new UserRepositoryImpl());

    public ObservableInt background = new ObservableInt(Color.WHITE);

    public ObservableField<String> firstName = new ObservableField<>("");
    public ObservableField<String> lastName = new ObservableField<>("");
    public ObservableField<String> fatherName = new ObservableField<>("");
    public ObservableInt age = new ObservableInt();
    public ObservableBoolean isMan = new ObservableBoolean();
    public ObservableField<String> imageUrl = new ObservableField<>("");
    public ObservableBoolean progressVisible = new ObservableBoolean(false);

//    private ArrayList<UserEntity> users = new ArrayList<>();

    public CompositeDisposable compositeDisposable = new CompositeDisposable();

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        MyAppGlideModule.showImage(view.getContext(), url, view);
    }

    public UserViewModel() {

        getUserByIdUseCase.get("F2DEB8C5-C0FE-30C1-FF5E-F52C286FFF00").subscribe(new Observer<UserEntity>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e("AAA", "onSubscribe");
                compositeDisposable.add(d);
            }

            @Override
            public void onNext(UserEntity userEntity) {
                Log.e("AAA", "onNext");
                firstName.set(userEntity.getFirstName());
                lastName.set(userEntity.getLastName());
                fatherName.set(userEntity.getFatherName());
                age.set(userEntity.getAge());
//                isMan.set(userEntity.get(3).isMan());
//                imageUrl.set(userEntity.getImageUrl());
                imageUrl.set(userEntity.getImageUrl());
            }

            @Override
            public void onError(Throwable e) {
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
