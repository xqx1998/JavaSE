package com.xqx.A04_Exception;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 17:56
 * description:
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("�����������");
        Scanner scanner = new Scanner(System.in);
        int score  = scanner.nextInt();
        System.out.println("��ʼ");
        try {
            new Teacher().checkScoreException(score);
        } catch (ScoreException e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("����");
    }
}
