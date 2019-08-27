package com.xqx.A09_LlistTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 19:56
 * description:
 */
public class ListTest1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"位学生的信息：");
            Student student = new Student();
            System.out.println("姓名：");
            student.setName(scanner.next());
            System.out.println("年龄：");
            try {
                student.setAge(scanner.nextInt());
            } catch (AgeException e) {
                e.printStackTrace();
            }
            list.add(student);
        }
        System.out.println(list);
        //迭代器遍历 有并发操作异常 ConcurrentModificationException
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------");
        //普通for循环遍历：
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("--------------");
        //增强foi循环遍历： 原理是利用迭代器遍历 有并发操作异常
        for (Student s:list) {
            System.out.println(s);
        }
        System.out.println("--------------");
    }
}
