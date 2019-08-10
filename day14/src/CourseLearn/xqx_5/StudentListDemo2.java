package CourseLearn.xqx_5;


import CourseLearn.xqx_3_ArrayListt.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
    集合的三种遍历方式
 */
public class StudentListDemo2 {
    public static void main(String[] args) {
        //创建List集合
        List<Student> list=new ArrayList<>();
        //创建Student对象
        Student s1=new Student("地理热吧",20);
        Student s2=new Student("古力娜扎",23);
        Student s3=new Student("马儿扎哈",20);
        Student s4=new Student("真皮沙发",26);
        //添加学生到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //使用fori
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student);
        }
        System.out.println("----------------");

        //使用iterator迭代器，了解，很少用。
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            //有下一个元素
            Student student = it.next();
            System.out.println(student);
        }
        System.out.println("----------------");

        //增强for循环,快捷键：集合/数组对象.for+回车
        for (Student student : list) {
            System.out.println(student);
        }
    }
}
