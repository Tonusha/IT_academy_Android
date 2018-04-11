package by.nca.it_academy.presentation.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;


public abstract class BaseMvpActivity<Presenter extends BasePresenter, R extends Router>
        extends AppCompatActivity implements BaseView {

    @Nullable
    protected R router;
    protected Presenter presenter;

    public abstract R provadeRouter();
    public abstract int provideLayoutId();
    public abstract Presenter providePresenter();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = providePresenter();
        setContentView(provideLayoutId());
        router = provadeRouter();
        presenter.attach(this, router);
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        router = null;
        presenter.detach();
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void showError(Exception e) {

    }
}