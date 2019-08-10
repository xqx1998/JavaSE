package com.xqx.A03_TreeSet;

import java.util.TreeSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 20:04
 * description:
 *  TreeSet�����ص�
 *         1:Ԫ�����������˳����ָ�洢��ȡ����˳�򣬶��ǰ���һ���Ĺ���������򣬾�������ʽȡ���ڹ��췽��
 *             TreeSet()��������Ԫ�ص���Ȼ�����������
 *             TreeSet(Comparator comparator) ������ָ���ıȽ�����������
 *         2:û�д������ķ��������Բ���ʹ����ͨforѭ������
 *         3:������Set���ϣ����Բ������ظ�Ԫ�صļ���
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(4);
        integers.add(2);
        integers.add(7);
        integers.add(10);
        //lambda���ʽ����
        integers.forEach(integer -> System.out.print(integer+"  "));
    }
}
