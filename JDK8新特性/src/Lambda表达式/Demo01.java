package Lambda表达式;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 10:12
 * description:⒈基本语法
 * <p>
 * (参数列表) -> {代码块}
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建一个集合
        List<Integer> list = Arrays.asList(10, 5, 25, -15, 20);
        //示例1：多个参数
        // 使用新增的集合API：sort(Comparator c) 方法，接收一个比较器，我们用Lambda来代替Comparator 的匿名内部类：
        list.sort((i1, i2) -> {
            return i1 - i2;
        });
        System.out.println(list);

        // 示例2：单个参数
        // 遍历集合中的元素 jdk1.8给集合添加了一个方法：foreach() ，接收一个对元素进行操作的函数
        //void accept(T t);
        list.forEach(i -> System.out.println(i));

        // 实例3：把Lambda赋值给变量
        // Lambda表达式的实质其实还是匿名内部类，所以可以把Lambda表达式赋值给某个变量
        Runnable task = () -> {
            System.out.println("hello lambda");
        };
        new Thread(task).start();

        /**
         * 示例4：隐式final
         * Lambda表达式的实质其实还是匿名内部类，而匿名内部类在访问外部局部变量时，要求变量必须声明为 final ！
         * 不过我们在使用Lambda表达式时无需声明 final ，
         * 这并不是说违反了匿名内部类的规则，因为Lambda底层会隐式的把变量设置为 final ，
         * 在后续的操作中，一定不能修改该变量：
         */
        // 正确示范
        int num = -1;
        Runnable r = () -> {
            // 在lambda表达式中使用局部变量num，num会被隐式声明为final
            System.out.println("num = " + num);
        };
        new Thread(r).start();//-1

        // 错误示范
       /* int num1 = -1;
        Runnable r1 = () -> {
            // 在lambda表达式中使用局部变量num，num会被隐式声明为final
            System.out.println("num = " + num1++);
        };
        new Thread(r1).start();//-1*/

       
    }

}
