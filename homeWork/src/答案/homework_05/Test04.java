package 答案.homework_05;
/*	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
	2.定义一个方法,求出该数组的平均数,并返回
	3.在main方法中将该数组中大于平均数的元素打印到控制台上(平均数用2中定义的方法得到)*/
public class Test04 {
    public static void main(String[] args) {
        //1.定义一个包含十个元素的int类型的数组。数组元素自己给出
        int[] arr = {1,2,3,4,5,0,9,6,8,7};

        //3.调用定义好的方法,求出该数组的平均数
        double avg = getAvg(arr);

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //将大于平均数的元素打印
            if(arr[i] > avg){
                System.out.println(arr[i]);
            }
        }
    }


    //2.定义一个方法,求出该数组的平均数,并返回
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
