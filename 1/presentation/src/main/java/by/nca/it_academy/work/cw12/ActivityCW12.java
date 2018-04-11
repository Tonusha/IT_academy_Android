package by.nca.it_academy.work.cw12;


import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;

import by.nca.it_academy.R;
import by.nca.it_academy.databinding.ActivityClasswork12Binding;
import by.nca.it_academy.presentation.base.BaseMvvmActivity;
import by.nca.it_academy.presentation.screen.UserRouter;
import by.nca.it_academy.presentation.screen.UserViewModel;
import io.reactivex.annotations.Nullable;

public class ActivityCW12 extends BaseMvvmActivity<ActivityClasswork12Binding, UserViewModel, UserRouter> {

    private static final String KET_USER_ID = "KET_USER_ID";

    public static void show(Activity activity, String id) {
        Intent intent = new Intent(activity, ActivityCW12.class);
        intent.putExtra(KET_USER_ID, id);
        activity.startActivity(intent);
    }

    @Override
    public UserRouter provadeRouter() {
        return new UserRouter(this);
    }

    @Override
    public int provideLayoutId() {
        return R.layout.activity_classwork12;
    }

    @Override
    public UserViewModel provideViewModel() {
        return ViewModelProviders.of(this).get(UserViewModel.class);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setAdapter(viewModel.userAdapter);

    }
}

