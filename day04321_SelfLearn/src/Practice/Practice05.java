package Practice;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第五题:
 * 	定义一个长度为5的int类型的数组，数组中元素由我们自己键盘录入。求出数组中的最小值，并判断最小值是否为偶数，
 * 	如果是偶数则输出“最小值为偶数”，如果不是偶数则输出“最小值为奇数”。
 */
public class Practice05 {
    public static void main(String[] args) {
        //动态创建数组
        int[] array = new int[5];
        //创建键入类对象
        Scanner scanner = new Scanner(System.in);
        //为数组第一个元素赋值
        System.out.println("请输入第1个数：");
        array[0] = scanner.nextInt();
        //创建最小值变量
        int min = array[0];
        //为数组赋值
        for (int i = 1; i < array.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数：");
            array[i] = scanner.nextInt();
            // 与最小值比较,若小则赋值给最小值
            if(min>array[i])
                min = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            //遍历数组元素
            System.out.println(array[i]);
        }
        if(min%2==0){
            System.out.println("最小值为偶数："+min);
        }else{
            System.out.println("最小值为奇数："+min);
        }
    }
}
