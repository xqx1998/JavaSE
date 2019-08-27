package com.xqx_3;

public class StringDemo1 {
    public static void main(String[] args) {
        //演示equals方法
        String s1="abc";
        String s2="abc";
        String s3="cba";
        String s4="ABc";

        //使用==比较
        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println("------------------");
        //比较内容
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false
        System.out.println(s1.equals(s4));//false
        System.out.println("------------------");
        //不区分大小写比较
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s1.equalsIgnoreCase(s3));//false
        System.out.println(s1.equalsIgnoreCase(s4));//true
    }
}
