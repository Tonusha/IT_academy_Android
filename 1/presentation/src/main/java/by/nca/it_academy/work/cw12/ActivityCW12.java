package by.nca.it_academy.work.cw12;



import android.arch.lifecycle.ViewModelProviders;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityClasswork12Binding;
import by.nca.it_academy.presentation.base.BaseMvvmActivityCW12;
import by.nca.it_academy.presentation.screen.UserViewModel;


public class ActivityCW12 extends BaseMvvmActivityCW12<ActivityClasswork12Binding, UserViewModel> {

    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork12;
    }

    @Override
    public UserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserViewModel.class);
    }

}
