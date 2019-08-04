package CourseLearn.xqx_1;

public class Student {
    //1、private修饰的成员变量
    private String name;
    private int age;

    //2、空参构造和有参构造
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //3、get和set方法
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
        if(age<0){
            System.out.println("年龄不合法！");
        }else{
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
