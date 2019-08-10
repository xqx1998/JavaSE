package CourseLearn.xqx_6;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr={24,69,80,57,13};
        //打印排序前数组元素
        System.out.println("排序前:"+Arrays.toString(arr));

        //开始排序
        //第一层for循环控制排序的次数，n个元素就需要排序n-1次
        for (int x = 0; x < arr.length-1; x++) {
            //第二层for循环开始将每个元素和下一个元素比较大小，如果比下一个元素大，那么就交换位置
            for (int i = 0; i < arr.length-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        //排序后再次打印
        System.out.println("排序后:"+Arrays.toString(arr));
    }
}
