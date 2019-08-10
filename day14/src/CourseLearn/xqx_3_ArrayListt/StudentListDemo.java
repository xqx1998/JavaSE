package CourseLearn.xqx_3_ArrayListt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListDemo {
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
        list.add(2,s4);

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student);
        }

        System.out.println("----------------------");

        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student);
        }
    }
}
