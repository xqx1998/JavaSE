package Lambda表达式.Demo02;

import java.util.*;

import static java.lang.Integer.toUnsignedString;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 10:38
 * description:函数式接口
 * ① 类的静态方法引用
 * ② 类的非静态方法引用
 */
public class Demo02 {
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
         * 1类的静态方法引用
         * 源集合元素转换为16进制并赋值到新集合中
         * 按照Lambda原始写法，传入的Lambda表达式会被编译为 Function 接口，
         * 接口中通过Integer.toHexString(i) 对原来集合的元素进行转换：
         */
        List<String> hexList1 = CollectionUtil.convert(list, i -> Integer.toHexString(i));
        System.out.println("hexList1 = " + hexList1);

        /**
         * 1类的静态方法引用
         * 上面的Lambda表达式代码块中，只有对 Integer.toHexString() 方法的引用，
         * 没有其它代码，因此我们可以直接把方法作为参数传递，由编译器帮我们处理，
         * 这就是静态方法引用
         */
        List<String> hexList2 = CollectionUtil.convert(list, Integer::toHexString);
        System.out.println("hexList2 = " + hexList2);

        /**
         * ② 类的非静态方法引用
         * 把刚刚生成的 String 集合 hexList 中的元素都变成大写，需要借助于String类的toUpperCase()方法
         */
        List<String> upperList = CollectionUtil.convert(hexList2, i -> i.toUpperCase());
        System.out.println("upperList = " + upperList);

        /**
         * ② 类的非静态方法引用
         * 因为代码体只有对 toUpperCase() 的调用，所以可以把方法作为参数引用传递，依然可以简写
         */
        List<String> upperList1 = CollectionUtil.convert(hexList2, String::toUpperCase);
        System.out.println("upperList1 = " + upperList1);

        /**
         * ③ 指定实例的非静态方法引用
         * 下面一个需求是这样的，我们先定义一个数字 Integer num = 2000 ，
         * 然后用这个数字和集合中的每个数字进行比较，比较的结果放入一个新的集合。
         * 比较对象，我们可以用 Integer 的 compareTo 方法:
         */
        Integer num = 2000;
        List<Integer> compareList = CollectionUtil.convert(list, integer -> num.compareTo(integer));
        // compareList.forEach(i -> System.out.println("i = " + i));
        System.out.println("compareList = " + compareList);

        /**
         * 与前面类似，这里Lambda的代码块中，依然只有对 num.compareTo(i) 的调用，
         * 所以可以简写。但是，需要注意的是，这次方法的调用者不是集合的元素，
         * 而是一个外部的局部变量 num ，因此不能使用Integer::compareTo ，
         * 因为这样是无法确定方法的调用者。要指定调用者，需要用  对象::方法名 的方式：
         */
        List<Integer> compareList1 = CollectionUtil.convert(list, num::compareTo);
        compareList1.forEach(i -> System.out.println(i));
        System.out.println("compareList1 = " + compareList1);

        /**
         * ④ 构造函数引用
         * 最后一个场景：把集合中的数字作为毫秒值，构建出 Date 对象并放入集合，这里我们就需要用到Date的构造函数
         * 可以接收集合中的每个元素，然后把元素作为 Date 的构造函数参数：
         */
        List<Date> dateList = CollectionUtil.convert(list, i -> new Date());
        System.out.println("dateList = " + dateList);



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
