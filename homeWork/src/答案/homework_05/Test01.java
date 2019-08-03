package 答案.homework_05;
/*	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
	2.遍历打印出数组元素
	3.求出数组当中的最小值打印出来
	4.求出数组当中的最大值打印出来*/
public class Test01 {
    public static void main(String[] args) {
        //定义一个包含十个元素的int类型的数组。数组元素自己给出
        int[] arr = {1,2,3,4,5,0,9,6,8,7};

        //遍历打印出数组元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //求出数组当中的最小值打印出来
        //先定义一个参照变量最小值 初始值为第一个元素
        int min = arr[0];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //将参照变量和每一个元素进行比较,如果发现参照变量比当前元素还要大,那么当前元素才是最小值
            if(min > arr[i]){
                //就将当前元素的值赋值给参照变量
                min = arr[i];
            }
        }
        //打印出最小值
        System.out.println("min = " + min);

        //求出数组当中的最大值打印出来
        //先定义一个参照变量最大值 初始值为第一个元素
        int max = arr[0];
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            //将参照变量和每一个元素进行比较,如果发现参照变量比当前元素还要小,那么当前元素才是最大值
            if(max < arr[i]){
                //就将当前元素的值赋值给参照变量
                max = arr[i];
            }
        }
        //打印出最大值
        System.out.println("max = " + max);
    }
}
