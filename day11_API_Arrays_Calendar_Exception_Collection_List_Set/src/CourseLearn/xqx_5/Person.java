package CourseLearn.xqx_5;

/**
 * implements：实现
 * 接口的实现类
 */
public class Person implements Function{

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println("呼吸新鲜空气");
    }
}
