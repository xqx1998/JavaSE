package homework.homework_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 19:17
 * description:练习一：
 * 创建4个人存储到集合中，要求姓名和年龄相同的人看做同一人不存储。
 *
 * 重写hashcode和equals
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("list集合存储：");
        List<Person> people = new ArrayList<>();
        people.add(new Person("任天行", 19));
        people.add(new Person("董佳鑫",25));
        people.add(new Person("明洋", 22));
        people.add(new Person("倖权祥", 21));
        people.add(new Person("任天行", 19));
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("-------------");
        System.out.println("Set集合存储：");
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(new Person("任天行", 19));
        peopleSet.add(new Person("董佳鑫",25));
        peopleSet.add(new Person("明洋", 22));
        peopleSet.add(new Person("倖权祥", 21));
        peopleSet.add(new Person("任天行", 19));
        for (Person person : peopleSet) {
            System.out.println(person);
        }
    }
}
