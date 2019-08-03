package 倖权祥;

import java.util.Random;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 18:48
 * description:第四题:
 * 定义一个长度为10的int类型数组,数据由随机数产生(1-100),求满足条件的元素的平均数
 * 满足条件的元素:值大于该数组平均数的元素
 */
public class Test04 {
    public static void main(String[] args) {
        //动态创建数组
        int[] array = new int[10];
        //创建随机类对象
        Random random = new Random();
        //创建元素总和变量
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            //(x+y-1)+x
            array[i] = random.nextInt(100)+1;
            sum += array[i];
        }
        System.out.println("数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        double average = sum*1.0/(array.length);
        System.out.println("平均值为："+average);
        for (int i = 0; i < array.length; i++) {
            if (array[i]>average){
                System.out.print(array[i]+"  ");
            }
        }
    }
}
