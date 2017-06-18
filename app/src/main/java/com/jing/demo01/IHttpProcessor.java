package com.jing.demo01;

import java.util.Map;

/**
 * Author : 张丹江
 * Time : 2017/6/16 15:41
 * Function :
 *      共同实现的接口            代理和真正干活的类  的 共同实现的接口
 * Mail : zhangdanjiang_java@163.com
 */

public interface IHttpProcessor {
    // Get

    void get(String url, Map<String, Object> params, ICallBack callBack);
    //Post
    void post(String url, Map<String, Object> params, ICallBack callBack);
    //Update
    //Delete
    //...
}
