package com.jing.demo01;

import android.app.Application;

/**
 * Created by jiang on 2017/6/17.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
//        HttpHelper.init(new VolleyProcessor(this));
        HttpHelper.init(new OkHttpProcessor());
    }
}
