package ��Ȩ��;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 18:20
 * description:�ڶ���:
 * 	����������������¹���
 * 		1.���������������ѯ��:"�Ƿ����ʹ�ü����?"0��������,1�������
 * 		2.ѡ�����,������ֹ����
 * 		3.ѡ�񲻽���,���ٴο�ʼ����,ֱ������Ϊֹ
 */
public class Test02 {
    public static void main(String[] args) {
        //�������������
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("�������һ��������");
            int num1 = scanner.nextInt();
            System.out.println("������ڶ���������");
            int num2 = scanner.nextInt();
            System.out.println("������Ҫ���к�������(1����ӷ�,2�������,3����˷�,4�������ȡ��,5�������ȡ��):");
            //��������ָ�����
            int code = scanner.nextInt();
            switch (code) {
                case 1:
                    System.out.println(num1 + "��" + num2 + "֮��Ϊ��" + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + "��" + num2 + "֮��Ϊ��" + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + "��" + num2 + "֮��Ϊ��" + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println(num1 + "��" + num2 + "ȡ��Ϊ��" + (num1 / num2));
                    } else {
                        System.out.println("��������Ϊ0");
                    }
                    break;
                case 5:
                    System.out.println(num1 + "��" + num2 + "ȡ��Ϊ��" + (num1 % num2));
                    break;
            }
            System.out.println("�Ƿ����ʹ�ü����? 0��������,1�������");
            System.out.println("������ָ�");
            //������������ָ�����
            int code1 = scanner.nextInt();
            if (code1==1){
                break;
            }
        }while (true);
    }
}
