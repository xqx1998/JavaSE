package com.xqx_5;
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
    private String name;
    private int age;

    //给私有的成员变量提供public修饰的get和set方法用于对成员变量赋值和取值
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<0 || age>120){
            System.err.println("你设置的年龄不合法！");
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }

    //定义成员方法
    public void study(String subject){
        System.out.println("好好学习，将来努力工作:"+subject);
    }
    public void doHomework(){
        System.out.println("好好练习，将来挣钱");
    }
}
