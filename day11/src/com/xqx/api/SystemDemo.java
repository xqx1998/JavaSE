package com.xqx.api;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 9:33
 * description:
 */
public class SystemDemo {
    public static void main(String[] args) {
        /*
        System.out.println("��ʼ");
        //public static void exit(int status)����ֹ��ǰ���е� Java ������������ʾ�쳣��ֹ
        System.exit(0);
        System.out.println("����");
        */

        //public static long currentTimeMillis()�����ص�ǰʱ��(�Ժ���Ϊ��λ)
//        System.out.println(System.currentTimeMillis());

//        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "��");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("����ʱ��" + (end - start) + "����");
    }
}
