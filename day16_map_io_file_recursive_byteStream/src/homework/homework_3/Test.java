package homework.homework_3;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 20:32
 * description:练习三：Map集合的使用（二）
 * 有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
 * 将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 */
public class Test {
    public static void main(String[] args) {
        //创建集合对象  LinkedHashMap集合添加元素时有自然排序
        HashMap<String, String> hashMap = new LinkedHashMap<>();
        String[] array1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] array2 = {"哈尔滨","杭州","南昌","广州","福州"};
        //添加元素
        for (int i = 0; i < array1.length; i++) {
            hashMap.put(array1[i],array2[i]);
        }
        // 遍历
        for (String s : hashMap.keySet()) {
            System.out.println(s + "="+ hashMap.get(s));
        }
    }
}
/**
 运行结果：
 黑龙江省=哈尔滨
 浙江省=杭州
 江西省=南昌
 广东省=广州
 福建省=福州
 */