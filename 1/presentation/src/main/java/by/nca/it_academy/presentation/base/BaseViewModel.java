package by.nca.it_academy.presentation.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by user on 12.03.2018.
 */

public class BaseViewModel extends ViewModel {

    public BaseViewModel() {

    }

    public BaseViewModel(CompositeDisposable compositeDisposable) {
        this.compositeDisposable = compositeDisposable;
    }

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void onResume(){

    };

    public void onPause(){

    };

    public void onStart(){

    };

    public void onStop() {
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if(!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }
}
