package Lambda±Ì¥Ô Ω.Demo02;

/**
 * createAuthor£∫xingquanxiang
 * createTime£∫2019/8/3 19:54
 * description:
 */
public class Student {
    private String name;
    private int age=1;

    public Student() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
