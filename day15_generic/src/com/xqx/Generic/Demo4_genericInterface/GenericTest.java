package com.xqx.Generic.Demo4_genericInterface;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 16:32
 * description:
 */
public class GenericTest {
    public static void main(String[] args) {
        GenericImpl<String> objectGeneric = new GenericImpl<>();
        objectGeneric.show("Hello");
    }
}
