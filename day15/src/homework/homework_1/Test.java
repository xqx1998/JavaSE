package homework.homework_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 19:17
 * description:��ϰһ��
 * ����4���˴洢�������У�Ҫ��������������ͬ���˿���ͬһ�˲��洢��
 *
 * ��дhashcode��equals
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("list���ϴ洢��");
        List<Person> people = new ArrayList<>();
        people.add(new Person("������", 19));
        people.add(new Person("������",25));
        people.add(new Person("����", 22));
        people.add(new Person("��Ȩ��", 21));
        people.add(new Person("������", 19));
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("-------------");
        System.out.println("Set���ϴ洢��");
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(new Person("������", 19));
        peopleSet.add(new Person("������",25));
        peopleSet.add(new Person("����", 22));
        peopleSet.add(new Person("��Ȩ��", 21));
        peopleSet.add(new Person("������", 19));
        for (Person person : peopleSet) {
            System.out.println(person);
        }
    }
}
