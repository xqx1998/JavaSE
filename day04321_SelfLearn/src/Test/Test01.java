package Test;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 11:35
 * description:第一题:
 * 	简易计算器
 * 	xqxfixme：1.符号变化后计算出错 2.除法计算不稳定，出错
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("简易计算器：");
        System.out.println("使用说明：输入表达式以‘=’结束并按下回车键");
        Scanner scanner = new Scanner(System.in);
        //创建变量存储表达式：
        String expire = scanner.next();
        //创建变量存储 剪切字符串开始位置
        int len = 0;
        // System.out.println((int)'+'); //43
        // System.out.println((int)'-'); //45
        // System.out.println((int)'*'); //42
        // System.out.println((int)'/'); //47
        // System.out.println((int)'='); //61
        double result = 0;
        int temp = 0;
        for (int i = 0; i < expire.length(); i++) {
            // System.out.println((int)expire.charAt(i));
            int charInt = (int)expire.charAt(i);
            if (charInt==43||charInt==45||charInt==42||charInt==47||charInt==61){
                if(charInt==43){
                    temp = 43;
                    result+=Integer.valueOf(expire.substring(len, i)).intValue();
                }
                if(charInt==45){
                    if(len==0){
                        result = Integer.valueOf(expire.substring(len, i)).intValue()*2;
                    }
                    temp = 45;
                    result-=Integer.valueOf(expire.substring(len, i)).intValue();
                }
                if(charInt==42){
                    if(len==0){
                        result = 1;
                    }
                    temp = 42;
                    result*=Integer.valueOf(expire.substring(len, i)).intValue();
                }
                if(charInt==47){
                    //判断是否为第一个有效数字，若是则将result赋值为1
                    if(len==0){
                        result = 1;
                    }
                    temp = 47;
                    result=(result*1.0)/(Integer.valueOf(expire.substring(len, i)).intValue());
                    // System.out.println(result);
                }
                if(charInt==61){
                    if(temp==43){
                        temp = 43;
                        result+=Integer.valueOf(expire.substring(len, i)).intValue();
                    }
                    if(temp==45){
                        temp = 45;
                        result-=Integer.valueOf(expire.substring(len, i)).intValue();
                    }
                    if(temp==42){
                        temp = 42;
                        result*=Integer.valueOf(expire.substring(len, i)).intValue();
                    }
                    if(temp==47){
                        temp = 47;
                        result=(result*1.0)/(Integer.valueOf(expire.substring(len, i)).intValue());
                    }
                    System.out.println(result);
                }
                len = i+1;
            }
        }

    }
}
