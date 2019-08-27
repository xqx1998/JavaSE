package com.xqx.A10_setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 22:18
 * description:Set集合特点：
 * 不包含重复元素的集合
 * 没有带索引的方法，所以不能使用普通for循环
 *  对集合的迭代顺序不作任何保证;
 *  特别是，它不能保证订单在一段时间内保持不变。 这个类允许null元素。
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<String>();
        //HashSet中元素值按照从小到大放置
        sets.add("1");
        sets.add("4");
        sets.add("3");
        //不包含重复元素
        sets.add("3");
        sets.add("5");
        sets.add("0");
        sets.add("0");
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("sets.toString()="+sets.toString());
    }
}
