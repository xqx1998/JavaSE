package com.xqx.staticDemo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 14:20
 * description:
 */
public class Student {
    private String name;
    private int age;
    //静态修饰的变量被类的所有对象共享
    private static String university;

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

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String university) {
        Student.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ",  university=" +  university +
                '}';
    }
}
