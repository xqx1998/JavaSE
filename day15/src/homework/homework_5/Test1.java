package homework.homework_5;

import java.util.TreeSet;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 20:14
 * description:/*
 *     存储学生对象并遍历，创建集合使用无参构造方法
 *     要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 *
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<Student1> studentTreeSet = new TreeSet<Student1>();
        //添加元素
        Student1 student = new Student1("xingquanxiang", 19);
        Student1 student1 = new Student1("zhangyaxing", 19);
        Student1 student2 = new Student1("xing", 19);
        Student1 student3 = new Student1("heyonghui", 21);
        Student1 student4 = new Student1("heghui", 23);
        Student1 student5 = new Student1("ieyonghui", 21);
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
