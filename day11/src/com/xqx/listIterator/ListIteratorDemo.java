package com.xqx.listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 19:26
 * description:
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<String>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        // 遍历集合，得到每一个元素，判断有无"world"这个元素，
        // 如果有，就添加一个"javaee"元素
       ListIterator<String> it = list.listIterator();

       while (it.hasNext()) {
           String s = it.next();
           if(s.equals("world")) {
               it.add("javaee");
           }
       }

        //输出集合对象
        System.out.println(list);
    }
}
