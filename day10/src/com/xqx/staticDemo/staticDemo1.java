package com.xqx.staticDemo;

/**
 * createAuthor£∫xingquanxiang
 * createTime£∫2019/8/2 14:19
 * description:
 */
public class staticDemo1 {
    public static void main(String[] args) {
        Student.setUniversity("Œ‰∫∫¥Û—ß");
        Student student = new Student();
        student.setName("1");
        student.setAge(1);
        System.out.println(student);

        Student student1 = new Student();
        student1.setName("2");
        student1.setAge(2);
        System.out.println(student1);
    }
}
