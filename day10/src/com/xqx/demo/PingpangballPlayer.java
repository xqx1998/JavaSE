package com.xqx.demo;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 16:41
 * description:
 */
public class PingpangballPlayer extends Player implements SpeakEnglish{
    @Override
    public void learn() {
        System.out.println("ƹ�����˶�Ա ѧϰ");
    }

    @Override
    public void eat() {
        System.out.println("ƹ�����˶�Ա �Է�");
    }

    @Override
    public void speakEnglish() {
        System.out.println("ƹ�����˶�Ա ˵Ӣ��");

    }
}
