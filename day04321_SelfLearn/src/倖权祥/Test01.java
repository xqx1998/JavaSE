package ��Ȩ��;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 18:05
 * description:��һ��:
 * 	1.Ҫ��������������ѧ��֪ʶ���һ�����׼��������,�ܹ����мӼ��˳�����,��ʾʾ������:
 * 		�������һ������:
 * 		5
 * 		������ڶ�������:
 * 		6
 * 		������Ҫ���к�������(1����ӷ�,2�������,3����˷�,4�������ȡ��,5�������ȡ��):
 * 		1
 * 		5��6֮��Ϊ:11
 */
public class Test01 {
    public static void main(String[] args) {
        //�������������
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������һ��������");
        int num1 = scanner.nextInt();
        System.out.println("������ڶ���������");
        int num2 = scanner.nextInt();
        System.out.println("������Ҫ���к�������(1����ӷ�,2�������,3����˷�,4�������ȡ��,5�������ȡ��):");
        //��������ָ�����
        int code = scanner.nextInt();
        switch (code){
            case 1:
                System.out.println(num1+"��"+num2+"֮��Ϊ��"+(num1+num2));
                break;
            case 2:
                System.out.println(num1+"��"+num2+"֮��Ϊ��"+(num1-num2));
                break;
            case 3:
                System.out.println(num1+"��"+num2+"֮��Ϊ��"+(num1*num2));
                break;
            case 4:
                if(num2!=0) {
                    System.out.println(num1 + "��" + num2 + "ȡ��Ϊ��" + (num1 / num2));
                }else{
                    System.out.println("��������Ϊ0");
                }
                break;
            case 5:
                System.out.println(num1+"��"+num2+"ȡ��Ϊ��"+(num1%num2));
                break;
        }
    }
}
