package Homework;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/16 15:55
 * description:
 *
 请编写程序，分别定义8种基本数据类型的变量，并打印变量的值。

 ### 训练目标

 java中的八种基本基本数据类型和变量的定义

 ### 训练提示

 1、java中的8种基本数据类型都有什么？

 2、定义变量的格式是什么？

 3、变量名该怎样定义？

 4、该怎样使用变量？

 ### 参考方案

 定义变量，并输出变量的值。

 ### 训练步骤

 1、创建java文件，定义类Test03，编写主方法。

 2、在java语言中，定义变量必须明确变量的数据类型。八种基本数据类型包括byte、short、int、long、float、double、char、boolean。

 3、定义变量的格式是：

 ~~~java
 数据类型 变量名 = 初始化值; // 声明变量并赋值
 // 或
 数据类型 变量名; // 先声明
 变量名 = 初始化值; // 再赋值
 ~~~

 4、可以包含英文字母、数字字符、英文下划线（_）和英文美元符（$），并且不能以数字开头。
 在开发中，java变量的命名又最好符合“小驼峰”式的惯例规范，并且最好做到见名知意。

 5、在输出语句中，直接调用变量名即可。

 6、编译并运行代码，查看输出结果。

 */
public class Test03 {
    public static void main(String[] args) {
        // 定义byte类型变量，值为整数，只要在byte范围即可，byte范围：-128 ~ 127
        byte b = 100;
        System.out.println(b);
        // 定义short类型变量，值为整数，只要在short范围即可
        short s = 12345;
        System.out.println(s);

        // 整数的默认类型就是int类型
        int num = 654321;
        System.out.println(num);

        // 定义long类型的整数，需要在数据的后面加字母（L），大小写不限，建议大写。
        long lo = 123456789L;
        System.out.println(lo);

        // 定义float类型的浮点数，需要在数据的后面加字母（F），大小写不限，建议大写。
        float f = 1.5F;
        System.out.println(f);

        // 浮点型默认类型double
        double d = 123.456;
        System.out.println(d);

        // 布尔型只有两个取值：true和false
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        // 定义字符型需要一对英文的单引号包裹，并且只能包含一个字符
        char c = 'a';
        System.out.println(c);
    }
}
