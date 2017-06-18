package com.jing.demo01;

/**
 * Author : zdj
 * Time : 2017/3/14 16:26
 * Function :
 *      网络请求工具
 * Mail : zhangdanjiang_java@163.com
 */

public final class HttpUtil {
    private final static boolean isLine = false;

    /**
     * 线下 还是正式
     * @return
     */
    public static String getMainHost() {
        return isLine ? mainHost : testHost;
    }

    private static final String mainHost = "http://api.you-fan.com/";
    private static final String testHost = "http://112.74.182.187/";
//    http://112.74.182.187/list/serial.json
    /** 连载地址*/
    public static final String GET_SERIAL = getMainHost() + "/list/serial.json?";
    /** 连载分页 */
    public static final String GET_SERIAL_MORE = getMainHost() + "/list/serial_more.json?";
    /** 轮播图 */
    public static final String GET_SERIAL_ROTATE = getMainHost() + "/list/rotate.json";

    /** 搜索热词 */
    public static final String GET_SEARCH_HOT = getMainHost() + "/search/history.json?";
    /** 搜索热词 */
    public static final String GET_SEARCH = getMainHost() + "/search/get.json?";



}
