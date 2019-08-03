package com.xqx_3;
/*
    成员变量：
        String name;
        int age;
    成员方法：
        study()
        doHomework()
 */
public class Student {
    //定义成员变量
    String name;
    int age;

    //定义成员方法
    public void study(String subject){
        System.out.println("好好学习，将来努力工作:"+subject);
    }
    public void doHomework(){
        System.out.println("好好练习，将来挣钱");
    }
}
