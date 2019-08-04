package CourseLearn.xqx_3;

public class Fu {

    public int age=40;

    public Fu(){
        System.out.println("fu类的空参构造");
    }
    public Fu(int age){
        System.out.println("fu类的带参构造");
    }

    void show(){
        System.out.println("父类中的show方法执行了...");
    }
    public void drink(){
        System.out.println("fu类的method方法");
    }
}
