package by.nca.it_academy.work.cw12;

import android.arch.lifecycle.ViewModelProviders;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityClasswork12Binding;
import by.nca.it_academy.presentation.base.BaseMvvmActivity;

public class ActivityCW12 extends BaseMvvmActivity<ActivityClasswork12Binding, UserViewModel> {

    private static final String TAG = ActivityCW12.class.getSimpleName();


    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork12;
    }

    @Override
    public UserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserViewModel.class);
    }
}
