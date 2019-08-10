package CourseLearn.xqx_5;

import java.util.Objects;

public class Person {

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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法
    @Override
    public boolean equals(Object o) {
        //比较当前对象和传进来的对象地址值是否一样，如果以及就为true。
        if (this == o) return true;
        //判断当前对象的类型和传进来的对象类型是否一样。如果不一样，后面就不能将o转换成Person
//        if (o == null || getClass() != o.getClass()) return false;
        //等价于这种写法
        if(o==null || !(o instanceof Person)){
            return false;
        }
        //将传进来的对象转换成Person类型
        Person person = (Person) o;
        //比较年龄和姓名
        return age == person.age &&
                Objects.equals(name, person.name);
    }

}