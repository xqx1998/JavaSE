package Practice;

import java.awt.*;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:��һ��:
 * 	����¼�������ε������߳�,�ж�����������߳��ܷ񹹳�������?
 * 		��ʾ:�����ι�������:��������֮�ʹ��ڵ�����
 */
public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ���߳���");
        int num1 = scanner.nextInt();
        System.out.println("������ڶ����߳���");
        int num2 = scanner.nextInt();
        System.out.println("������������߳���");
        int num3 = scanner.nextInt();
        if(num1+num2>num3 && num1+num3>num2 && num2+num3>num1){
            System.out.println("�ܹ��������Σ����߳��ֱ�Ϊ��"+num1+", "+num2+", "+num3);
        }else{
            System.out.println("���ܹ��������Σ����������������������ߴ��ڵ�����");
        }
    }
}
