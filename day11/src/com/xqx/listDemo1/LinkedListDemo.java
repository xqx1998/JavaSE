package com.xqx.listDemo1;

import java.util.LinkedList;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 22:03
 * description:
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //�����б����
        LinkedList <String> linkedList = new LinkedList<String>();
        //���Ԫ��
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println("linkedList = " + linkedList);
        //��ȡָ��λ�õ�Ԫ��
        System.out.println("linkedList.get(2) = " + linkedList.get(2));
        //��ȡ�б��е�һ��Ԫ��
        System.out.println("linkedList.getFirst() = " + linkedList.getFirst());
        //��ȡ�б������һ��Ԫ��
        System.out.println("linkedList.getLast() = " + linkedList.getLast());
        //���б�ͷ����ָ����Ԫ��
        linkedList.addFirst("0");
        //���б�ĩβ����ָ����Ԫ��
        linkedList.addLast("5");
        System.out.println("linkedList = " + linkedList);
        //���б�ָ��λ��ɾ�������ض�Ӧ��Ԫ��
        System.out.println("linkedList.remove(4) = " + linkedList.remove(4));
        System.out.println("linkedList = " + linkedList);
        //�ڱ���ɾ�������ص�һ��Ԫ��
        System.out.println("linkedList.removeFirst() = " + linkedList.removeFirst());
        //���б���ɾ�����������һ��Ԫ��
        System.out.println("linkedList.removeLast() = " + linkedList.removeLast());
        System.out.println("linkedList = " + linkedList);


    }
}
