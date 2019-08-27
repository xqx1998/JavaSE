package com.xqx.A11_HashDemo;


/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 22:34
 * description:
 * 哈希值：是JDK根据对象地址或者字符串或者数字算出来的int类型的数值
 *
 * Object类中有public int hashCode() 返回对象的哈希值
 */
public class HashDemo {
    public static void main(String[] args) {
        // 创建学生对象
        Student student = new Student("倖权祥", 21);

        // 同一个对象多次调用 hashCode() 方法返回的值是相同的
        System.out.println("student.hashCode() = " + student.hashCode());
        System.out.println("student.hashCode() = " + student.hashCode());
        System.out.println("----------");

        Student student1 = new Student("zhangyaxing", 22);

        // 默认情况下，不同对象的哈希值是不同的
        // 通过方法重写，可以是不同对象的哈希值相同
        System.out.println("student1.hashCode() = " + student1.hashCode());

        
    }
}
