package 答案.homework_05;
/*	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
	2.统计该数组中有多少个大于平均值的元素,在控制台上打印出来.并求和.*/
public class Test05 {
    public static void main(String[] args) {
        //1.定义一个包含十个元素的int类型的数组。数组元素自己给出
        int[] arr = {1,2,3,4,5,0,9,6,8,7};

        //基于第二题的基础上
        //调用定义好的方法,直接获取该数组的平均数
        double avg = getAvg(arr);

        //因为题目要求统计个数,还有求和
        //求和变量
        int sum = 0;
        //计数器
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //如果当前元素大于平均数
            if(arr[i] > avg){
                //求和,计数
                sum += arr[i];
                count++;
            }
        }

        //for循环结束之后才能得到最终的个数,和
        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
    }


    //定义一个方法,求出该数组的平均数,并返回
    //参数: 有参数 参数为要求平均数的数组  类型是int类型的数组:int[]
    //返回值: 有  返回值为这个数组的平均数 平均数有可能是小数  所以为double类型
    public static double getAvg(int[] arr){
        //求平均数  要先知道数组的和  个数的话就是数组的长度
        //求和
        int sum = 0;
        //遍历数组  求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        //计算平均数
        double avg =  sum*1.0/arr.length;
        //返回平均数
        return avg;
    }
}
