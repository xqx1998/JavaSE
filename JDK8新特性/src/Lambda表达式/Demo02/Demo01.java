package Lambda表达式.Demo02;

import java.util.*;

import static java.lang.Integer.toUnsignedString;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 10:38
 * description:函数式接口
 * ① 类的静态方法引用
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000, 2000, 3000);
        System.out.println("list = " + list);
        //创建listIterator集合
        ListIterator<Integer> integerListIterator = list.listIterator();
        //创建转化后的结果集合
        List<String> hexList = new LinkedList<>();
        //循环转换list中的每一个元素并添加到结果集合中
        while (integerListIterator.hasNext()){
            //添加
            hexList.add(toHexString(integerListIterator.next()));
        }
        System.out.println("hexList = " + hexList);

        /**
         * 源集合元素转换为16进制并赋值到新集合中
         * 按照Lambda原始写法，传入的Lambda表达式会被编译为 Function 接口，
         * 接口中通过Integer.toHexString(i) 对原来集合的元素进行转换：
         */
        List<String> hexList1 = CollectionUtil.convert(list, i -> Integer.toHexString(i));
        System.out.println("hexList1 = " + hexList1);

        /**
         * 上面的Lambda表达式代码块中，只有对 Integer.toHexString() 方法的引用，
         * 没有其它代码，因此我们可以直接把方法作为参数传递，由编译器帮我们处理，
         * 这就是静态方法引用
         */
        List<String> hexList2 = CollectionUtil.convert(list, Integer::toHexString);
        System.out.println("hexList2 = " + hexList2);

    }

    /**
     * 把这个集合中的元素转为十六进制保存，调用Integer.toHexString() 方法
     * @param i 要转换的值
     * @return
     */
    public static  String toHexString(int i){
        return toUnsignedString(i ,16);
    }
}
