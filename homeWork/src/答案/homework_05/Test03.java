package 答案.homework_05;
/*需求：
	(1)定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
	(2)求出该数组中满足要求的元素和。
  		要求：求和的元素的个位和十位不能包含7,并且只能为偶数。*/
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {171,72,19,16,118,51,210,7,18};

        //要求求和
        int sum = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //要求：求和的元素的个位和十位不能包含7,并且只能为偶数
            //就是判断当前遍历的元素(arr[i]) 个位和十位不能包含7  并且只能为偶数
            int ge = arr[i]%10;
            int shi = arr[i]/10%10;
            if(ge != 10 && shi != 10 && arr[i]%2==0){
                //如果满足条件  就求和
                sum += arr[i];
            }
        }

        //for循环结束之后才能得到最终的和
        System.out.println("sum = " + sum);
    }
}
