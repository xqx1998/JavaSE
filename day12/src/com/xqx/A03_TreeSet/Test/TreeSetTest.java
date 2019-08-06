package com.xqx.A03_TreeSet.Test;

import java.util.TreeSet;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 20:14
 * description:/*
 *     存储学生对象并遍历，创建集合使用无参构造方法
 *     要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<Student> studentTreeSet = new TreeSet<Student>();
        //添加元素
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
        //遍历元素
        studentTreeSet.forEach(i-> System.out.println(i));
    }
}
