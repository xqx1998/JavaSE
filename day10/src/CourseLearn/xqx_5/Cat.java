package CourseLearn.xqx_5;

public class Cat extends Animal {

    private String color;

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age,String color) {
        super(name,age);
        this.color=color;
    }

    public void catchMouse(){
        System.out.println("喵星人抓老鼠");
    }
}
