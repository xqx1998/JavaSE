package CourseLearn.xqx_5;

public class FunctionDemo {
    public static void main(String[] args) {

        //多态的形式创建接口类型的对象
        Function f1=new Person();
        f1.breath();

        Function f2=new Plant("绿箩");
        f2.breath();


        Person p=new Person();
        p.show();
        Function.method();

        System.out.println(p.toString());
        int i = p.hashCode();
        System.out.println("i = " + Integer.toHexString(i));

    }
}
