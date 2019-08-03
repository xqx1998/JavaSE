package com.xqx_2;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        //创建扫描器对象Scanner​(InputStream source)
        Scanner sc=new Scanner(System.in);

        //获取整型数
        int i = sc.nextInt();
        System.out.println("i = " + i);
        //获取字符串
//        String s = sc.nextLine();
        String s = sc.next();
        System.out.println("s = " + s);
    }
}
