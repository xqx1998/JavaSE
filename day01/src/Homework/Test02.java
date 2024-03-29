package Homework;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/16 15:55
 * description:
 * 请编写程序，将某位学员的个人信息输出到屏幕上。信息包括姓名（字符串常量）、性别（字符常量）、年龄（整型常量）、身高（单位米，小数常量）、婚否（布尔常量）。输出格式如下：
 *
 * ~~~java
 * 张三
 * 男
 * 18
 * 1.78
 * false
 * ~~~
 *
 * ### 训练目标
 *
 * java中的常量
 *
 * ### 训练提示
 *
 * 1、创建java文件。
 *
 * 2、编写类，用于完成该程序。
 *
 * 3、程序的运行需要主方法，编写主方法。
 *
 * 4、需要使用输出语句输出信息，那各种信息该怎样书写？
 *
 * 5、该怎样编译和运行java文件？
 *
 * ### 参考方案
 *
 * 使用输出语句直接输出常量的方式完成
 *
 * ### 训练步骤
 *
 * 1、新建文本文件，将名称修改为Test02.java。
 *
 * 2、打开文件，编写代码，先定义一个类Test02。在类中编写主方法。
 *
 * 3、在输出语句中分别输出各种信息。
 *
 * ?	3.1、姓名是字符串常量，使用双引号包裹。
 *
 * ?	3.2、性别是字符常量，使用单引号包裹。当然，也可以使用字符串，用双引号包裹。
 *
 * ?	3.3、年龄是整数，直接输出整型。
 *
 * ?	3.4、身高是小数，直接输出浮点型。
 *
 * ?	3.5、婚否，是或者否，只有两种状态，适合使用布尔类型，直接输出boolean类型的true或者false。
 *
 * 4、保存文件内容。打开cmd窗口，将命令目录切换至文件所在目录。使用javac命令编译java文件，使用java命令运行class文件，查看结果。
 * 注意：编译java文件，需要带后缀名；运行class文件，不需后缀名。
 */
public class Test02 {
    public static void main(String[] args) {
        System.out.println("张三"); // 输出字符串常量，姓名
        System.out.println('男'); // 输出字符常量，性别
        System.out.println(18); // 输出整数常量，年龄
        System.out.println(1.78); // 输出小数常量，身高
        System.out.println(false); // 输出布尔常量，婚否
    }
}
