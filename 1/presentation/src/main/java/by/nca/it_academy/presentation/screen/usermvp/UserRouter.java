package by.nca.it_academy.presentation.screen.usermvp;

import android.app.Activity;
import android.content.Intent;

import by.nca.it_academy.presentation.base.Router;
import by.nca.it_academy.work.cw12.ActivityCW12;

/**
 * Created by user on 06.04.2018.
 */

public class UserRouter extends Router {

    public UserRouter(Activity activity) {
        super(activity);
    }

    public void navigateToUser(String id) {
        Intent intent = new Intent(getActivity(), ActivityCW12.class);
        intent.putExtra("key", id);
        getActivity().startActivity(intent);

        ActivityCW12.show(getActivity(),id); //альтернативный метод
    }


    public void back() {
        getActivity().onBackPressed();
    }


}
