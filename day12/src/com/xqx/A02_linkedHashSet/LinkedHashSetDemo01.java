package com.xqx.A02_linkedHashSet;

import java.util.LinkedHashSet;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 19:44
 * description:
 * LinkedHashSet集合特点：
 * 1.哈希表和链表实现的Set接口，具有可预测的迭代次序
 * 2.由链表保证元素有序，也就是说元素的存储和取出顺序是一致的
 * 3.有哈希表保证元素唯一，也就是没有重复的元素
 */
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        //创建集合
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<String>();
        //添加元素
        stringLinkedHashSet.add("xing");
        stringLinkedHashSet.add("quan");
        stringLinkedHashSet.add("xiang");
        stringLinkedHashSet.add("xing");  //保证元素唯一性，不添加
        System.out.println("stringLinkedHashSet = " + stringLinkedHashSet);
        //lambda表达式遍历集合 元素
        stringLinkedHashSet.forEach(i-> System.out.println(i));
        System.out.println("-------------------");
        //增强for循环遍历集合元素
        for (String s:stringLinkedHashSet) {
            System.out.println(s);
        }

    }
}
