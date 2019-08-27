package com.xqx_5;
/*
    这个类封装了很多跟数组相关的方法，供其他类使用
 */
public class ArrayInfo {
    //定义一个方法，使用随机数给数组初始化赋值

    //定义方法，对数组求和

    //定义一个方法，获取整型数组的最大值
    /**
     * 两个明确：
     *      返回值类型：int
     *      参数列表：(int[] arr)
     */
    public int getMax(int[] arr){
        //定义一个变量，保存最大值
        int max=arr[0];
        //for循环遍历数
        for (int i = 0; i < arr.length; i++) {
            //使用if判断查找最大值
            if(max<arr[i]){
                max=arr[i];
            }
        }
        //返回结果
        return max;
    }

    //定义方法获取数组的最小值

    //定义方法获取数组中元素的平均值

    //定义方法，查找指定值在数组中第一次出现的索引位置。
}
