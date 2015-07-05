package com.codiodes.androidjsonparsedemo.entity;

/**
 * Created by Salman on 7/5/2015.
 */
public class Children {
    String kind;
    Data data;

    public Children(String kind, Data data) {
        this.kind = kind;
        this.data = data;
    }

    public String getKind() {
        return kind;
    }

    public Data getData() {
        return data;
    }
}
