package com.xqx.listDemo1;

import java.util.LinkedList;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 22:03
 * description:
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建列表对象
        LinkedList <String> linkedList = new LinkedList<String>();
        //添加元素
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println("linkedList = " + linkedList);
        //获取指定位置的元素
        System.out.println("linkedList.get(2) = " + linkedList.get(2));
        //获取列表中第一个元素
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        //获取列表中最后一个元素
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        //在列表开头插入指定的元素
        linkedList.addFirst("0");
        //在列表末尾插入指定的元素
        linkedList.addLast("5");
        System.out.println("linkedList = " + linkedList);
        //在列表指定位置删除并返回对应的元素
        System.out.println("linkedList.remove(4) = " + linkedList.remove(4));
        System.out.println("linkedList = " + linkedList);
        //在表中删除并返回第一个元素
        System.out.println("linkedList.removeFirst() = " + linkedList.removeFirst());
        //在列表中删除并返回最后一个元素
        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());
        System.out.println("linkedList = " + linkedList);


    }
}
