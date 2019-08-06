package CourseLearn.xqx_2;

public class Cat extends Animal {

    public int age=20;
    public int weight=50;

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("🐱抓🐭");
    }
}
