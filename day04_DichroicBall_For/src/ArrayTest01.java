import java.util.Random;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/20 18:30
 * description:
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //定义数组
        int[] arr= new int[6];
        // 常见随机类对象
        Random random = new Random();
        // 随机数赋值到数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        // 遍历数组
        for (int i: arr) {
            System.out.println(i);
        }
        //将数组第一个值用max存起来
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // 将后面的值和max比较，若大，则赋值到最大值
            if(max < arr[i])
                max = arr[i]; 
        }
        System.out.println("max = " + max);
    }
}
