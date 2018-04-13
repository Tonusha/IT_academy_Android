package by.nca.data.SharedPreference;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by user on 13.04.2018.
 */

public class AppSharedPreference {

    private Context context;
    public static String token;

    @Inject
    public AppSharedPreference(Context context) {
        this.context = context;
    }

    public void saveTopsShown(){

    }

    public boolean getTopsShown(){
        return false;
    }

    public static String getToken() {
        if (token != null) {
            return token;
        } else {
            token = "1111";
            return token;

        }
    }

    public static void setToken(String token) {
        AppSharedPreference.token = token;
    }
}
