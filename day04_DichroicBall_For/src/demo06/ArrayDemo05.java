package demo06;
/*
    需求：
        定义一个数组，获取这个数组中的最大值
        例如：int[] arr={12,68,103,5,28,688,27,-8}，获取这个数组中的最大值为688
    实现步骤：
        1.定义一个数组
        2.定义一个变量max=0，保持找到的最大值
        3.遍历数组
        4.通过索引获取数组的每一个值，和max判断比较，如果比max大，那么max就保存这个值
        5.打印结果
 */
public class ArrayDemo05 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr={12,68,103,1050,28,688,27,-8};
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
