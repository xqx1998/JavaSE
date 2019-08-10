package com.xqx.A01_api;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 14:16
 * description:
 */
public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer integer = new Integer(100);
        System.out.println(integer);
        Integer integer1 = Integer.valueOf("100");
        System.out.println("integer1 = " + integer1);
        Integer integer2 = Integer.valueOf(1000);
        System.out.println("integer2 = " + integer2);
        //Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        /*Integer abc = Integer.valueOf("abc");
        System.out.println("abc = " + abc);*/
    }
}
