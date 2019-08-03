package 答案.homework_05;
/*	1.定义一个包含五个元素的int类型的数组。数组元素自己给出
	2.将数组当中数据小于10的打印出来
        如果存在，则打印出来，具体的数据
        如果不存在，则打印出来，未找到合适的数据*/
public class Test02 {
    public static void main(String[] args) {
        //定义一个包含五个元素的int类型的数组
        int[] arr = {8,9,10,11,12};

        //将数组当中数据小于10的打印出来
        //因为要判断存不存在小于10的元素,所以就要计算小于10的元素的个数
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //如果当前元素小于10
            if(arr[i] < 10){
                //打印输出
                System.out.println(arr[i]);
                //计数
                count++;
            }
        }

        //遍历结束后,才能得到最终计数器的值
        //假如没有小于10的元素(即计数器==0),那么就打印未找到合适的数据
        if(count == 0){
            System.out.println("未找到合适的数据");
        }

    }
}
