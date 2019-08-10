package homework.homework_2;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 19:29
 * description:二、使用LinkedHashSet存储以下元素："王昭君","王昭君","西施","杨玉环","貂蝉"。
 * 使用迭代器和增强for循环遍历LinkedHashSet。
 * LinkedHasSet：有序并且不可以存储重复元素，特例
 *         特点：底层结构是链表+哈希表；链表保证有序。
 */
public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("王昭君");
        strings.add("王昭君");
        strings.add("西施");
        strings.add("杨玉环");
        strings.add("貂蝉");
        System.out.println("迭代器遍历：");
        //创建迭代器
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
        System.out.println("增强for循环遍历：");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

