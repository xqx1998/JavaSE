package com.xqx.A01_hashSet.Test;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 19:00
 * description:
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //�жϵ�ַ�Ƿ���ͬ  ��ͬ�򷵻�true
        if (this == o) return true;
        //���ȽϵĶ����ȽϵĶ������ڱ��� �򷵻�false
        if (o == null || getClass() != o.getClass()) return false;
        //ǿ��ת��
        Student student = (Student) o;
        //�Ƚϳ�Ա�����Ƿ����
        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
