package com.xqx.listIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 19:26
 * description:
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //�������϶���
        List<String> list = new ArrayList<String>();

        //���Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");

        // �������ϣ��õ�ÿһ��Ԫ�أ��ж�����"world"���Ԫ�أ�
        // ����У������һ��"javaee"Ԫ��
       ListIterator<String> it = list.listIterator();

       while (it.hasNext()) {
           String s = it.next();
           if(s.equals("world")) {
               it.add("javaee");
           }
       }

        //������϶���
        System.out.println(list);
    }
}
