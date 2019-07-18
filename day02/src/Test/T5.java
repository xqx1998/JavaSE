package Test;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/18 19:30
 * description:
 */

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个三位数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个三位数");
        int num2 = sc.nextInt();
        System.out.println("请输入第一三个三位数");
        int num3 = sc.nextInt();
        int ge1 = num1 % 10;
        int shi1 = num1 / 10 % 10;
        int bai1 = num1 / 10 / 10 % 10;
        int ge2 = num2 % 10;
        int shi2 = num2 / 10 % 10;
        int bai2 = num2 / 10 / 10 % 10;
        int ge3 = num3 % 10;
        int shi3 = num3 / 10 % 10;
        int bai3 = num3 / 10 / 10 % 10;
        System.out.println("该三个数的个位相加得：");
        System.out.println(ge1 + "+" + ge2 + "+" + ge3 + "=" + (ge1 + ge2 + ge3));
        System.out.println("=========");
        System.out.println("该三个数的十位相加得：");
        System.out.println(shi1 + "+" + shi2 + "+" + shi3 + "=" + (shi1 + shi2 + shi3));
        System.out.println("=========");
        System.out.println("该三个数的百位位相加得：");
        System.out.println(bai1 + "+" + bai2 + "+" + bai3 + "=" + (bai1 + bai2 + bai3));
    }
}