package CourseLearn.xqx_1;

public class AnimalDemo {
    public static void main(String[] args) {
       /* //创建猫对象，使用父类接收
        Animal a=new Cat();
        //访问成员变量
        System.out.println(a.age);
        //调用成员方法
        a.eat();

        ((Cat) a).playGame();*/

       //创建饲养员对象
        AnimalOperator operator=new AnimalOperator();
        //创建喵对象
        Cat cat=new Cat();
        //使用猫，让猫吃东西
        operator.useAnimal(cat);


        //创建狗对象
        Dog dog=new Dog();
        //使用狗，让狗吃东西
        operator.useAnimal(dog);

        //创建🐷对象
        Pig pig=new Pig();
        //使用🐷，让🐷吃东西
        operator.useAnimal(pig);
    }
}
