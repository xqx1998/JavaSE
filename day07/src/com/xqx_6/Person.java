package com.xqx_6;

public class Person {
    //1、private修饰的成员变量
    private String name;
    private int age;
    //2、空参构造和有参构造方法
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    //3、public修饰的get/set方法
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
