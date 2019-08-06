package com.xqx.A03_TreeSet.Test2;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 21:16
 * description:
 *     需求：
 *         用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
 *         要求：按照总分从高到低出现
 *
 *     思路：
 *         1:定义学生类
 *         2:创建TreeSet集合对象，通过比较器排序进行排序
 *         3:创建学生对象
 *         4:把学生对象添加到集合
 *         5:遍历集合
 */
public class TreeSetTest {
    public static void main(String[] args) {
        // 创建TreeSet集合对象，通过比较器进行排序
        TreeSet<Student> studentTreeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num  = (int) ((o2.getTotalScore()-o1.getTotalScore())*10);
                int num2 = num==0 ? (int)((o2.getChineseScore()-o1.getChineseScore())*10) : num;
                int num3 = num==0 ? (int)((o2.getMathScore()-o1.getMathScore())*10) : num2;
                return num3;
            }
        });

        // 创建学生对象
        studentTreeSet.add(new Student("风清扬",89,87));
        studentTreeSet.add(new Student("独孤剑",88.5f,87.6f));
        studentTreeSet.add(new Student("东方胜", 89.5f, 87));
        studentTreeSet.add(new Student("厉胜男", 89, 89.8f));
        studentTreeSet.add(new Student("令狐冲", 99.5f, 100));
        studentTreeSet.add(new Student("令狐冲", 99.5f, 100));

        System.out.println("studentTreeSet = " + studentTreeSet);
        // 遍历元素
        studentTreeSet.forEach(student -> System.out.println(student));

    }

}
