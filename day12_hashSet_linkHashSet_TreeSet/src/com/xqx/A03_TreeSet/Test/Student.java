package com.xqx.A03_TreeSet.Test;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 20:14
 * description:
 */
public class Student implements Comparable<Student>{
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
        //判断地址是否相同  相同则返回true
        if (this == o) return true;
        //若比较的对象或比较的对象不属于本类 则返回false
        if (o == null || getClass() != o.getClass()) return false;
        //强制转换
        Student student = (Student) o;
        //比较成员变量是否相等
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

   /* @Override
    public int compareTo(Student o) {
        if (age>o.age) return 1;
        if (age<o.age) return -1;
        if (age==o.age){
            int length = 0;
            int flag = 0;
            if (name.length()<=o.name.length()) {
                length = name.length();
                flag = -1;
            }
            else {
                length = o.name.length();
                flag = 1;
            }
            for (int i = 0; i < length; i++) {
                if(name.charAt(i)==o.name.charAt(i))
                    continue;
                else if (name.charAt(i)>o.name.charAt(i))
                    return 1;
                else
                    return -1;
            }
            return flag;
        }
        return 0;
    }*/

    @Override
    public int compareTo(Student o) {
        int num = this.age - o.age;
        int num2 = num==0 ? this.name.compareTo(o.name):num;
        return num2;
    }
}
