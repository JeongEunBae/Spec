package com.example.mobileproject;

import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public abstract class HttpSender {

    private static final String TAG = "HTTPSender";

    private static final String URL = "http://localhost:8080/";

    protected String apiName;
    protected RequestBody body;

    public abstract void setBodyContents(Object ... Params);
    
    public void send(){
        new AsyncTask<Void, Void, Void>(){
            @Override
            protected Void doInBackground(Void... params){
                OkHttpClient client = new OkHttpClient();
                client.setConnectTimeout(10, TimeUnit.SECONDS);
                Request request = new Request.Builder().url(URL + apiName).post(body).build();

                try {
                    Response response = client.newCall(request).execute();
                    String result = response.body().string();
                    Log.e(TAG, "Result : " + result);
                } catch (IOException e){
                    Log.e(TAG, "Execption");
                }
                return null;
            }

        }.execute();

    }


}
