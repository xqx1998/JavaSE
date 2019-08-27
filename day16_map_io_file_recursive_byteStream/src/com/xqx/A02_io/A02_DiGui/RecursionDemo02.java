package com.xqx.A02_io.A02_DiGui;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 14:18
 * description:递归案例1
 *  以编程的角度来看，递归指的是方法定义中调用方法本身的现象
 *  需求：
 *         用递归求5的阶乘，并把结果在控制台输出
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println("10 的 阶乘是："+getFactorial(10L));
        System.out.println("10 的 阶乘是："+1*2*3*4*5*6*7*8*9*10);
        System.out.println("请输入求阶乘的数：");
        long num = new Scanner(System.in).nextLong();
        System.out.println(num+"的 阶乘是："+getFactorial(num));

    }

    public static Long getFactorial(Long num){
        // 判断是否等于1
        if (num==1L){ //是,返回1
           return 1L;
        }else  //不是返回getFactorial(num-1)*num
            return getFactorial(num-1)*num;
    }

}
