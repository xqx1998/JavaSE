package homework;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/19 19:45
 * description:5.循环输入5个整数，打印5个数中的最大值和最小值
 * 	提示：
 * 		1.定义两个整型变量max和min保存第一次输入的数，默认将第一个数最为最大值和最小值
 * 		2.循环接收另外4个数，分别和max和min比较大小，找到最大值和最小值
 */
public class work75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int max = sc.nextInt();
        int min = max;
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入数字：");
            temp = sc.nextInt();
            if(max<temp)
                max = temp;
            if(min>temp){
                min = temp;
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
