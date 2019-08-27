package homework.homework_2;

import java.util.HashMap;
import java.util.Map;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 20:24
 * description:
 * 练习二：Map集合的使用（一）
 * 二、现在有一个map集合如下：
 * Map<Integer,String> map =?new?HashMap<Integer, String>();
 * ????????map.put(1,?"张三丰");
 * ??????? map.put(2,?"周芷若");
 * ??????? map.put(3,?"汪峰");
 * ??????? map.put(4,?"灭绝师太");
 * 要求：
 * 1.遍历集合，并将序号与对应人名打印。
 * 2.向该map集合中插入一个编码为5姓名为李晓红的信息
 * 	3.移除该map中的编号为1的信息
 * 	4.将map集合中编号为2的姓名信息修改为"周林"
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        // 1.遍历集合，并将序号与对应人名打印。
        System.out.println("keySet()获取所有关键字遍历：");
        for (Integer num : map.keySet()) {
            System.out.println(num+","+map.get(num));
        }
        System.out.println("----------");
        System.out.println("entrySet()遍历：");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey()+", "+integerStringEntry.getValue());
        }
        // 2.向该map集合中插入一个编码为5姓名为李晓红的信息
        map.put(5, "李晓红");
        // 3.移除该map中的编号为1的信息
        map.remove(1);
        // 4.将map集合中编号为2的姓名信息修改为"周林"
        map.put(2, "周林");
        System.out.println("map更新后：");
        for (Integer num : map.keySet()) {
            System.out.println(num+","+map.get(num));
        }
    }
}
/**
 运行结果：
 keySet()获取所有关键字遍历：
 1,张三丰
 2,周芷若
 3,汪峰
 4,灭绝师太
 ----------
 entrySet()遍历：
 1, 张三丰
 2, 周芷若
 3, 汪峰
 4, 灭绝师太
 map更新后：
 2,周林
 3,汪峰
 4,灭绝师太
 5,李晓红

 */