package com.xqx.A03_TreeSet.Test;

import java.util.TreeSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 20:14
 * description:/*
 *     �洢ѧ�����󲢱�������������ʹ���޲ι��췽��
 *     Ҫ�󣺰��������С��������������ͬʱ��������������ĸ˳������
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // ��������
        TreeSet<Student> studentTreeSet = new TreeSet<Student>();
        //���Ԫ��
        Student student = new Student("xingquanxiang", 19);
        Student student1 = new Student("zhangyaxing", 19);
        Student student2 = new Student("xing", 19);
        Student student3 = new Student("heyonghui", 21);
        Student student4 = new Student("heghui", 23);
        Student student5 = new Student("ieyonghui", 21);
        studentTreeSet.add(student);
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        studentTreeSet.add(student4);
        studentTreeSet.add(student5);
        //����Ԫ��
        studentTreeSet.forEach(i-> System.out.println(i));
    }
}
