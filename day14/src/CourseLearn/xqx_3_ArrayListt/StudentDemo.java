package CourseLearn.xqx_3_ArrayListt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StudentDemo {

    public static void main(String[] args) {
        //创建集合对象
        Collection<Student> coll=new ArrayList<>();
        //创建4个学生对象
        Student s1=new Student("地理热吧",20);
        Student s2=new Student("古力娜扎",23);
        Student s3=new Student("马儿扎哈",20);
        Student s4=new Student("真皮沙发",26);
        //将学生存储到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);
        coll.add(s4);
        //遍历集合，打印学生对象
        Iterator<Student> it = coll.iterator();
        while(it.hasNext()){
            //有下一个元素
            Student student = it.next();
            System.out.println(student);
        }
    }
}
