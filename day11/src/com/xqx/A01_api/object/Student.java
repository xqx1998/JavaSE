package com.xqx.A01_api.object;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 9:50
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
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public boolean equals(Object o) {
        *//*
            this  --> s
            o     --> s1
         *//*
        //�Ƚϵ�ַ�Ƿ���ͬ��������ͬ��ֱ�ӷ��� true
        if (this == o) return true;

        //�жϲ����Ƿ�Ϊnull
        //�ж����������Ƿ�������ͬһ����
        if (o == null || getClass() != o.getClass()) return false;
        //����ת��
        Student student = (Student) o;
        // �ж������Ƿ���� ������ȣ�ֱ�ӷ���false
        if (age != student.age) return false;
        //�ж������Ƿ�ǿ� ���� �򷵻������ȽϺ��booleanֵ ������
        return name != null ? name.equals(student.name) : student.name == null;

    }*/

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Student student = (Student)obj;
        if (this.age!=student.age) return false;
        return this.name != null ? this.name.equals(student.name) : student.name==null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
