package by.nca.presentation.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import by.nca.it_academy.BR;
import by.nca.it_academy.cw10.UserViewModel;


/**
 * Created by user on 12.03.2018.
 */

public abstract class BaseMvvmActivity<Binding extends ViewDataBinding,ViewModel extends BaseViewModel> extends AppCompatActivity {
    protected Binding binding;

    protected ViewModel viewModel;
    public abstract int provideLayoutId();
    public abstract UserViewModel provideViewModel();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        viewModel = provideViewModel();
        binding = DataBindingUtil.setContentView(this, provideLayoutId());
        binding.setVariable(BR.viewModel, provideViewModel())  ;
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
}
