import java.util.Random;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/20 11:57
 * description:
 */
public class DichroicBall {
    public static void main(String[] args) {
        //双色球：
//     红球6个：1-33
//     蓝球1个：1-15
//  中奖号码为：

        Random rd = new Random();
        //声明开奖存放红球的数组
        int[] red = new int[6];
        //声明所有红球的数组
        int[] all = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        for (int i = 0; i < red.length; i++) {
            while (true) {
                //随机all数组的索引
                int num = rd.nextInt(33);
                if (all[num] != 0) {
                    red[i] = all[num];
                    all[num] = 0;
                    break;
                }
            }
        }
//  System.out.println("红球的号码为：");
//  for (int i = 0; i < red.length; i++) {
//   System.out.print(red[i]+" ");
//  }
//  System.out.println("");
//  System.out.println("蓝球的号码为：");
        int blue = rd.nextInt(15) % (15 - 1 + 1) + 1;
//  System.out.println(blue);

        Scanner input = new Scanner(System.in);
        //声明玩家输入红球号码的数组
        int[] player = new int[6];
        for (int i = 0; i < player.length; i++) {
            System.out.println("请输入您要买的第" + (i + 1) + "个红球号码：");
            int reds = input.nextInt();
            player[i] = reds;
        }
        System.out.println("您输入的红球号码为：");
        for (int i = 0; i < player.length; i++) {
            System.out.print(player[i] + " ");
        }
        //定义玩家输入的蓝球数
        System.out.println("请您输入要买的蓝球号码：");
        int blues = input.nextInt();

        boolean flag = true;
        for (int i = 0; i < red.length; i++) {
            if (red[i] == player[i]) {
                if (blue == blues) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("恭喜您中奖了！");
        } else {
            System.out.println("对不起！您未中奖！");
        }
    }
}
