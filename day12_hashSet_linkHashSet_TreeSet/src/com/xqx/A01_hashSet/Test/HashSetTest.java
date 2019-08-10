package com.xqx.A01_hashSet.Test;

import java.util.HashSet;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 19:10
 * description:
 *
 *     需求：
 *         创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 *         要求：学生对象的成员变量值相同，我们就认为是同一个对象
 *
 *     思路：
 *         1:定义学生类
 *         2:创建HashSet集合对象
 *         3:创建学生对象
 *         4:把学生添加到集合
 *         5:遍历集合(增强for)
 *
 */
public class HashSetTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Student> studentHashSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"位学生信息：");
            Student student = new Student();
            System.out.println("姓名:");
            student.setName(scanner.next());
            System.out.println("年龄：");
            student.setAge(scanner.nextInt());
            studentHashSet.add(student);
        }
        System.out.println("studentHashSet = " + studentHashSet);
        studentHashSet.forEach(student-> System.out.println(student));
    }
}
