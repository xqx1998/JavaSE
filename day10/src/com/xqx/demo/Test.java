package com.xqx.demo;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 16:37
 * description:
 */
public class Test {
    public static void main(String[] args) {
        //����ƹ������������
        PingpangballCoach pingpangballCoach = new PingpangballCoach();
        pingpangballCoach.setName("������");
        pingpangballCoach.setAge(99);
        System.out.println(pingpangballCoach.toString());
        pingpangballCoach.eat();
        pingpangballCoach.teach();
        pingpangballCoach.speakEnglish();
        System.out.println("-----------------------");

        //����ƹ�����˶�Ա�����
        PingpangballPlayer pingpangballPlayer = new PingpangballPlayer();
        pingpangballPlayer.setName("�����");
        pingpangballPlayer.setAge(18);
        System.out.println(pingpangballPlayer.toString());
        pingpangballPlayer.eat();
        pingpangballPlayer.learn();
        pingpangballPlayer.speakEnglish();
        System.out.println("-----------------------");

        // ������������� ����
        BasketballCoach basketballCoach = new BasketballCoach();
        basketballCoach.setName("����");
        basketballCoach.setAge(23);
        System.out.println(basketballCoach.toString());
        basketballCoach.eat();
        basketballCoach.teach();
        System.out.println("-----------------------");

        // ���������˶�Ա�� ����
        BasketballPlayer basketballPlayer = new BasketballPlayer();
        basketballPlayer.setName("��Ȩ��");
        basketballPlayer.setAge(8);
        System.out.println(basketballPlayer.toString());
        basketballPlayer.eat();
        basketballPlayer.learn();
        System.out.println("-----------------------");
    }
}
