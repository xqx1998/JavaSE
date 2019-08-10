package com.xqx.A01_hashSet.Test;

import java.util.HashSet;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 19:10
 * description:
 *
 *     ����
 *         ����һ���洢ѧ������ļ��ϣ��洢3��ѧ������ʹ�ó���ʵ���ڿ���̨�����ü���
 *         Ҫ��ѧ������ĳ�Ա����ֵ��ͬ�����Ǿ���Ϊ��ͬһ������
 *
 *     ˼·��
 *         1:����ѧ����
 *         2:����HashSet���϶���
 *         3:����ѧ������
 *         4:��ѧ����ӵ�����
 *         5:��������(��ǿfor)
 *
 */
public class HashSetTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> studentHashSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("�������"+(i+1)+"λѧ����Ϣ��");
            Student student = new Student();
            System.out.println("����:");
            student.setName(scanner.next());
            System.out.println("���䣺");
            student.setAge(scanner.nextInt());
            studentHashSet.add(student);
        }
        System.out.println("studentHashSet = " + studentHashSet);
        studentHashSet.forEach(student-> System.out.println(student));
    }
}
