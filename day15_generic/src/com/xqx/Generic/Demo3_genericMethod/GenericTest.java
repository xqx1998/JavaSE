package com.xqx.Generic.Demo3_genericMethod;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/9 16:07
 * description:
 */
public class GenericTest {
    public static void main(String[] args) {
        new Generic<String>().show("Hello");
        new Generic<Integer>().show(100);
        new Generic<Double>().show(12.009);
        new Generic<Boolean>().show(1==2);
        new Generic<Character>().show('K');
        System.out.println("--------");
        Generic generic = new Generic();

        generic.show("Hello");
        generic.show(100);
        generic.show(12.009);
        generic.show(1==2);
        generic.show('K');

        generic.show(new Student("xingquaniang",21));
    }
}
