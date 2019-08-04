package CourseLearn.xqx_6;

public class StudentDemo {

    public static void main(String[] args) {
        Student.school="传智大学";

        Student s1=new Student();
        //s1.school="传智大学";
        System.out.println(s1.school);


        Student s2=new Student();
        //s2.school="传智大学";
        System.out.println(s2.school);

        Student.show();
    }
}
