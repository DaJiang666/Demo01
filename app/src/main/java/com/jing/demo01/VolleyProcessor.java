package com.jing.demo01;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Map;



/**
 * Author : 张丹江
 * Time : 2017/6/16 18:15
 * Function :
 * Mail : zhangdanjiang_java@163.com
 */

public class VolleyProcessor implements IHttpProcessor{

    private final static String TAG = "VolleyProcessor";

    private static RequestQueue mQueue = null;

    public VolleyProcessor(Context context) {
        mQueue = Volley.newRequestQueue(context);

    }

    @Override
    public void get(String url, Map<String, Object> params, final ICallBack callBack) {
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
        new Response.Listener<String>() {

            @Override
            public void onResponse(String response) {
                Log.d(TAG, "onSuccess response==" + response);
                callBack.onSuccess(response);
            }
        },
        new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                String toString = "null";
                if (error != null) {
                    toString = error.toString();
                }
                Log.d(TAG, "onErrorResponse error ==" + toString);
                callBack.onFailed(error.toString());
            }
        });

        mQueue.add(stringRequest);

    }

    @Override
    public void post(String url, Map<String, Object> params, final ICallBack callBack) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {


            @Override
            public void onResponse(String response) {
                Log.d(TAG, "onSuccess response==" + response);
                callBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                String toString = "null";
                if (error != null) {
                    toString = error.toString();
                }
                Log.d(TAG, "onErrorResponse error ==" + toString);
                callBack.onFailed(error.toString());
            }
        });

        mQueue.add(stringRequest);
    }
}
