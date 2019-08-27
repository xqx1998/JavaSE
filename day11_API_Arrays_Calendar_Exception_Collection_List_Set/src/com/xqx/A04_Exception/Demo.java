package com.xqx.A04_Exception;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 17:56
 * description:
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner scanner = new Scanner(System.in);
        int score  = scanner.nextInt();
        System.out.println("开始");
        try {
            new Teacher().checkScoreException(score);
        } catch (ScoreException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
