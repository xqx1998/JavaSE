package ��Ȩ��;

import java.util.Random;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 18:48
 * description:������:
 * ����һ������Ϊ10��int��������,���������������(1-100),������������Ԫ�ص�ƽ����
 * ����������Ԫ��:ֵ���ڸ�����ƽ������Ԫ��
 */
public class Test04 {
    public static void main(String[] args) {
        //��̬��������
        int[] array = new int[10];
        //������������
        Random random = new Random();
        //����Ԫ���ܺͱ���
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            //(x+y-1)+x
            array[i] = random.nextInt(100)+1;
            sum += array[i];
        }
        System.out.println("����Ϊ��");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        double average = sum*1.0/(array.length);
        System.out.println("ƽ��ֵΪ��"+average);
        for (int i = 0; i < array.length; i++) {
            if (array[i]>average){
                System.out.print(array[i]+"  ");
            }
        }
    }
}
