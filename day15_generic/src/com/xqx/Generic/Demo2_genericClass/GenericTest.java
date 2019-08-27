package com.xqx.Generic.Demo2_genericClass;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/9 15:55
 * description:
 */
public class GenericTest {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.setT("Hello");
        System.out.println(g1.getT());
        System.out.println("-------------");
        Generic<Integer> integerGeneric = new Generic<>();
        integerGeneric.setT(100);
        System.out.println(integerGeneric.getT());
        System.out.println("----------------");
        Generic<Student> studentGeneric = new Generic<>();
        studentGeneric.setT(new Student("xingquanxiang",21));
        System.out.println(studentGeneric.getT());
    }
}
