package CourseLearn.xqx_1;

public class ExtendsDemo01 {

    public static void main(String[] args) {
        //创建父类对象
        Fu fu=new Fu();
        //调用show方法
        fu.show();

        //创建子类对象
        Zi zi=new Zi();
        //调用继承自父类的show方法
        zi.show();
    }
}
