package com.xqx.A10_setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 22:18
 * description:Set�����ص㣺
 * �������ظ�Ԫ�صļ���
 * û�д������ķ��������Բ���ʹ����ͨforѭ��
 *  �Լ��ϵĵ���˳�����κα�֤;
 *  �ر��ǣ������ܱ�֤������һ��ʱ���ڱ��ֲ��䡣 ���������nullԪ�ء�
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        Set<String> sets = new HashSet<String>();
        //HashSet��Ԫ��ֵ���մ�С�������
        sets.add("1");
        sets.add("4");
        sets.add("3");
        //�������ظ�Ԫ��
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
