package com.xqx.A03_TreeSet.Test2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 21:16
 * description:
 *     ����
 *         ��TreeSet���ϴ洢���ѧ����Ϣ(���������ĳɼ�����ѧ�ɼ�)���������ü���
 *         Ҫ�󣺰����ִܷӸߵ��ͳ���
 *
 *     ˼·��
 *         1:����ѧ����
 *         2:����TreeSet���϶���ͨ���Ƚ��������������
 *         3:����ѧ������
 *         4:��ѧ��������ӵ�����
 *         5:��������
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // ����TreeSet���϶���ͨ���Ƚ�����������
        TreeSet<Student> studentTreeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num  = (int) ((o2.getTotalScore()-o1.getTotalScore())*10);
                int num2 = num==0 ? (int)((o2.getChineseScore()-o1.getChineseScore())*10) : num;
                int num3 = num==0 ? (int)((o2.getMathScore()-o1.getMathScore())*10) : num2;
                return num3;
            }
        });

        // ����ѧ������
        studentTreeSet.add(new Student("������",89,87));
        studentTreeSet.add(new Student("���½�",88.5f,87.6f));
        studentTreeSet.add(new Student("����ʤ", 89.5f, 87));
        studentTreeSet.add(new Student("��ʤ��", 89, 89.8f));
        studentTreeSet.add(new Student("�����", 99.5f, 100));
        studentTreeSet.add(new Student("�����", 99.5f, 100));

        System.out.println("studentTreeSet = " + studentTreeSet);
        // ����Ԫ��
        studentTreeSet.forEach(student -> System.out.println(student));

    }

}
