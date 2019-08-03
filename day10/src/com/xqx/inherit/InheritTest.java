package com.xqx.inherit;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 11:03
 * description:
 */
public class InheritTest {
    public static void main(String[] args) {
        Person person = new Person("老阳", 18);
        person.speak();
        System.out.println("-----------------");

        Teacher teacher = new Teacher();
        teacher.setName("风清扬");
        teacher.setAge(99);
        teacher.teach();
        teacher.speak();
        System.out.println("-----------------");

        Teacher teacher1 = new Teacher("林青霞", 22);
        teacher1.teach();
        teacher.speak();
        System.out.println("-----------------");

        Student student = new Student();
        student.setName("令狐冲");
        student.setAge(18);
        student.learn();

        System.out.println("-----------------");
        Student student1 = new Student("倖权祥", 18, 99);
        student1.learnScore();

    }
}
