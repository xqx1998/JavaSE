package Test;

import A02_Scanner.ScannerTest;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/17 20:01
 * description:
 * ������:
 * 	1.����¼��һ����λ���������д����ֱ��ȡ����λ���ϸ�λ��ʮλ����λÿһλ����ֵ
 * 	2.���磺����123�ĸ�λ��ʮλ����λ���ֱ���3��2��1
 * 	3.����λ,ʮλ,��λ��ӡ����.(�ںڴ��������ʾ��:"����123�ĸ�λ��3,ʮλ��2,��λ��1")
 * 		��ʾ:����/��%�����
 */
public class HelloWorld {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ������");
        int a = scanner.nextInt();
        int a3 = a/100;
        int a2 = (a/10)%10;
        int a1 = a%10;

        System.out.println(a3 + ", " + a2 + ", " + a1);
        // System.out.println("������ڶ�������");
        // System.out.println("���������������");
    }
}
