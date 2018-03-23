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

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void onStart() {

    }

    public void onResume() {

    }

    public void onPause() {

    }

    public void onStop() {

    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }
}
