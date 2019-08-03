package 答案.homework_10.Test03;
/*定义一个接口Animal,包含:
			1.抽象方法:run()
			2.默认方法: sleep(),输出"动物会休息"

		定义一个Dog类,实现Animal接口,
					实现抽象方法:run(),输出"如脱缰的野狗一样奔跑"
					定义自己特有的方法: eat(),输出"狗吃屎"

		定义一个Cat类,实现Animal接口,
					实现抽象方法:run(),输出"奔跑的猫毛都被撸秃了"
					定义自己特有的方法: catchMouse(),输出"猫抓老鼠"

		在测试类中定义如下方法:
		public static void printAnimal(Animal a){}
		要求在方法中编写代码实现如下功能:
			在主方法中:
			1. Animal b = new Dog();
				调用方法printAnimal()传入b对象,能在控制台输出:
					如脱缰的野狗一样奔跑
					动物会休息
					狗吃屎

			1. Animal c = new Cat();
				调用方法printAnimal()传入c对象,能在控制台输出:
					奔跑的猫毛都被撸秃了
					动物会休息
					猫抓老鼠*/
public class Demo3 {
    public static void main(String[] args) {
        Animal b = new Dog();
        printAnimal(b);

        Animal c = new Cat();
        printAnimal(c);
    }

    public static void printAnimal(Animal a){
        //开始就要判断传入的到底是Dog还是Cat
        if(a instanceof Dog){
            //a本质是Dog
            Dog dog = (Dog) a;
            dog.run();
            dog.sleep();
            dog.eat();
        }else{
            //a本质是Cat
            Cat cat = (Cat) a;
            cat.run();
            cat.sleep();
            cat.catchMouse();
        }
    }
}
