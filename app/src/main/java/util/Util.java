package util;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Canada;
import okhttp3.OkHttpClient;
import okhttp3.Request;

import static android.R.string.ok;

/**
 * Created by yan_zhe on 2017/6/27.
 */

public class Util {
    public static String getJson(Context context, String fileName) {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = context.getAssets();
            BufferedReader bf = new BufferedReader(new InputStreamReader(
                    assetManager.open(fileName)));
            String line;
            while ((line = bf.readLine()) != null) {
                stringBuilder.append(line);
                System.out.println(stringBuilder.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static Canada parseFromGson(Context context) {
        Gson gson = new Gson();
        String s = getJson(context, "example.json");
        Canada canada = gson.fromJson(s,Canada.class);
        return canada;

    }

    public static void sendHttpRuquest(String add , okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request  request = new Request.Builder().url(add).build();
        client.newCall(request).enqueue(callback);
    }
}
