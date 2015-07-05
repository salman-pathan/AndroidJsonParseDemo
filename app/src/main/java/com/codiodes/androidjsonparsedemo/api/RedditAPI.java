package com.codiodes.androidjsonparsedemo.api;

import com.codiodes.androidjsonparsedemo.entity.Feed;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Salman on 7/5/2015.
 */
public interface RedditAPI {
    @GET("/r/{subreddit}/.json")
    void getFeeds(@Path("subreddit") String subReddit, Callback<Feed> feedCallback);
}
