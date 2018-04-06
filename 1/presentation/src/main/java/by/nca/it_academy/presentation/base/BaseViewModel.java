package by.nca.it_academy.presentation.base;

import android.arch.lifecycle.ViewModel;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseViewModel <R extends Router> extends ViewModel{
    protected R router;

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public BaseViewModel() {
        super();
        createInject();
    }

    public abstract void createInject();

    public void onStart(){

    }

    public void onResume(){

    }

    public void onPause() {

    }

    public void onStop(){

    }

    public void attachRouter(R router){
        this.router = router;
    }

    public void detachRouter(){
        router = null;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if(!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }
}