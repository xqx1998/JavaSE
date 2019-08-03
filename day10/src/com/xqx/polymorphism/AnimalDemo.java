package com.xqx.polymorphism;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 14:38
 * description: 分析多的好处与弊端
 * 好处，父类方法易扩展
 * 弊端，子类特有的方法不能直接调用
 */
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal cat = new Cat();
        ao.eat(cat);

        Dog dog = new Dog();
        ao.eat(dog);

        //向上转型 子类对象赋给父类引用
        Animal pig = new Pig();
        ao.eat(pig);

        pig.eat();
        //向下转型 父类引用赋给子类引用
        Pig p = (Pig) pig;
        p.play();

        //Exception in thread "main" java.lang.ClassCastException
        //猪不能强转为猫
        Cat c = (Cat) pig;
        c.eat();
    }
}
