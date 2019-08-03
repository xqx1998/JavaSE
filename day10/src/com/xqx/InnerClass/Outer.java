package com.xqx.InnerClass;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/2 18:24
 * description:
 */
public class Outer {
    private int num = 10;
    public class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    private class In{
        public int age = 18;
        public void show(){
            System.out.println("age = " + age);
        }
    }

    public void show(){
        In in = new In();
        in.show();
        System.out.println("in.age = " + in.age);
    }
}
