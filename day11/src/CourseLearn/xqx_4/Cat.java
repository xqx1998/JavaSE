package CourseLearn.xqx_4;

public class Cat extends Animal implements Jumpping{

    @Override
    public void eat() {
        System.out.println("🐱吃🐟");
    }

    @Override
    public void show() {
        System.out.println("子类中重写了show方法");
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高！！");
    }
}
