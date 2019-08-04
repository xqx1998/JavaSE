package CourseLearn.xqx_6;

public final class Fu {
    private final int age=100;

    public Fu(){}

    public final void method(){
        System.out.println(age);
        //age=200;//final修饰的变量是常量，值不能被改变
    }
}
