package homework.homework_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 19:56
 * description:
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            ArrayList<Integer> integers = new ArrayList<>();
            //玩家输入号码

            for (int i1 = 0; i1 < 6; i1++) {
                System.out.println("请输入第" + (i1 + 1) + "个红球号码");
                integers.add(scanner.nextInt());
            }
            System.out.println("请输入篮球号码：");
            integers.add(scanner.nextInt());

            System.out.println();

            //获取生成的双色球号码
            ArrayList<Integer> nums = new DichroicBall().getNums();
            for (int i1 = 0; i1 < nums.size(); i1++) {
                if (nums.get(i1) == integers.get(i1)) {
                    count++;
                }
            }
            System.out.println("输入的：");
            //遍历输入的：
            integers.forEach(in -> System.out.print(in + "  "));
            System.out.println();
            System.out.println("生成的:");
            //遍历生成的
            nums.forEach(num -> System.out.print(num+"  "));
            System.out.println();
            System.out.println("共有" + count + "次猜中");
        }
    }
}
