package CourseLearn.xqx_3;

public class JumppingDemo {
    //创建一个能够跳高的对象,使用匿名内部类的形式创建一个接口的实现类对象，但是这个实现类没有名字
    static Jumpping j=new Jumpping(){
        @Override
        public void jump() {
            System.out.println("山高猴子跳，水深王八叫");
        }
    };

    //使用匿名内部类创建Animal对象
    static Animal a=new Animal() {
        @Override
        public void eat() {
            System.out.println("只要是动物都能吃");
        }
    };

    public static void main(String[] args) {
        //j表示的就是Jumpping的匿名内部类对象
        j.jump();
        //a表示Animal的一个匿名内部类对象
        a.eat();
    }
}
