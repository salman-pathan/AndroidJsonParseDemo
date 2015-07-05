package com.codiodes.androidjsonparsedemo.service;

import com.codiodes.androidjsonparsedemo.api.RedditAPI;
import com.codiodes.androidjsonparsedemo.entity.Feed;

import retrofit.Callback;
import retrofit.RestAdapter;

/**
 * Created by Salman on 7/5/2015.
 */
public class ServiceManager {

    RedditAPI redditAPI;
    String subReddit;

    public ServiceManager(String endpoint, String subReddit) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(endpoint)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        redditAPI = restAdapter.create(RedditAPI.class);
        this.subReddit = subReddit;
    }

    public void getFeed(Callback<Feed> callback) {
        redditAPI.getFeeds(this.subReddit, callback);
    }
}
