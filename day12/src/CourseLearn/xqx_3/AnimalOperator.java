package CourseLearn.xqx_3;
/*
    饲养员类，操作动物吃东西
 */
public class AnimalOperator {
    //操作动物吃东西
    public void useAnimal(Animal a){
        /*  如果传递的是匿名内部类对象，那么变量a的值就是：
            Animal a=new Animal() {
                @Override
                public void eat() {
                    System.out.println("🐶吃骨头");
                }
            }
         */
        a.eat();
    }
}
