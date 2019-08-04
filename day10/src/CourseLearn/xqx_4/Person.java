package CourseLearn.xqx_4;
/*
    案例1：老师类和学生类
        需求：
            1、定义老师类（姓名、年龄成员变量，教书的方法）
            2、定义学生类（姓名、年龄成员变量、学习的方法）
        分析：
            1、定义一个老师类和学生类的父类Person
            2、在Person类中定义name和age，提供get/set方法
            3、定义老师类和学生类继承Person类型，声明各自特有的teach和study方法。
            4、定义测试类进行测试
        测试类：PersonDemo
            1、创建Teacher对象，调用set方法赋值
            2、调用get方法打印老师的名字和年龄，调用teach方法
            3、创建Student对象，调用set方法赋值
            4、调用get方法打印学生的名字和年龄，调用study方法
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
}
