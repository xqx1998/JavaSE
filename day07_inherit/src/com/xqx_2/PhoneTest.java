package com.xqx_2;

public class PhoneTest {
    public static void main(String[] args) {
        //创建phone对象
        Phone p=new Phone();
        //访问成员变量
        //打印成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        //给成员变量赋值
        p.brand="华为";
        p.price=2999;
        System.out.println(p.brand);
        System.out.println(p.price);
        //访问成员方法
        p.call();
        p.sendMessage();
    }
}
