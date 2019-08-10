package com.xqx.A01_api;

import java.util.Date;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 14:54
 * description:
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);
        Date date3 = new Date(0);
        System.out.println("date3 = " + date3);
        long date1 = 1000*60*60;
        Date date2 = new Date(date1);
        System.out.println("date2 = " + date2);
    }
}
