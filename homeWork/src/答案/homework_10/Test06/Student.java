package 答案.homework_10.Test06;
/*1. 定义"学生"类,Student,包含以下成员:

成员属性: name (姓名):String类型，chinese(语文):int类型，math(数学):int类型，属性使用private修饰。

        （1）生成所有属性的get/set方法，生成构造方法

        （2）成员方法：void show()方法,打印对象所有属性的值以及对象的语文和数学成绩的总和到控制台;
        */
public class Student {
    private String name;
    private int chinese;
    private int math;

    public Student() {
    }

    public Student(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    //成员方法：void show()方法,打印对象所有属性的值以及对象的语文和数学成绩的总和到控制台;
    public void show(){
        System.out.println(name+"的语文成绩:"+chinese+",数学成绩:"+math+",成绩总和:"+(chinese+math));
    }
}
