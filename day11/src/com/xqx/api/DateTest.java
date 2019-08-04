package com.xqx.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 15:35
 * description:
 */
public class DateTest {
    public static void main(String[] args) {
        String startDate = "2014-06-01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parseStartDate = null;
        try {
            parseStartDate = simpleDateFormat.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parseStartDate);
        System.out.println("parseStartDate.getTime() = " + parseStartDate.getTime());
        long result = parseStartDate.getTime() + (3000 * 24 * 60 * 60 * 1000);
        System.out.println(result);
        System.out.println(simpleDateFormat.format(result));

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd"); // ��ʽ��
        Calendar c = Calendar.getInstance();
        c.set(2014, 5, 1); // ��ʼ���ڣ�ע���·��Ǵ�0��ʼ��
        c.add(Calendar.DAY_OF_YEAR, 3000);// �����3000��
        System.out.println(df.format(c.getTime()));
    }
}
