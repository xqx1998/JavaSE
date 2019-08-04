package com.xqx.listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 18:33
 * description:
 */
public class ListDemo1 {
    public static void main(String[] args) {
        //创建list集合
        List<String> list = new ArrayList<String>();
        //添加 元素
        list.add("xing");
        list.add("quan");
        list.add("xiang");
        //创建该集合的迭代器
        // Iterator<String> iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     // System.out.println(iterator.next());
        //     String s = iterator.next();
        //     if (s.equals("xiang")){
        //         list.add("zhang");
        //     }
        // }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("xiang")){
                list.add("zhang");
            }
        }
        System.out.println(list);
    }
}
