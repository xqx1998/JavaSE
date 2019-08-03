package com.xqx.demo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 16:37
 * description:
 */
public class Test {
    public static void main(String[] args) {
        //创建乒乓球教练类对象
        PingpangballCoach pingpangballCoach = new PingpangballCoach();
        pingpangballCoach.setName("风清扬");
        pingpangballCoach.setAge(99);
        System.out.println(pingpangballCoach.toString());
        pingpangballCoach.eat();
        pingpangballCoach.teach();
        pingpangballCoach.speakEnglish();
        System.out.println("-----------------------");

        //创建乒乓球运动员类对象
        PingpangballPlayer pingpangballPlayer = new PingpangballPlayer();
        pingpangballPlayer.setName("令狐冲");
        pingpangballPlayer.setAge(18);
        System.out.println(pingpangballPlayer.toString());
        pingpangballPlayer.eat();
        pingpangballPlayer.learn();
        pingpangballPlayer.speakEnglish();
        System.out.println("-----------------------");

        // 创建篮球教练类 对象
        BasketballCoach basketballCoach = new BasketballCoach();
        basketballCoach.setName("老阳");
        basketballCoach.setAge(23);
        System.out.println(basketballCoach.toString());
        basketballCoach.eat();
        basketballCoach.teach();
        System.out.println("-----------------------");

        // 创建篮球运动员类 对象
        BasketballPlayer basketballPlayer = new BasketballPlayer();
        basketballPlayer.setName("倖权祥");
        basketballPlayer.setAge(8);
        System.out.println(basketballPlayer.toString());
        basketballPlayer.eat();
        basketballPlayer.learn();
        System.out.println("-----------------------");
    }
}
