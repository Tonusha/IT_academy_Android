package by.nca.it_academy.work_mvvm.hw1;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityHomework1Binding;
import by.nca.it_academy.presentation.base.BaseMvvmActivityHW10;

/**
 * Created by miruk on 21.03.2018.
 */

public class ActivityHW1 extends BaseMvvmActivityHW10<ActivityHomework1Binding , UserViewModel> {

    @Override
    public int provideLayoutId() {
        return R.layout.activity_homework1;
    }

    @Override
    public UserViewModel provideViewModel() {
        return null;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
