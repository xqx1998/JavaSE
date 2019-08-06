package CourseLearn.xqx_3;

public class AnimalDemo {
    public static void main(String[] args) {

        //创建饲养员类，让动物吃东西
        AnimalOperator operator=new AnimalOperator();

        //使用匿名内部类的形式创建Animal的子类对象，
       /* Animal a=new Animal() {
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        };
        operator.useAnimal(a);
        */
       //还可以这么写:
        operator.useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("吃骨头");
            }
        });
    }
}
