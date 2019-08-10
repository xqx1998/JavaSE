package CourseLearn.xqx_5;

public class PersonDemo {

    public static void main(String[] args) {
        Person p1=new Person("杨锌怒",20);
        Person p2=new Person("杨锌怒",20);

        System.out.println(p1);

        System.out.println(p1.equals(p2));
    }
}
