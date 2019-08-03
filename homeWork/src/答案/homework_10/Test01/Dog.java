package 答案.homework_10.Test01;
/*定义Dog类实现Animal接口,实现抽象方法run(),输出"狗跑得飞快"
		*/
public class Dog implements Animal{

    @Override
    public void run() {
        System.out.println("狗跑得飞快");
    }
}
