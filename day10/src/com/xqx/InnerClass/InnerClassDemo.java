package com.xqx.InnerClass;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 18:25
 * description: 成员内部类 测试
 */
public class InnerClassDemo {
    public static void main(String[] args) {
         Outer.Inner inner = new Outer().new Inner();
         inner.show();
         Outer outer = new Outer();
         outer.show();
    }
}
