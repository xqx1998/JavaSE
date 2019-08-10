package CourseLearn.xqx_3_ArrayListt;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("🐱吃🐟");
    }

    @Override
    public void show() {
        System.out.println("子类中重写了show方法");
    }
}
