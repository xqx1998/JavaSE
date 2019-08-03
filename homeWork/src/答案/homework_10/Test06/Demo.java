package 答案.homework_10.Test06;

import java.util.ArrayList;

/*1. 定义"学生"类,Student,包含以下成员:

成员属性: name (姓名):String类型，chinese(语文):int类型，math(数学):int类型，属性使用private修饰。

        （1）生成所有属性的get/set方法，生成构造方法

        （2）成员方法：void show()方法,打印对象所有属性的值以及对象的语文和数学成绩的总和到控制台;



2. 定义类：Test,类中定义main()方法，按以下要求编写代码:

        （1）定义如下方法：

                ①定义public static ArrayList<Student>  getSum(ArrayList<Student> list){...}方法:

                ②要求：遍历list集合，将list中语文成绩和数学成绩的总和大于160分的元素存入到另一个ArrayList<Student> 中并返回。

        （2）分别实例化三个Student对象，三个对象分别为："邓超" ,88,99、"baby" ,85,78、"郑凯" ,86,50;

        （3）创建一个ArrayList集合，这个集合里面存储的是Student类型，分别将上面的三个Student对象添加到集合中，调用方法getSum，根据返回的list集合遍历对象并调用show（）方法输出所有元素信息。*/
public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("邓超" ,88,99);
        Student student2 = new Student("baby" ,85,78);
        Student student3 = new Student("郑凯" ,86,50);
        //创建一个ArrayList集合
        ArrayList<Student> list = new ArrayList<>();
        //将上面的三个Student对象添加到集合中
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //调用方法getSum，根据返回的list集合遍历对象并调用show（）方法输出所有元素信息。
        ArrayList<Student> list_return = getSum(list);

        //遍历返回的集合
        for (int i = 0; i < list_return.size(); i++) {
            Student student = list_return.get(i);
            //调用元素的show方法
            student.show();
        }

    }

    public static ArrayList<Student> getSum(ArrayList<Student> list){
        //新建集合
        ArrayList<Student> list_new = new ArrayList<>();
        //遍历老集合
        for (int i = 0; i < list.size(); i++) {
            //得到当前遍历的元素
            Student student = list.get(i);
            //得到他的成绩
            int chinese = student.getChinese();
            int math = student.getMath();
            //求总和
            int he = chinese+math;
            //判断总和是否大于160
            if(he > 160){
                //将满足条件的元素存入新集合
                list_new.add(student);
            }
        }
        return list_new;
    }

}
