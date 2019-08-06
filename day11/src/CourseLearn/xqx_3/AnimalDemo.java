package CourseLearn.xqx_3;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫对象，使用父类接收
        Animal a = new Cat();
        //访问成员变量
        System.out.println(a.age);
        //调用成员方法
        a.eat();
        a.show();

        //创建狗对象
        Animal d=new Dog();
        d.eat();
        d.show();
    }
}
