package com.xqx.A03_calendarDemo;

import java.lang.ref.Cleaner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Calendar Ϊ�ض�˲����һ�������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶ��ṩ��һЩ����

    Calendar �ṩ��һ���෽�� getInstance ���ڻ�ȡ�������͵�һ�����õĶ��󣬸÷�������һ�� Calendar ����
    �������ֶ���ʹ�õ�ǰ���ں�ʱ���ʼ����Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
       //��ȡ����
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        int year = calendar.get(Calendar.YEAR);
        int month= calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DATE);
        System.out.println(year+"��"+(month)+"��"+day+"��");
        calendar.set(2014,5,1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        calendar.add(Calendar.DATE, 3000);
        System.out.println(getString(calendar));
        System.out.println(simpleDateFormat.format(calendar.getTime()));

    }

    public static String getString(Calendar calendar){
        return calendar.get(Calendar.YEAR)+"-"+(calendar.get(Calendar.MONTH)+1)+"-"
                +calendar.get(Calendar.DATE);
    }
}