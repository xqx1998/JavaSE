package Homework;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/16 15:55
 * description:
 * 在主方法中有如下代码片段：
 *
 * ```java
 // 片段1
 int a = 10;
 {
 a = 20;
 System.out.println(a);
 }

 // 片段2
 {
 int b = 20;
 System.out.println(b);
 }
 b = 30;
 System.out.println(b);
 * ```
 *
 * 请分析其中会出现错误的代码，描述错误原因，并进行修正。将修正后的代码写入Test05.java文件中，查看运行结果。
 *
 * ### 训练目标
 *
 * 变量的有效作用域
 *
 * ### 训练提示
 *
 * 1、变量的有效范围只在直接包裹该变量的一对花括号{}里有效。
 *
 * ### 参考方案
 *
 *
 *
 * ### 训练步骤
 *
 * 1、片段1中变量a在main方法的大括号下定义，所以在整个main方法中（包括内层的大括号内）都可以使用，没有问题。
 *
 * 2、片段2中变量b在第一次输出时没有问题，没有超出其有效作用域；而在改变其值的时候，已经超出了b的有效范围，不可以再使用变量b。
 * 可以重新定义变量解决。
 *
 * 3、创建java文件，定义类Test05，编写主方法。在主方法中将修改后的代码写入，编译运行查看效果。
 */
public class Test05 {
    public static void main(String[] args) {
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a); // 正常输出20，没有错误
        }

        // 片段2
        {
            int b = 20;
            System.out.println(b); // 正常输出20，没有错误
        }
        // b = 30; // 此处报错，b已经超出其有效范围
        int b = 30; // 需要再重新声明int类型的变量b
        System.out.println(b);
    }
}
