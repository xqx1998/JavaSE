package com.xqx.InnerClass;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/2 19:14
 * description:
 */
public class Outer1 {
    private int num = 10;
    public void method(){
        int age = 20;
        class Inner{
            public void show(){
                System.out.println("age = " + age);
                System.out.println("num = " + num);
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
}
