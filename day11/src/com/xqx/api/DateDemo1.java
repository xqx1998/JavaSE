package com.xqx.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 15:08
 * description:
 */
/*
    public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
    public void setTime(long time):设置时间，给的是毫秒值
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //创建日期对象
        Date d = new Date();

        //public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
//        System.out.println(d.getTime());
//        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        //public void setTime(long time):设置时间，给的是毫秒值
//        long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);

        //格式化：从Date到String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = simpleDateFormat.format(d);
        System.out.println(format);

        //从 String 到 Date
        String ss = "2019-08-09 11:11:11";
        //ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = null;
        try {
            dd = sdf2.parse(ss);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dd);


    }
}

