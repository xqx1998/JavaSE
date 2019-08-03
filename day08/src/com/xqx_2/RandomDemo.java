package com.xqx_2;

import java.util.Random;

/*
    使用Random随机数对象
 */
public class RandomDemo {
    public static void main(String[] args) {
        //创建Random对象
        Random r=new Random(10L);
        //生成一个int类型的随机数[0-100)
        int i = r.nextInt(100);
        System.out.println(i);

        //生成一个随机的double数
        double d = r.nextDouble()*10;
        System.out.println("d = " + d);
        //生成一个随机的boolean数

        boolean f = r.nextBoolean();
        System.out.println("f = " + f);


    }
}
