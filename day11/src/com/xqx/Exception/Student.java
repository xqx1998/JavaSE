package com.xqx.Exception;

import com.xqx.LlistTest.AgeException;
import com.xqx.LlistTest.CheckAgeException;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 21:12
 * description:
 */
public class Student {
    private String name;
    private int age;

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
