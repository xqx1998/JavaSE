package com.xqx.A01_hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SplittableRandom;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 17:03
 * description:
 * HashSet集合概述和特点
 * 1.底层数据结构是哈希表
 * 2.对集合的迭代顺序不作任何保证，也就是说不保证存储和取出的元素顺序一致
 * 3.没有带索引的方法，所以不能使用普通for循环遍历
 * 4.由于是set集合，所以是不包含重复元素的集合
 */
public class hashSetDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        HashSet<String> hs = new HashSet<String>();

        // 添加元素
        hs.add("xing");
        hs.add("quan");
        hs.add("xiang");

        // 遍历 lambda表达式
        hs.forEach(i -> System.out.println(i));

        // 增强for循环
        for (String s:hs) {
            System.out.println(s);
        }
    }

}
