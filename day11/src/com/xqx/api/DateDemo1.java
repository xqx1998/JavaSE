package com.xqx.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 15:08
 * description:
 */
/*
    public long getTime():��ȡ�������ڶ����1970��1��1�� 00:00:00�����ڵĺ���ֵ
    public void setTime(long time):����ʱ�䣬�����Ǻ���ֵ
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //�������ڶ���
        Date d = new Date();

        //public long getTime():��ȡ�������ڶ����1970��1��1�� 00:00:00�����ڵĺ���ֵ
//        System.out.println(d.getTime());
//        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "��");

        //public void setTime(long time):����ʱ�䣬�����Ǻ���ֵ
//        long time = 1000*60*60;
        long time = System.currentTimeMillis();
        d.setTime(time);

        System.out.println(d);

        //��ʽ������Date��String
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
        String format = simpleDateFormat.format(d);
        System.out.println(format);

        //�� String �� Date
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

