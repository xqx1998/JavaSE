package com.xqx_6;

public class User {
    //1、private修饰的成员变量
    private String name;
    private int age;
    //2、空参构造和有参构造方法  alt+insert/ins

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //3、public修饰的get/set方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //为了打印方便，使用idea生成一个toString方法  快捷键：alt+insert/ins
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
