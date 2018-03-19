package by.nca.it_academy.presentation.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by user on 12.03.2018.
 */

public abstract class BaseViewModelCW12 extends ViewModel {

    public BaseViewModelCW12() {
        super();
        createInject();
    }

    public abstract void createInject();

    public BaseViewModelCW12(CompositeDisposable compositeDisposable) {
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
