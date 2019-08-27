package com.xqx.A01_map;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/10 14:21
 * description: 已知重庆时时彩开奖期号由时间(20190810) + 期数(001)构成:20190810001
 * * 一天开奖120期(当做平均时段开奖)
 * *
 * * 现要求: 键盘录入一个期号  编写程序,计算该期何时开奖?(格式:  2018年08月10日  00:15:00)
 */
public class Demo01 {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);
        int instanceTime = 24*60*60/120+24*60*60%120;
        System.out.println("instanceTime = " + instanceTime);
        while (true) {
            System.out.println("请输入期号：");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            if (next.length()==11) {
                instance.set(Integer.valueOf(next.substring(0, 4)),  //年
                        Integer.valueOf(next.substring(4, 6)) - 1, //月
                        Integer.valueOf(next.substring(6, 8))+Integer.valueOf(next.substring(8, 11)) * instanceTime/60/60/24,  //日
                        Integer.valueOf(next.substring(8, 11)) * instanceTime/60/60%24, //时
                        Integer.valueOf(next.substring(8, 11)) * instanceTime/60%60,  //分
                        Integer.valueOf(next.substring(8, 11)) * instanceTime%60);  //秒
                Date time = instance.getTime();  //获取生成的时间
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");  //定义格式
                System.out.println(simpleDateFormat.format(time));
            }else{
                System.out.println("格式不正确！请输入11位数字");
            }
        }
    }
}
