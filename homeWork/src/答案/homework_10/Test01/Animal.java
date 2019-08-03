package 答案.homework_10.Test01;
/*          1.抽象方法: run()
			2.默认方法: breathe(),输出"动物会呼吸",同时调用静态方法 eat(),私有方法: sleep()
			3.静态方法: eat(),输出"动物都要吃东西"
			4.私有方法: sleep(),输出"动物都要休息"*/
public interface Animal {
    //1.抽象方法: run()
    void run();

    //2.默认方法: breathe(),输出"动物会呼吸",同时调用静态方法 eat(),私有方法: sleep()
    public default void breathe(){
        System.out.println("动物会呼吸");
        eat();
        sleep();
    }

    //3.静态方法: eat(),输出"动物都要吃东西"
    public static void eat(){
        System.out.println("动物都要吃东西");
    }

    //4.私有方法: sleep(),输出"动物都要休息"
    void sleep(){
        System.out.println("动物都要休息");
    }
}
