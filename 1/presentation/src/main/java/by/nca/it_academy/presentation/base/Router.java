package by.nca.it_academy.presentation.base;

import android.app.Activity;

public abstract class Router {
private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public Router(Activity activity) {
        this.activity = activity;
    }
}
