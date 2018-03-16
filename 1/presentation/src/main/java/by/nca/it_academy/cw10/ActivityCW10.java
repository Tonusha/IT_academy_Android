package by.nca.it_academy.cw10;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityClasswork10Binding;
import by.nca.presentation.base.BaseMvvmActivity;



public class ActivityCW10 extends BaseMvvmActivity<ActivityClasswork10Binding , UserViewModel> {

    private static final String TAG = ActivityCW10.class.getSimpleName();


    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork10;
    }

    @Override
    public UserViewModel provideViewModel() {
        return new UserViewModel();
    }
}
