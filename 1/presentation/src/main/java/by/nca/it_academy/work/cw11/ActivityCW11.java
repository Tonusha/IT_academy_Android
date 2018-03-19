package by.nca.it_academy.work.cw11;

import android.arch.lifecycle.ViewModelProviders;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityClasswork11Binding;
import by.nca.it_academy.presentation.base.BaseMvvmActivity;


public class ActivityCW11 extends BaseMvvmActivity<ActivityClasswork11Binding, UserViewModel> {

    private static final String TAG = ActivityCW11.class.getSimpleName();


    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork11;
    }

    @Override
    public UserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserViewModel.class);
    }
}
