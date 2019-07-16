package Homework;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/16 15:55
 * description:
 * ## 题目1（训练）
 *
 * 请编写程序，将如下语句输出到屏幕上：
 *
 * ~~~java
 * java是一门跨平台的计算机语言
 * 被称为一次编写，处处运行
 * ~~~
 *
 * ### 训练目标
 *
 * java语言HelloWorld案例的语法格式和编译运行。
 *
 * ### 训练提示
 *
 * 1、创建java文件。
 *
 * 2、编写类，用于完成该程序。
 *
 * 3、程序的运行需要主方法，编写主方法。
 *
 * 4、该使用什么语句将题目中的文本输出？
 *
 * 5、该怎样编译和运行java文件？
 *
 * ### 参考方案
 *
 * 模仿HelloWorld案例完成
 *
 * ### 训练步骤
 *
 * 1、新建文本文件，将名称修改为Test01.java。注意显示文件的后缀名，防止出现Test01.java.txt的文件名。
 *
 * 2、打开文件，编写代码，先定义一个类Test01，类名需要与文件名一致。注意大小写。
 *
 * 3、在类中定义主方法，在主方法中编写输出语句，将题目中的文本用双引号包裹。
 *
 * 4、保存文件内容。打开cmd窗口，将命令目录切换至文件所在目录。使用javac命令编译java文件，使用java命令运行class文件，查看结果。
 * 注意：编译java文件，需要带后缀名；运行class文件，不需后缀名。
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("java是一门跨平台的计算机语言");
        System.out.println("被称为一次编写，处处运行");
    }
}
