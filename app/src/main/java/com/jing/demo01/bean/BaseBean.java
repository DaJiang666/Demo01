package com.jing.demo01.bean;

/**
 * Author : 张丹江
 * Time : 2017/3/30 11:03
 * Function :
 * Mail : zhangdanjiang_java@163.com
 */

public class BaseBean {
    protected String err_no;
    protected String err_msg;

    public String getErr_no() {
        return err_no;
    }

    public void setErr_no(String err_no) {
        this.err_no = err_no;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }
}
