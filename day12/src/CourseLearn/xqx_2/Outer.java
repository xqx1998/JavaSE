package CourseLearn.xqx_2;

public class Outer {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //定义private成员内部类
    private class Inner implements Function{

        @Override
        public void innerShow(){
            System.out.println("成员内部类的innerShow方法被访问了...");
        }
    }

    //一般会对外提供一个方法，返回内部类对象
    public Inner getInner(){
        return new Inner();
    }


    //定义一个public修饰的成员内部类
    public class Inner2{
        public void inner2Show(){
            System.out.println("成员内部类Inner2的inner2Show方法被访问了...");
        }
    }

    //定义静态的成员内部类，public修饰
    public static class Inner3{
        public void inner3Show(){
            System.out.println("成员内部类Inner3的inner3Show方法被访问了...");
        }
        public static void staticShow(){
            System.out.println("静态成员内部类Inner3的staticShow方法被访问了...");
        }
    }
}
