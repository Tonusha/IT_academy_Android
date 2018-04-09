package by.nca.it_academy.presentation.base;

import android.support.annotation.Nullable;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter<View extends BaseView, R extends Router> {
    @Nullable
    protected R router;

    @Nullable
    protected View view;

    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public BasePresenter() {
        super();
        createInject();
    }

    public abstract void createInject();

    public void onStart() {

    }

    public void onResume() {

    }

    public void onPause() {

    }

    public void onStop() {

    }

    public void attach(View view, R router) {
        this.router = router;
        this.view = view;
    }

    public void detach() {
        router = null;
        view = null;
    }

    public void onDestroy() {
        if (!compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
    }
}