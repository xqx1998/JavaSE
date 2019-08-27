package com.xqx.A01_map.homework;

import java.util.*;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 0:14
 * description:斗地主案例
 */
public class FightAgainstLandlords {
    public static void main(String[] args) {
        //创建list集合存储所有玩家牌
        ArrayList<String> list = new ArrayList<>();
        //存储编号
        List<Integer> num = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors,"黑桃","红桃","梅花","方块");
        List<String> number = new ArrayList<>();
        Collections.addAll(number, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        //生成所有牌
        int count = 0;
        for (String s : number) {
            for (String color : colors) {
                list.add(color+s);
                num.add(count++);
            }
        }
        //添加大小王
        list.add("大王");
        num.add(count++);
        list.add("小王");
        num.add(count++);
        System.out.println("洗牌前");
        for (Integer integer : num) {
            System.out.print(list.get(integer)+"  ");
        }
        System.out.println();
        Collections.shuffle(num);
        System.out.println("洗牌后");
        for (Integer integer : num) {
            System.out.print(list.get(integer)+"  ");
        }
        System.out.println();
        //发牌
        HashMap<String, LinkedHashMap<Integer, String>> post = new LinkedHashMap<>();  //存放位置按次序
        // HashMap<String, TreeSet<String>> post = new HashMap<>(); 存放位置不安次序
        LinkedHashMap<Integer, String> player1 = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> player2 = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> player3 = new LinkedHashMap<>();

        for (int i = 0; i < num.size() - 3; i++) {
            if (i%3==0){
                player1.put(i,list.get(i));
            }
            if (i%3==1){
                player2.put(i,list.get(i));
            }
            if (i%3==2){
                player3.put(i,list.get(i));
            }
        }
        int random = new Random().nextInt(3);
        System.out.println("地主：玩家"+(random+1));
        System.out.println("底牌：");
        for (int i = num.size() - 3; i < num.size(); i++) {
            System.out.print(list.get(i)+"  ");
            if (random==0){
                player1.put(i,list.get(i));
            }
            if (random==1){
                player2.put(i,list.get(i));
            }
            if (random==2){
                player3.put(i,list.get(i));
            }
        }
        System.out.println();
        // 将发好的牌放入玩家牌map集合中
        post.put("玩家1",player1);
        post.put("玩家2",player2);
        post.put("玩家3",player3);

        //查看玩家的牌
        for (String s : post.keySet()) {
            System.out.print(s+":");
            for (String value : post.get(s).values()) {
                System.out.print(value+"  ");
            }
            System.out.println();
        }
    }
}

