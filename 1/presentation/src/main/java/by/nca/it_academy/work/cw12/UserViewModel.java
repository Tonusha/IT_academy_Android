package by.nca.it_academy.work.cw12;

import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;

import javax.inject.Inject;

import by.nca.domain.entity.UserEntity;
import by.nca.domain.interactor.GetUserByIdUseCase;
import by.nca.it_academy.app.App;
import by.nca.it_academy.presentation.base.BaseViewModel;
import by.nca.it_academy.work.hw9.CircleImage;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class UserViewModel extends BaseViewModel
{

    @Override
    public void createInject() {
        App.getAppComponent().inject(this);
    }

    @Inject
    public GetUserByIdUseCase getUserByIdUseCase;
//    GetUserByIdUseCase getUserByIdUseCase = new GetUserByIdUseCase(new UIThread(), new UserRepositoryImpl());

    public ObservableInt background = new ObservableInt(Color.WHITE);

    public ObservableField<String> firstName = new ObservableField<>("");
    public ObservableField<String> lastName = new ObservableField<>("");
    public ObservableField<String> fatherName = new ObservableField<>("");
    public ObservableInt age = new ObservableInt();
    public ObservableBoolean isMan = new ObservableBoolean();
    public ObservableField<String> imageUrl = new ObservableField<>("");
    public ObservableBoolean progressVisible = new ObservableBoolean(false);

    private ArrayList<UserEntity> users = new ArrayList<>();

    public CompositeDisposable compositeDisposable = new CompositeDisposable();

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
        CircleImage.showImage(view.getContext(), url, view);
    }

    public UserViewModel() {
        users.add(new UserEntity("Журавкевич", "Анастасия", "Николаевна", 33, false, "https://i.imgur.com/u1kwdhZ.jpg"));
        users.add(new UserEntity("Сакович", "Евгения", "Евгеньевна", 34, false, "https://i.imgur.com/DvpvklR.jpg"));
        users.add(new UserEntity("Савкин", "Евгений", "Антонович", 35, true, "https://i.imgur.com/NMqbkbm.jpg"));

        getUserByIdUseCase.get("id").subscribe((new Observer<UserEntity>() {
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
                isMan.set(userEntity.isMan());
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

        }));
    }

}


