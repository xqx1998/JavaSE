package Test;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/18 19:30
 * description:
 */

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����λ��");
        int num1 = sc.nextInt();
        System.out.println("������ڶ�����λ��");
        int num2 = sc.nextInt();
        System.out.println("�������һ������λ��");
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
        System.out.println("���������ĸ�λ��ӵã�");
        System.out.println(ge1 + "+" + ge2 + "+" + ge3 + "=" + (ge1 + ge2 + ge3));
        System.out.println("=========");
        System.out.println("����������ʮλ��ӵã�");
        System.out.println(shi1 + "+" + shi2 + "+" + shi3 + "=" + (shi1 + shi2 + shi3));
        System.out.println("=========");
        System.out.println("���������İ�λλ��ӵã�");
        System.out.println(bai1 + "+" + bai2 + "+" + bai3 + "=" + (bai1 + bai2 + bai3));
    }
}