package homework.homework_5;

import java.util.TreeSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 20:14
 * description:/*
 *     �洢ѧ�����󲢱�������������ʹ���޲ι��췽��
 *     Ҫ�󣺰��������С��������������ͬʱ��������������ĸ˳������
 *
 */
public class Test1 {
    public static void main(String[] args) {
        // ��������
        TreeSet<Student1> studentTreeSet = new TreeSet<Student1>();
        //���Ԫ��
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
        //����Ԫ��
        studentTreeSet.forEach(i-> System.out.println(i));
    }
}
