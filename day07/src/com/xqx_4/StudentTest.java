package com.xqx_4;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        Student s=new Student();
        //访问成员变量
        System.out.println(s);//地址值
        //赋值
        s.setName("菜虚昆");
        s.setAge(20);
//        s.setAge(-20);
        //打印
        System.out.println(s.getName());
        System.out.println(s.getAge());
        //访问成员方法
        s.study("鸡你太美");
        s.doHomework();
    }
}
