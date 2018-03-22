package by.nca.it_academy.work_mvvm.hw1;

import android.databinding.ObservableField;
import android.util.Log;

import by.nca.it_academy.presentation.base.BaseViewModelHW10;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by miruk on 21.03.2018.
 */

public class UserViewModel extends BaseViewModelHW10 {
    public ObservableField<String> text1 = new ObservableField("press1");
    public ObservableField<String> text2 = new ObservableField("press2");
    public CompositeDisposable compositeDisposable = new CompositeDisposable();




    @Override
    public void onResume() {
        Observable.create(new ObservableOnSubscribe<MyEntity>() {
            @Override
            public void subscribe(ObservableEmitter<MyEntity> emitter) throws Exception {
                Thread.sleep(5000);
                MyEntity entity = new MyEntity("Press1", "Press2");

                emitter.onNext(entity);
                emitter.onComplete();
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MyEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("AAA", "onSubscribe");
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(MyEntity myEntity) {
                        Log.e("AAA", "onNext");
                        text1.set(myEntity.getText1());
                        text2.set(myEntity.getText2());
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("AAA", "onError");
                    }

                    @Override
                    public void onComplete() {
                        Log.e("AAA", "onComplete");
                    }
                })
        ;
    }

    @Override
    public void onPause() {
        super.onPause();
        compositeDisposable.dispose();
    }
}
