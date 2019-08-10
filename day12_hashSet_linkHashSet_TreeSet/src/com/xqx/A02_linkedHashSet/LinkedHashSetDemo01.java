package com.xqx.A02_linkedHashSet;

import java.util.LinkedHashSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 19:44
 * description:
 * LinkedHashSet�����ص㣺
 * 1.��ϣ�������ʵ�ֵ�Set�ӿڣ����п�Ԥ��ĵ�������
 * 2.������֤Ԫ������Ҳ����˵Ԫ�صĴ洢��ȡ��˳����һ�µ�
 * 3.�й�ϣ��֤Ԫ��Ψһ��Ҳ����û���ظ���Ԫ��
 */
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        //��������
        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<String>();
        //���Ԫ��
        stringLinkedHashSet.add("xing");
        stringLinkedHashSet.add("quan");
        stringLinkedHashSet.add("xiang");
        stringLinkedHashSet.add("xing");  //��֤Ԫ��Ψһ�ԣ������
        System.out.println("stringLinkedHashSet = " + stringLinkedHashSet);
        //lambda���ʽ�������� Ԫ��
        stringLinkedHashSet.forEach(i-> System.out.println(i));
        System.out.println("-------------------");
        //��ǿforѭ����������Ԫ��
        for (String s:stringLinkedHashSet) {
            System.out.println(s);
        }

    }
}
