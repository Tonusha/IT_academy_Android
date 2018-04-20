package by.nca.it_academy.presentation.screen.usermvp;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.io.File;

import javax.inject.Inject;

import by.nca.data.SharedPreference.AppSharedPreference;
import by.nca.domain.entity.UserEntity;
import by.nca.it_academy.R;
import by.nca.it_academy.presentation.base.BaseMvpActivity;
import by.nca.it_academy.presentation.notification.NewMessageNotification;
import by.nca.it_academy.presentation.screen.UserRouter;
import by.nca.it_academy.presentation.utils.ImageChooser;
import io.reactivex.annotations.Nullable;

public class ActivityCW12 extends BaseMvpActivity<UserPresenter,UserRouter> implements UserView{

    private static final String KET_USER_ID = "KET_USER_ID";

    /*@Inject
    public AppSharedPreference appSharedPreference;*/

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
        return R.layout.activity_classwork18;
    }

    @Override
    public UserPresenter providePresenter() {
        return new SigninUserPresenter();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == Activity.RESULT_OK){
            File file = ImageChooser.getImageFromResult(this, requestCode, resultCode, data);
            if (file == null){
                Log.e("fds", "file " + file.getAbsolutePath());
            }
            else {
                Log.e("AAA", "File is null");
            }
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(presenter.getUserAdapter());
        presenter.onUserClic();
        Toolbar toolBar = findViewById(R.id.toolBar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolBar.setNavigationIcon(R.drawable.ic_toc_black_24dp);
        // int a = 5/0;

        toolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ImageChooser.StartCamera(ActivityCW12.this);
                ImageChooser.StartGalery(ActivityCW12.this);

            }
        });
        //boolean swown = appSharedPreference.getTopsShown();
        NewMessageNotification.notify(this,"fdfsd", 5);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optional_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        /*switch (item.getItemId()){
            case (R.id.actionSearch) {

                break;
            }
        }*/
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void showUser(UserEntity userEntity) {
       //закидываем данные в xml, например в TextView (нужно предварительно сделать для них  findViewById
    }


}

