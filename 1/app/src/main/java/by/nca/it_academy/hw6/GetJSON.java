package by.nca.it_academy.hw6;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by miruk on 26.02.2018.
 */
final class GetJSON {
    static String readJsonFileFromAssets(Context context, String filename) {
        BufferedReader reader = null;
        String rawJson = "";
        try {
            InputStream is = context.getAssets().open(filename, AssetManager.ACCESS_BUFFER);
            reader = new BufferedReader(
                    new InputStreamReader(is));

            String mLine;
            while ((mLine = reader.readLine()) != null) {
                rawJson = mLine;
            }
        } catch (IOException e) {
            //log the exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        return rawJson;
    }

    static List<?> parseFromJson(String jsonText, Class<?> cls) {

        List<?> result = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        if (TextUtils.isEmpty(jsonText) && cls.equals(TestFile.class)) {
            TestFile unParseJson = (TestFile) gson.fromJson(jsonText, cls);
            result = unParseJson.getPeople();
        }
        return result;
    }
} 