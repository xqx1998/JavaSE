package com.xqx.abstractDemo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 15:16
 * description: 抽象类
 * 子类必须实现抽象类中所有抽象方法
 * 抽象类中可以有具体方法
 * 成员变量 可以是变量 也可以是常量
 * 有构造方法，但是不能实例化 作用：用于子类访问父类数据的初始化
 * 构造方法若没有创建，jvm也会赠送一个给抽象类
 * 成员方法
 *      可以有抽象方法：限定子类必须完成某些动作
 *      也可以有飞抽象方法：提高代码复用性
 */
public abstract class Animal {
    private String city = "beijing";
    private final int age = 20;

    public void show(){
        city = "yunnan";
        // age = 18;
        System.out.println("city="+city+"  age="+age);
    }

    public abstract void eat();
}
