package 答案.homework_10.Test01;
/*定义一个接口Animal,包含:
			1.抽象方法: run()
			2.默认方法: breathe(),输出"动物会呼吸",同时调用静态方法 eat(),私有方法: sleep()
			3.静态方法: eat(),输出"动物都要吃东西"
			4.私有方法: sleep(),输出"动物都要休息"

		定义Dog类实现Animal接口,实现抽象方法run(),输出"狗跑得飞快"
		在测试类中创建Dog类的对象d,通过对象调用run()方法和breathe()方法,打印出如下效果:
			狗跑得飞快
			动物会呼吸
			动物都要吃东西
			动物都要休息*/
public class Demo1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.breathe();
    }



}
