package com.xqx.InnerClass;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 18:25
 * description: ��Ա�ڲ��� ����
 */
public class InnerClassDemo {
    public static void main(String[] args) {
         Outer.Inner inner = new Outer().new Inner();
         inner.show();
         Outer outer = new Outer();
         outer.show();
    }
}
