package Test;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 11:35
 * description:第一题:
 * 	简易计算器
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println((int)'(');
        System.out.println((int)')');
        System.out.println("简易计算器：");
        System.out.println("使用说明：输入表达式以‘=’结束并按下回车键");
        Scanner scanner = new Scanner(System.in);
        //创建变量存储表达式：
        String expire = scanner.next();
        //创建变量存储 剪切字符串开始位置
        int len = 0;
        //定义数值数组存储索引
        int index1 = 0;
        //定义符号数组存储索引
        int index2 = 0;
        //定义结果
        double result = 0;
        //创建数值数组
        int[] array1 = new int[expire.length()];
        //创建符号数组
        int[] array2 = new int[expire.length()];
        //遍历切割表达式，分别将数值和符号存到array1,array2
        for (int i = 0; i < expire.length(); i++) {
            //遍历表达式每一个字符
            int charInt = (int)expire.charAt(i);
            //判断字符是否为 + - * /
            if (charInt==43||charInt==45||charInt==42||charInt==47||charInt==61) {
                //切割 存储数值
                array1[index1] = Integer.valueOf(expire.substring(len, i)).intValue();
                //存储符号对应的整型数值
                array2[index2] = charInt;
                //索引加1
                index2++;
                index1++;
                //切割开始值
                len = i+1;
            }

        }
        for (int i = 0; i < array1.length; i++) {
            //加运算
            if(array2[i]==43){
                //判断是否为第一个符号，若是，则运算数值数组内第一个值和第二个值
                if(i==0) {
                    result = array1[i] + array1[i + 1];
                }else{
                    result += array1[i+1];
                }
            }
            //减运算
            if(array2[i]==45){
                //判断是否为第一个符号，若是，则运算数值数组内第一个值和第二个值
                if(i==0) {
                    result = array1[i] - array1[i + 1];
                }else{
                    result -= array1[i+1];
                }
            }
            //乘运算
            if(array2[i]==42){
                //判断是否为第一个符号，若是，则运算数值数组内第一个值和第二个值
                if(i==0) {
                    result = array1[i] * array1[i + 1];
                }else{
                    result *= array1[i+1];
                }
            }
            //除运算
            if(array2[i]==47){
                //判断是否为第一个符号，若是，则运算数值数组内第一个值和第二个值
                if(i==0) {
                    result = array1[i] / array1[i + 1];
                }else{
                    result /= array1[i+1];
                }
            }
        }
        // 输出结果
        System.out.println(result);
        //遍历数值数组
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"  ");
        }
        //遍历符号数组
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"  ");
        }

    }
}
