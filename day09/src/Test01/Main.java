package Test01;

import java.util.Random;
import java.util.Scanner;

/**
 * 21.�������⡿
 * ��Ҫ����main������������¹��ܣ�
 * ? ?1.?����һ������Ϊ5��int������arr������Ԫ��Ϊ1-99����Χ����1��99��֮����������
 * ????2.��������arr����ӡ��������Ԫ�أ�
 * ? ?3.��ʾ�û�����2-5֮���һ������num��num��Χ����2��5,����Ҫ�����жϣ���
 * ? ?4.ɸѡ��������Ԫ����num����������Ԫ�ز������
 */
public class Main {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99)+1;
        }
        System.out.println("������ɵ�����Ԫ��Ϊ��");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("������2-5֮���һ�����֣�");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("����������Ԫ��Ϊ��");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%num==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
