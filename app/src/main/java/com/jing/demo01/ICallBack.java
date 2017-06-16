package com.jing.demo01;

/**
 * Author : 张丹江
 * Time : 2017/6/16 15:46
 * Function :
 *
 *    网络层走的是byte 网络给我们的最终的String
 *
 * Mail : zhangdanjiang_java@163.com
 */

public interface ICallBack {

    void onSuccess(String string);

    void onFailed(String string);


}
