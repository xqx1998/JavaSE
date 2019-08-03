package com.xqx.inherit;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 10:58
 * description: 人类
 */
public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    //默认成员方法，子类可直接调用，但修饰词范围不得小于本成员方法范围
    void speak(){
        System.out.println("我叫"+getName());
        eat();
    }
    //私有成员方法，子类无法调用,只能在本类中使用
    private void eat(){
        System.out.println("我叫"+getName()+"  我很能吃");
    }


}
