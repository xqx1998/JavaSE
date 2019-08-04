package CourseLearn.xqx_5;

/*
    需求：
        1、定义猫类（姓名、年龄成员变量，抓老鼠的方法）
        2、定义狗类（姓名、年龄成员变量、看门的方法）
    分析：
        1、定义一个猫类和狗类的父类Animal
        2、在Animal类中定义name和age，提供get/set方法
        3、定义猫类和狗类继承Animal，声明各自特有的catchMouse和lookDoor方法。
        4、定义测试类进行测试
    测试类：AnimalDemo
        1、创建Cat对象
        2、调用get方法打印猫的名字和年龄，调用catchMouse方法
        3、创建Dog对象
        4、调用get方法打印狗的名字和年龄，调用lookDoor方法

 */
public class AnimalDemo {

    public static void main(String[] args) {
        //1、创建Cat对象
        Cat cat=new Cat("喵星人",7);
        //2、调用get方法打印猫的名字和年龄，调用catchMouse方法
        System.out.println(cat.getName()+","+cat.getAge());
        cat.catchMouse();

        //3、创建Dog对象
        Dog dog=new Dog("金毛",7);
        //4、调用get方法打印狗的名字和年龄，调用lookDoor方法
        System.out.println(dog.getName()+","+dog.getAge());
        dog.lookDoor();
    }
}
