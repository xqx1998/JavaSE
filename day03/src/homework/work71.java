package homework;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/19 19:45
 * description:1.从控制台输入5个数求和求平均值
 */
public class work71 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+i+1+"个数：");
            sum += sc.nextInt();
        }
        System.out.println("平均值为："+sum/5);
    }
}
