package com.xqx.Generic.Demo4_genericInterface;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/9 16:30
 * description:
 */
public class GenericImpl<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
