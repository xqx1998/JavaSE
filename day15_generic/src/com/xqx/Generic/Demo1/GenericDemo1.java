package com.xqx.Generic.Demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/9 15:43
 * description:
 */
public class GenericDemo1 {
    public static void main(String[] args) {
        Collection<Object> objects = new ArrayList<>();
        objects.add("java");
        objects.add("hello");
        objects.add("world");
        objects.add(100);

        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
