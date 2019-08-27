package homework.homework_4;

import java.util.*;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 20:41
 * description:练习四：Map集合的使用（三）
 * 四、定义一个泛型为String类型的List集合，统计该集合中每个字符（注意，不是字符串）出现的次数。
 * 例如：集合中有”abc”、”bcd”两个元素，程序最终输出结果为：“a = 1,b = 2,c = 2,d = 1”。
 */
public class Test {
    public static void main(String[] args) {
        //创建list集合存储字符串
        ArrayList<String> strs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入多个字符串，中间分开按回车，按 0 回车结束");
        while(true){
            String str = scanner.next();
            if (str.equals("0"))
                break;
            else
                strs.add(str);
        }
        //创建haspMap集合存储键值对 LinkedHashMap集合添加元素时有自然排序
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        // 遍历字符串集合
        for (String str : strs) {
            //遍历字符串每一个字符
            for (int i = 0; i < str.length(); i++) {
                //创建变量 赋值获取的字符
                Character key = str.charAt(i);
                //判断 map集合中关键字是否存有key
                if (map.containsKey(key)) {//是，获取对应的value,进行value加1
                    Integer count = map.get(key);
                    map.put(key, ++count);
                }else{ //不存在，则第一次出现，存入map并将value设为1
                    map.put(key, 1);
                }
            }
        }

        //遍历
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            System.out.print(characterIntegerEntry.getKey()+"="+characterIntegerEntry.getValue()+",");
        }
        System.out.print("\b");

    }
}
/*
执行结果：
请输入多个字符串，中间分开按回车，按 0 回车结束
abc
bcd
0
a=1,b=2,c=2,d=1
 */
