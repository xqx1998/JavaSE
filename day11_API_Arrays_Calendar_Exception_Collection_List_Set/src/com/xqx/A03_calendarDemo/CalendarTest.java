package com.xqx.A03_calendarDemo;

import java.util.Calendar;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 16:31
 * description: 获取任意一年的二月份共有多少天
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("请输入年份：");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        calendar.set(year,2,1); //月份是从0开始计算的
        calendar.add(Calendar.DATE,-1);
        System.out.println(year+"年的二月份有"+calendar.get(Calendar.DATE));

    }
}
