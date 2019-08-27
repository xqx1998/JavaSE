package com.xqx_3;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s=new Student();
        //访问成员变量
        //赋值
        s.name="菜虚昆";
        s.age=20;

        //打印
        System.out.println(s.name);
        System.out.println(s.age);

        //访问成员方法
        s.study("鸡你太美");
        s.doHomework();

        //Student是一个引用数据类型，引用数据类型的对象需要使用new关键字来创建。
        System.out.println(s);//全类名@地址值：com.xqx_2_Collection.Student@6b71769e

//        Student s2=new Student();
        Student s2=s;

        s2.name="吴亦凡";
        System.out.println(s.name);//菜虚昆
        System.out.println(s2.name);//吴亦凡

        s2.study("大碗宽面");

    }
}
