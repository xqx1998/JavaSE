package CourseLearn.xqx_2;
public class OuterDemo {
    public static void main(String[] args) {
        //创建外部类对象
        Outer outer=new Outer();
        //调用方法获取内部类对象  多态的形式
        Function fun = outer.getInner();//Function fun=new Inner();
        fun.innerShow();



        //创建成员内部类Inner2对象
        Outer.Inner2 inner2=new Outer().new Inner2();
        inner2.inner2Show();

        //创建成员内部类Inner3对象
        Outer.Inner3 inner3=new Outer.Inner3();
        inner3.inner3Show();
        //访问静态成员内部类Inner3的方法
        Outer.Inner3.staticShow();
    }
}
