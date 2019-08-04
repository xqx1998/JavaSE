package CourseLearn.xqx_6;

public class Student {

    public int age;
    public static String school;

    public void method1(){
        //访问成员变量
        age=10;
        school="传智大学";
        //访问成员方法
        method2();
        show();
    }
    public void method2(){}


    public static void show(){
        System.out.println("show");
    }

    public static void main(String[] args) {
        //访问成员变量
       // age=20; //静态方法中不能访问非静态的成员变量
        school="传智大学";

        //访问成员方法
        //method1();//静态方法中不能访问非静态的成员方法
        show();

        //如果非要访问非静态的内容，只能通过创建对象，使用对象来调用
        Student s=new Student();
        s.age=20;
        s.method1();
    }
}
