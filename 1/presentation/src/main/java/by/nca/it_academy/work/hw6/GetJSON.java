package by.nca.it_academy.work.hw6;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by miruk on 26.02.2018.
 */
final class GetJSON {

    static String readJsonFileFromAssets(Context context, String filename) {
        BufferedReader reader = null;
        String rawJson = "";
        StringBuilder stringBuilder = new StringBuilder();;
        try {
            InputStream is = context.getAssets().open(filename, AssetManager.ACCESS_BUFFER);
            reader = new BufferedReader(
                    new InputStreamReader(is));

            String mLine;
            while ((mLine = reader.readLine()) != null) {
//                rawJson += mLine;
                stringBuilder.append(mLine);
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
        return stringBuilder.toString();
//        return rawJson;
    }

    static List<?> parseFromJson (String jsonText, Class<?> cls) {

        List<?> result = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

            PeopleClass unParseJson = (PeopleClass) gson.fromJson(jsonText, cls);
            result = unParseJson.getPeople();

        return result;
    }
}