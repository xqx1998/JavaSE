package CourseLearn.xqx_2_Collection;

/**
 * 饲养员类，操作动物
 */
public class AnimalOperator {

    public void useAnimal(Animal a) { //Animal a=new Cat(); Animal a=new Dog()
        a.eat();
        //需求：如果这个动物是猫，那么调用猫的特有方法playGame()
        //难点：如何判断a是Cat类型，只有当变量a是Cat类型才可以将a强转成Cat。
        if(a instanceof Cat){
            Cat c= (Cat) a;
            c.playGame();
        }
    }
}
