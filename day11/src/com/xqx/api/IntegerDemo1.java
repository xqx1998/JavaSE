package com.xqx.api;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 14:47
 * description:
 */
/*
    װ�䣺�ѻ�����������ת��Ϊ��Ӧ�İ�װ������
    ���䣺�Ѱ�װ������ת��Ϊ��Ӧ�Ļ�����������
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        //װ�䣺�ѻ�����������ת��Ϊ��Ӧ�İ�װ������
        Integer i = Integer.valueOf(100);
        Integer ii = 100; //Integer.valueOf(100);

        //ii += 200;
        // ii = ii + 200;
        // ii = ii.intValue() + 200;
        // ii = 300;
        ii += 200;
        System.out.println(ii);

        Integer iii = null;
//        iii += 100; //NullPointerException
        if(iii != null) {
            iii += 100;
        }

    }
}