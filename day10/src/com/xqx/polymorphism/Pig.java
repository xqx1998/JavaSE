package com.xqx.polymorphism;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 14:39
 * description:
 */
public class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("���ײ�");
    }

    public void play(){
        System.out.println("��ȥ��");
    }
}
