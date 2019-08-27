package com.xqx.A03_calendarDemo;

import java.lang.ref.Cleaner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
    Calendar 为特定瞬间与一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法

    Calendar 提供了一个类方法 getInstance 用于获取这种类型的一般有用的对象，该方法返回一个 Calendar 对象，
    其日历字段已使用当前日期和时间初始化：Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
       //获取对象
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);
        int year = calendar.get(Calendar.YEAR);
        int month= calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DATE);
        System.out.println(year+"年"+(month)+"月"+day+"日");
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