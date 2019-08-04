package Lambda表达式.Demo02;

import java.util.*;

import static java.lang.Integer.toUnsignedString;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 10:38
 * description:函数式接口
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000, 200, 3000);
        ListIterator<Integer> integerListIterator = list.listIterator();
        List<String> hexList = new LinkedList<>();
        while (integerListIterator.hasNext()){
            hexList.add(toHexString(integerListIterator.next()));
        }
        System.out.println(hexList);
    }
    // 把这个集合中的元素转为十六进制保存，调用Integer.toHexString() 方法
    public static  String toHexString(int i){
        return toUnsignedString(i ,4);
    }
}
