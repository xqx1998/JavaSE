package com.xqx.demo;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 16:41
 * description:
 */
public class PingpangballCoach extends Coach implements SpeakEnglish{

    @Override
    public void teach() {
        System.out.println("ƹ������� ��ѧ");
    }

    @Override
    public void eat() {
        System.out.println("ƹ������� �Է�");
    }

    @Override
    public void speakEnglish() {
        System.out.println("ƹ������� ˵Ӣ��");
    }
}
