package com.xtool.mvvmdtcquery.bean;

import android.databinding.BaseObservable;

/**
 * Created by xtool on 2017/9/4.
 */

public class User extends BaseObservable{

    private int uid;
    private String key;
    private String uname;
    private String upassword;


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }
}
