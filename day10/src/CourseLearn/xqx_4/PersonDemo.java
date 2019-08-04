package CourseLearn.xqx_4;
/*
    测试类：PersonDemo
            1、创建Teacher对象，调用set方法赋值
            2、调用get方法打印老师的名字和年龄，调用teach方法
            3、创建Student对象，调用set方法赋值
            4、调用get方法打印学生的名字和年龄，调用study方法
 */
public class PersonDemo {

    public static void main(String[] args) {
        //1、创建Teacher对象，调用set方法赋值
        Teacher t=new Teacher();
        t.setName("老周");
        t.setAge(20);
        //2、调用get方法打印老师的名字和年龄，调用teach方法
        System.out.println(t.getName()+","+t.getAge());
        t.teach();

        //3、创建Student对象，调用set方法赋值
        Student s=new Student();
        s.setName("杨锌怒");
        s.setAge(20);
        //4、调用get方法打印学生的名字和年龄，调用study方法
        System.out.println(s.getName()+","+s.getAge());
        s.study();
    }
}
