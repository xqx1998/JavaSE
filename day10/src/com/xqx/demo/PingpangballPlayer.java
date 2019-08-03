package com.xqx.demo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 16:41
 * description:
 */
public class PingpangballPlayer extends Player implements SpeakEnglish{
    @Override
    public void learn() {
        System.out.println("乒乓球运动员 学习");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员 吃饭");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员 说英语");

    }
}
