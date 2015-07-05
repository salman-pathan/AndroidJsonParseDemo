package com.codiodes.androidjsonparsedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.codiodes.androidjsonparsedemo.entity.Children;
import com.codiodes.androidjsonparsedemo.entity.Feed;
import com.codiodes.androidjsonparsedemo.service.ServiceManager;

import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    public static final String ENDPOINT = "http://www.reddit.com";
    public static final String SUB_REDDIT = "programming";
    public static final String TAG = "JSON DATA";
    public static final String ERROR_TAG = "RETROFIT ERROR";
    private List<Children> childrens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceManager serviceManager = new ServiceManager(ENDPOINT, SUB_REDDIT);
        serviceManager.getFeed(new Callback<Feed>() {
            @Override
            public void success(Feed feed, Response response) {
                childrens = feed.getData().getChildren();
                for (Children children : childrens) {
                    //  Print Author
                    Log.i(TAG, children.getData().getAuthor());
                }
            }

            @Override
            public void failure(RetrofitError error) {
                Log.e(ERROR_TAG, error.getMessage());
            }
        });
    }
}
