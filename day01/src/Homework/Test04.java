package Homework;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/16 15:55
 * description:
 * 请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
 *
 * 1、班级里有100个学员。
 *
 * 2、某商品价格55.55元。
 *
 * 3、地球已经诞生超过46亿年。
 *
 * 4、“5是偶数”这句话的描述是假的。
 *
 * 输出结果如下：
 *
 * ~~~java
 * 100
 * 55.55
 * 4600000000
 * false
 * ~~~
 *
 * ### 训练目标
 *
 * 变量的定义
 *
 * ### 训练提示
 *
 * 1、不同的数据信息需要使用不同的数据类型，可以根据不同数据类型的大小以及特点选择合适的类型来定义变量，描述事物的信息。
 *
 * ### 参考方案
 *
 * 定义变量描述信息。
 *
 * ### 训练步骤
 *
 * 1、创建java文件，定义类Test04，编写主方法。
 *
 * 2、在主方法中定义不同的变量描述题目中的信息。
 *
 * ?	2.1、学员数量，可以用默认的整数类型int表示
 *
 * ?	2.2、商品价格，使用默认的浮点数类型double表示
 *
 * ?	2.3、天文数字，可以使用长整型long表示
 *
 * ?	2.4、一个描述真或者假，只有两种状态，可以使用boolean类型
 *
 * 3、使用输出语句，输出变量。
 *
 * 4、编译并运行，查看输出结果。
 */
public class Test04 {
    public static void main(String[] args) {
        int studentNumber = 100; // 学生数量
        System.out.println(studentNumber);

        double price = 55.55; // 商品价格
        System.out.println(price);

        long yearNumber = 4600000000L; // 超出int范围的整数
        System.out.println(yearNumber);

        boolean flag = false; // 真假值
        System.out.println(flag);
    }
}
