package com.xqx.A03_calendarDemo;

import java.util.Calendar;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 16:31
 * description: ��ȡ����һ��Ķ��·ݹ��ж�����
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("��������ݣ�");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        calendar.set(year,2,1); //�·��Ǵ�0��ʼ�����
        calendar.add(Calendar.DATE,-1);
        System.out.println(year+"��Ķ��·���"+calendar.get(Calendar.DATE));

    }
}
