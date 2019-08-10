package homework.homework_3;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 19:35
 * description:键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，
 * 必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。
 *TreeSet集合
 *         排序的条件：条件二选一
 *             1、TreeSet集合中的元素实现Comparable自然排序的接口，定义排序规则。
 *             2、元素不需要实现Comparable接口，但是在创建TreeSet集合对象的时候传递一个Comparator比较器对象
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        TreeSet<Character> characters = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            //添加元素
            characters.add(str.charAt(i));
        }
        for (Character character : characters) {
            System.out.print(character);
        }

    }
}
