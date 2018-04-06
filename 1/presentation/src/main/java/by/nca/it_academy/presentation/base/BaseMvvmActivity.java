package by.nca.it_academy.presentation.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import by.nca.it_academy.BR;


public abstract class BaseMvvmActivity<Binding extends ViewDataBinding,
        ViewModel extends BaseViewModel, R extends Router>
        extends AppCompatActivity {

    @Nullable
    protected R router;

    protected Binding binding;
    protected ViewModel viewModel;

    public abstract R provadeRouter();


    public abstract int provideLayoutId();

    public abstract ViewModel provideViewModel();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = provideViewModel();
        binding = DataBindingUtil.setContentView(this, provideLayoutId());
        binding.setVariable(BR.viewModel, viewModel);
        router = provadeRouter();
        viewModel.attachRouter(router);
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewModel.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.onStop();
    }

    @Override
    protected void onDestroy() {
        router = null;
        viewModel.detachRouter();
        super.onDestroy();
    }
}