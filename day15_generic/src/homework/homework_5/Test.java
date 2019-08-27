package homework.homework_5;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 20:43
 * description:
 *  * �塢��������λͬѧ�洢�������У����Գɼ���������������ɼ�һ�������ڳɼ�����Ļ����ϰ���������С��������
 *  * ������String��	���䣨int��	������float��
 *  * liusan	            20	        90.0F
 *  * lisi	                22	        90.0F
 *  * wangwu	            20	        99.0F
 *  * sunliu	            22	        100.0F
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<Student>(
                new Comparator<Student>() {
                    @Override
                    public int compare(Student o1, Student o2) {
                        //�Ƚ�����
                        int num = (int) ((o1.getScore()-o2.getScore())*10);
                        int num2 = num==0 ? o1.getAge().compareTo(o2.getAge()) : num;
                        int num3 = num2==0 ? o1.getName().compareTo(o2.getName()) : num2;
                        return num3;
                    }
                }
        );

        students.add(new Student("liusan", 20, 90.0F));
        students.add(new Student("lisi", 22, 90.0F));
        students.add(new Student("wangwu", 20, 90.0F));
        students.add(new Student("sunliu", 22, 100.0F));

        //����ѧ��
        students.forEach(student -> System.out.println(student));
    }

}
