package CourseLearn.xqx_2_Collection;

public class Zi extends Fu {

    public int age=20;

    public Zi(){
        System.out.println("zi类的空参构造");
    }
    public Zi(int age){
        //需求；访问父类的有参构造？
        super(age);
        System.out.println("zi类的带参构造");
    }

    public void method(){
        int age=10;

        System.out.println(age);
        //如果要打印当前子类的age=20，该如何输出
        System.out.println(this.age);

        //如果要打印父类的age=40，该如何输出
        System.out.println(super.age);

    }
}
