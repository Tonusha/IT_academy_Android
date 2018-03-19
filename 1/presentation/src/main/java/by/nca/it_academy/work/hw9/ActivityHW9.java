package by.nca.it_academy.work.hw9;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityHomework9Binding;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Created by miruk on 12.02.2018.
 */
public class ActivityHW9 extends AppCompatActivity {
    private Disposable disposable;
    ActivityHomework9Binding binding;
    MyUser user;
    ArrayList<MyUser> users = new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(ActivityHW9.this, R.layout.activity_homework9);
        disposable = Observable
                .interval(5, TimeUnit.SECONDS)
                .map(new Function<Long, MyUser>() {
                    @Override
                    public MyUser apply(Long lon) throws Exception {
                        return users.get(lon.intValue());
                    }
                })
                .subscribe( new Consumer<MyUser>() {
                    @Override
                    public void accept(MyUser user) throws Exception {
                        binding.setUser(user);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        // сюда прилетают ошибки
                    }
                });
    }
    @Override
    protected void onStart() {
        super.onStart();
        users.add(new MyUser("Журавкевич", "Анастасия", "Николаевна", 33, false, "https://i.imgur.com/u1kwdhZ.jpg"));
        users.add(new MyUser("Сакович", "Евгения", "Евгеньевна", 34, false, "https://i.imgur.com/DvpvklR.jpg"));
        users.add(new MyUser("Савкин", "Евгений", "Антонович", 35, true, "https://i.imgur.com/NMqbkbm.jpg"));
    }
    @Override
    protected void onPause() {
        super.onPause();
        if (disposable != null) {
            disposable.dispose();
        }
    }
}