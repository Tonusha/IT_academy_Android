package com.it_academy;




import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.runner.RunWith;

import by.nca.data.SharedPreference.AppSharedPreference;

import static junit.framework.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class Test {

    @org.junit.Test
    public void Test() {
        Context appComtext = InstrumentationRegistry.getTargetContext();

        AppSharedPreference appSharedPreference = new AppSharedPreference(appComtext);
        appSharedPreference.setToken("AAA");

        String actualToken = appSharedPreference.getToken();
        assertEquals("AAA", actualToken);
    }
}
