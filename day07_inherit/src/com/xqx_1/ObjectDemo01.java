package com.xqx_1;

import com.xqx_5.ArrayInfo;

import java.util.Arrays;

public class ObjectDemo01 {
    public static void main(String[] args) {
        int[] arr={10,80,30,6,50,3};


        //面向过程----------------
        //1、打印[
        System.out.print("[");
        //2、for循环变量数组
        for (int i = 0; i < arr.length; i++) {
            //3、在循环中判断是否是第最后一个元素，如果是最后一个元素就不拼接逗号
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i]+",");
            }
        }
        //4、在循环外打印]
        System.out.print("]");


        System.out.println("-----------------------");
        //面向对象思想
        String s = Arrays.toString(arr);
        System.out.println(s);


        System.out.println("-----------------------");
        //调用getMax方法获取最大值
        ArrayInfo ai=new ArrayInfo();
        int max = ai.getMax(arr);
        System.out.println("max = " + max);

    }
}
