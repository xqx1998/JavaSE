package com.xqx_1;
/*
    需求：定义一个方法，该方法的功能是计算整型数组中各个偶数元素之和
        int[] arr={1,2,3,4,5,6,7,8}
        2+4+6+8=20;
    public static 返回值类型 方法名(数据类型 变量名,数据类型 变量名,...){
        //方法提
    }
    做到两个明确：
        返回值类型：int
        参数列表：(int[] arr)
 */
public class MethodDemo01 {
    public static void main(String[] args) {
        //初始化数组
        int[] arr={1,2,3,4,5,6,7,8,10};
        //调用方法
        int sum = getSum(arr);
        System.out.println("sum = " + sum);
    }

    public static int getSum(int[] arr){
        //定义sum变量，累加求和
        int sum=0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //判断元素是否是偶数，如果是偶数就累加到sum中
            if (arr[i] % 2 == 0 ) {
                sum += arr[i];
            }
        }
        //返回结果
        return sum;
    }
}
