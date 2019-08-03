package com.xqx;

/*
    需求：
        有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第二十个月的兔子对数为多少？

    思路：
        1:为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20
        2:因为第1个月，第2个月兔子的对数是已知的，都是1，所以数组的第1个元素，第2个元素值也都是1
        3:用循环实现计算每个月的兔子对数
        4:输出数组中最后一个元素的值，就是第20个月的兔子对数
 */
public class Test04 {
    public static void main(String[] args) {
        //1、定义数组存储每个月兔子的数量，初始化长度为20
        int[] arr=new int[20];
        //2、给索引为0和1的元素赋值为1；
        arr[0]=1;
        arr[1]=1;
        //3、通过for循环，给每个索引处赋值（需要通过规律计算）
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-2]+arr[i-1];
        }
        //4、打印结果：第20个月（索引为19）兔子的数量
        //输出数组中最后一个元素的值，就是第20个月的兔子对数
        System.out.println("第二十个月兔子的对数是：" + arr[19]);
    }
}