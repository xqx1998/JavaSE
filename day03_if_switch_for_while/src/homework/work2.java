package homework;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/19 19:07
 * description:第二题:
 * 	分析以下需求，并用代码实现(if语句)：
 * 	1.功能描述:键盘录入一个变量代表月份，输出对应的季节
 * 	2.要求:
 * 		(1)录入一个整数(代表月份,范围1-12)
 * 		(2)输出该月份对应的季节
 * 			3,4,5春季
 * 			6,7,8夏季
 * 			9,10,11秋季
 * 			12,1,2冬季
 * 		(3)演示格式如下:
 * 			录入月份:3
 * 			输出:3月份是春季
 * 		提示:超过两种可能就要用到if的第三种格式. 冬季月份不能用范围表示,可以一个个写出来用逻辑运算符连接
 */
public class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("录入月份：");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("输出：" + month + "月份有误");
            } else {
                if (month == 3 || month == 4 || month == 5) {
                    System.out.println("输出：" + month + "月份是春季");
                } else if (month == 6 || month == 7 || month == 8) {
                    System.out.println("输出：" + month + "月份是夏季");
                } else if (month == 9 || month == 10 || month == 11) {
                    System.out.println("输出：" + month + "月份是秋季");
                } else {
                    System.out.println("输出：" + month + "月份是冬季");
                }
            }
        }
    }
}
