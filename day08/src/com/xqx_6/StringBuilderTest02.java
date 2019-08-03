package com.xqx_6;

import java.util.Scanner;

/*
    需求：
        定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
        例如，键盘录入abc，输出结果 cba

    思路：
        1:键盘录入一个字符串，用 Scanner 实现
        2:定义一个方法，实现字符串反转。返回值类型 String，参数 String s
        3:在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
        4:调用方法，用一个变量接收结果
        5:输出结果
 */
public class StringBuilderTest02 {
    public static void main(String[] args) {
        //1:键盘录入一个字符串，用 Scanner 实现
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个漂亮字符串：");
        String str = sc.nextLine();

        //4:调用方法，用一个变量接收结果
        String newStr = reverse(str);
        //5:输出结果
        System.out.println(newStr);
    }

    //2:定义一个方法，实现字符串反转。返回值类型 String，参数 String s
    public static String reverse(String str){
        //3:在方法中用StringBuilder实现字符串的反转，并把结果转成String返回
        StringBuilder sb=new StringBuilder(str);
        /*sb.reverse();
        return sb.toString();*/
        return sb.reverse().toString();
    }
}
