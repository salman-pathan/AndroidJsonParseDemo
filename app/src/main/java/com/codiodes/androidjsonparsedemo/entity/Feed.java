package com.codiodes.androidjsonparsedemo.entity;

/**
 * Created by Salman on 7/5/2015.
 */
public class Feed {
    String kind;
    RootData data;

    public Feed(String kind, RootData data) {
        this.kind = kind;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public RootData getData() {
        return data;
    }
}
