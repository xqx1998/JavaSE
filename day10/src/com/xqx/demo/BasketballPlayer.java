package com.xqx.demo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 16:41
 * description:
 */
public class BasketballPlayer extends Player{
    @Override
    public void learn() {
        System.out.println("篮球运动员 学习");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员 吃饭");
    }
}
