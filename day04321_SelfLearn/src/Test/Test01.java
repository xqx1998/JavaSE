package Test;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 11:35
 * description:��һ��:
 * 	���׼�����
 * 	xqxfixme��1.���ű仯�������� 2.�������㲻�ȶ�������
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println("���׼�������");
        System.out.println("ʹ��˵����������ʽ�ԡ�=�����������»س���");
        Scanner scanner = new Scanner(System.in);
        //���������洢���ʽ��
        String expire = scanner.next();
        //���������洢 �����ַ�����ʼλ��
        int len = 0;
        // System.out.println((int)'+'); //43
        // System.out.println((int)'-'); //45
        // System.out.println((int)'*'); //42
        // System.out.println((int)'/'); //47
        // System.out.println((int)'='); //61
        double result = 0;
        int temp = 0;
        for (int i = 0; i < expire.length(); i++) {
            // System.out.println((int)expire.charAt(i));
            int charInt = (int)expire.charAt(i);
            if (charInt==43||charInt==45||charInt==42||charInt==47||charInt==61){
                if(charInt==43){
                    temp = 43;
                    result+=Integer.valueOf(expire.substring(len, i)).intValue();
                }
                if(charInt==45){
                    if(len==0){
                        result = Integer.valueOf(expire.substring(len, i)).intValue()*2;
                    }
                    temp = 45;
                    result-=Integer.valueOf(expire.substring(len, i)).intValue();
                }
                if(charInt==42){
                    if(len==0){
                        result = 1;
                    }
                    temp = 42;
                    result*=Integer.valueOf(expire.substring(len, i)).intValue();
                }
                if(charInt==47){
                    //�ж��Ƿ�Ϊ��һ����Ч���֣�������result��ֵΪ1
                    if(len==0){
                        result = 1;
                    }
                    temp = 47;
                    result=(result*1.0)/(Integer.valueOf(expire.substring(len, i)).intValue());
                    // System.out.println(result);
                }
                if(charInt==61){
                    if(temp==43){
                        temp = 43;
                        result+=Integer.valueOf(expire.substring(len, i)).intValue();
                    }
                    if(temp==45){
                        temp = 45;
                        result-=Integer.valueOf(expire.substring(len, i)).intValue();
                    }
                    if(temp==42){
                        temp = 42;
                        result*=Integer.valueOf(expire.substring(len, i)).intValue();
                    }
                    if(temp==47){
                        temp = 47;
                        result=(result*1.0)/(Integer.valueOf(expire.substring(len, i)).intValue());
                    }
                    System.out.println(result);
                }
                len = i+1;
            }
        }

    }
}
