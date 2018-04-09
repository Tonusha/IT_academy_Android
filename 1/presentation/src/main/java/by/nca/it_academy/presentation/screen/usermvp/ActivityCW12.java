package by.nca.it_academy.presentation.screen.usermvp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.R;
import by.nca.it_academy.presentation.base.BaseMvpActivity;
import by.nca.it_academy.presentation.screen.UserRouter;
import io.reactivex.annotations.Nullable;

public class ActivityCW12 extends BaseMvpActivity<UserPresenter,UserRouter> implements UserView{

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
    public UserPresenter providePresenter() {
        return new SigninUserPresenter();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(presenter.getUserAdapter());
        presenter.onUserClic();
    }

    @Override
    public void showUser(UserEntity userEntity) {
       //закидываем данные в xml, например в TextView (нужно предварительно сделать для них  findViewById
    }
}

