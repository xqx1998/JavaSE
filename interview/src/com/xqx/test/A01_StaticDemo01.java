package com.xqx.test;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/10 11:49
 * description:static 变量在 Java 中是属于类的，它在所有的实例中的值是一样的。当类被 Java 虚
 * 拟机载入的时候，会对static变量进行初始化。如果你的代码尝试不用实例来访问非static
 * 的变量，编译器会报错，因为这些变量还没有被创建出来，还没有跟任何实例关联上
 *
 *  结：static 环境中不可以访问非 static 变量
 */
public class A01_StaticDemo01 {
    private int num = 0;
    public static void main(String[] args) {
        // static 环境中不可以访问非 static 变量
        // System.out.println(num);
    }
}
