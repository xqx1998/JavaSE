package CourseLearn.xqx_4;

import com.itheima_4.Dog;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫对象，使用父类接收
        Animal a = new Cat();
        //访问成员变量
        System.out.println(a.age);
        //调用成员方法
        a.eat();
        a.show();

        Jumpping jumpping = new Cat();
        jumpping.jump();
    }
}
