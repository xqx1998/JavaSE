package com.xqx.inherit;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 10:58
 * description:教师类，继承于人类
 */
public class Teacher extends Person{
    public Teacher() {
        //调用父类空参构造
        super();
    }

    public Teacher(String name, int age) {
        //调用父类有参构造
        super(name, age);
    }
    //本身成员方法
    void teach(){
        System.out.println(getName() + "  "+ getAge());
        System.out.println("用心教育每一位莘莘学子");
    }

    // 重写父类成员方法 子类重写的方法修饰词作用范围不得小于父类  private--->默认--->protect--->public
    // 子类不能直接调用父类成员方法
    @Override
    void speak() {
        super.speak();
        System.out.println("我用心为每一位学子解答");
    }


}
