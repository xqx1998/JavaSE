package Test;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 11:35
 * description:��һ��:
 * 	���׼�����
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println((int)'(');
        System.out.println((int)')');
        System.out.println("���׼�������");
        System.out.println("ʹ��˵����������ʽ�ԡ�=�����������»س���");
        Scanner scanner = new Scanner(System.in);
        //���������洢���ʽ��
        String expire = scanner.next();
        //���������洢 �����ַ�����ʼλ��
        int len = 0;
        //������ֵ����洢����
        int index1 = 0;
        //�����������洢����
        int index2 = 0;
        //������
        double result = 0;
        //������ֵ����
        int[] array1 = new int[expire.length()];
        //������������
        int[] array2 = new int[expire.length()];
        //�����и���ʽ���ֱ���ֵ�ͷ��Ŵ浽array1,array2
        for (int i = 0; i < expire.length(); i++) {
            //�������ʽÿһ���ַ�
            int charInt = (int)expire.charAt(i);
            //�ж��ַ��Ƿ�Ϊ + - * /
            if (charInt==43||charInt==45||charInt==42||charInt==47||charInt==61) {
                //�и� �洢��ֵ
                array1[index1] = Integer.valueOf(expire.substring(len, i)).intValue();
                //�洢���Ŷ�Ӧ��������ֵ
                array2[index2] = charInt;
                //������1
                index2++;
                index1++;
                //�иʼֵ
                len = i+1;
            }

        }
        for (int i = 0; i < array1.length; i++) {
            //������
            if(array2[i]==43){
                //�ж��Ƿ�Ϊ��һ�����ţ����ǣ���������ֵ�����ڵ�һ��ֵ�͵ڶ���ֵ
                if(i==0) {
                    result = array1[i] + array1[i + 1];
                }else{
                    result += array1[i+1];
                }
            }
            //������
            if(array2[i]==45){
                //�ж��Ƿ�Ϊ��һ�����ţ����ǣ���������ֵ�����ڵ�һ��ֵ�͵ڶ���ֵ
                if(i==0) {
                    result = array1[i] - array1[i + 1];
                }else{
                    result -= array1[i+1];
                }
            }
            //������
            if(array2[i]==42){
                //�ж��Ƿ�Ϊ��һ�����ţ����ǣ���������ֵ�����ڵ�һ��ֵ�͵ڶ���ֵ
                if(i==0) {
                    result = array1[i] * array1[i + 1];
                }else{
                    result *= array1[i+1];
                }
            }
            //������
            if(array2[i]==47){
                //�ж��Ƿ�Ϊ��һ�����ţ����ǣ���������ֵ�����ڵ�һ��ֵ�͵ڶ���ֵ
                if(i==0) {
                    result = array1[i] / array1[i + 1];
                }else{
                    result /= array1[i+1];
                }
            }
        }
        // ������
        System.out.println(result);
        //������ֵ����
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+"  ");
        }
        //������������
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+"  ");
        }

    }
}
