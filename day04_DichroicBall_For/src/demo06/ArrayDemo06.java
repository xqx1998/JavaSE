package demo06;

import java.util.Random;

/*
    需求：
        定义一个长度为5数组，由Random随机生成5个100以内的整数存到数组中，获取这个数组中的最大值
        例如：int[] arr={12,68,103,5,28,688,27,-8}，获取这个数组中的最大值为688
    实现步骤：
        1.定义一个数组
        2.定义一个变量max=0，保持找到的最大值
        3.遍历数组
        4.通过索引获取数组的每一个值，和max判断比较，如果比max大，那么max就保存这个值
        5.打印结果
 */
public class ArrayDemo06 {
    public static void main(String[] args) {
        //创建随机数对象
        Random r=new Random();
        //1.定义一个数组
        /*int[] arr={r.nextInt(100),r.nextInt(100),r.nextInt(100),
                r.nextInt(100),r.nextInt(100)};*/
        //动态初始化一个数组
        int[] arr=new int[5];
        //遍历赋值，打印数组中的数据
        for (int i = 0; i < arr.length; i++) {
            //赋值
            arr[i]=r.nextInt(100);
            //打印
            System.out.println(arr[i]);
        }
        System.out.println("-----------------------------------");
        //2.定义一个变量max=0，保持找到的最大值
        int max=arr[0];
        // 3.遍历数组  数组名.fori+回车
        for (int i = 0; i < arr.length; i++) {
            //4.通过索引获取数组的每一个值，和max判断比较，如果比max大，那么max就保存这个值
            if(max<arr[i]){
                max=arr[i];
            }
        }
        //5.打印结果   soutv
        System.out.println("max = " + max);
    }
}
