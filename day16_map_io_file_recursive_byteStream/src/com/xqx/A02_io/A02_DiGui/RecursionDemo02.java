package com.xqx.A02_io.A02_DiGui;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 14:18
 * description:�ݹ鰸��1
 *  �Ա�̵ĽǶ��������ݹ�ָ���Ƿ��������е��÷������������
 *  ����
 *         �õݹ���5�Ľ׳ˣ����ѽ���ڿ���̨���
 */
public class RecursionDemo02 {
    public static void main(String[] args) {
        System.out.println("10 �� �׳��ǣ�"+getFactorial(10L));
        System.out.println("10 �� �׳��ǣ�"+1*2*3*4*5*6*7*8*9*10);
        System.out.println("��������׳˵�����");
        long num = new Scanner(System.in).nextLong();
        System.out.println(num+"�� �׳��ǣ�"+getFactorial(num));

    }

    public static Long getFactorial(Long num){
        // �ж��Ƿ����1
        if (num==1L){ //��,����1
           return 1L;
        }else  //���Ƿ���getFactorial(num-1)*num
            return getFactorial(num-1)*num;
    }

}
