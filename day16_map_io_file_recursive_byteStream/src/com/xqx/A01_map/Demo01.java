package com.xqx.A01_map;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/10 14:21
 * description: ��֪����ʱʱ�ʿ����ں���ʱ��(20190810) + ����(001)����:20190810001
 * * һ�쿪��120��(����ƽ��ʱ�ο���)
 * *
 * * ��Ҫ��: ����¼��һ���ں�  ��д����,������ں�ʱ����?(��ʽ:  2018��08��10��  00:15:00)
 */
public class Demo01 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        int instanceTime = 24*60*60/120+24*60*60%120;
        System.out.println("instanceTime = " + instanceTime);
        while (true) {
            System.out.println("�������ںţ�");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            if (next.length()==11) {
                instance.set(Integer.valueOf(next.substring(0, 4)),  //��
                        Integer.valueOf(next.substring(4, 6)) - 1, //��
                        Integer.valueOf(next.substring(6, 8))+Integer.valueOf(next.substring(8, 11)) * instanceTime/60/60/24,  //��
                        Integer.valueOf(next.substring(8, 11)) * instanceTime/60/60%24, //ʱ
                        Integer.valueOf(next.substring(8, 11)) * instanceTime/60%60,  //��
                        Integer.valueOf(next.substring(8, 11)) * instanceTime%60);  //��
                Date time = instance.getTime();  //��ȡ���ɵ�ʱ��
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");  //�����ʽ
                System.out.println(simpleDateFormat.format(time));
            }else{
                System.out.println("��ʽ����ȷ��������11λ����");
            }
        }
    }
}
