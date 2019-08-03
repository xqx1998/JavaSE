package com.xqx.InnerClass;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 19:23
 * description:
 */
public class Outer2 {
    public void method(){
       /* new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/
        Inter inter = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        inter.show();
        inter.show();
    }
}
