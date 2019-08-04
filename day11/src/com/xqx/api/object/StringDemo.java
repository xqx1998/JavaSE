package com.xqx.api.object;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 14:23
 * description:
 */
public class StringDemo {
    public static void main(String[] args) {
        int number = 1;
        String s = ""+number;
        System.out.println(s);
        String s1 = String.valueOf(number);
        System.out.println("s1 = " + s1);

        System.out.println("--------------");

        String s2 = "10000";
        Integer integer = Integer.valueOf(s2);
        System.out.println("integer = " + integer);
        int i = integer.intValue();
        System.out.println("i = " + i);
        int i1 = Integer.parseInt(s2);
        System.out.println("i1 = " + i1);
    }
}
