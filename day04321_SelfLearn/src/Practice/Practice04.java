package Practice;

import java.util.Random;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第四题:
 * 	定义一个长度为10的整数数组，元素由随机数生成(89-156)，获取并输出数组中索引和对应的元素都为偶数的元素,并统计他们的个数
 * 		PS:0是偶数
 */
public class Practice04 {
    public static void main(String[] args) {
        //创建数组
        int[] array = new int[10];
        //创建随机类对象
        Random random = new Random();
        System.out.println("随机数组为：");
        for (int i = 0; i < array.length; i++) {
            // x~y : (y-x+1)+x
            array[i] = random.nextInt(68)+89;
            System.out.println(array[i]);
        }
        System.out.println("数组中索引和对应的元素都为偶数的数为：");
        // 创建计数器
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(i%2==0 && array[i]%2==0){
                System.out.println(i + " : "+array[i]);
                count++;
            }
        }
        System.out.println("总个数为："+count);
    }

}
