package com.xqx.A01_map.homework;

import java.util.*;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 0:14
 * description:����������
 */
public class FightAgainstLandlords {
    public static void main(String[] args) {
        //����list���ϴ洢���������
        ArrayList<String> list = new ArrayList<>();
        //�洢���
        List<Integer> num = new ArrayList<>();
        List<String> colors = new ArrayList<>();
        Collections.addAll(colors,"����","����","÷��","����");
        List<String> number = new ArrayList<>();
        Collections.addAll(number, "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        //����������
        int count = 0;
        for (String s : number) {
            for (String color : colors) {
                list.add(color+s);
                num.add(count++);
            }
        }
        //��Ӵ�С��
        list.add("����");
        num.add(count++);
        list.add("С��");
        num.add(count++);
        System.out.println("ϴ��ǰ");
        for (Integer integer : num) {
            System.out.print(list.get(integer)+"  ");
        }
        System.out.println();
        Collections.shuffle(num);
        System.out.println("ϴ�ƺ�");
        for (Integer integer : num) {
            System.out.print(list.get(integer)+"  ");
        }
        System.out.println();
        //����
        HashMap<String, LinkedHashMap<Integer, String>> post = new LinkedHashMap<>();  //���λ�ð�����
        // HashMap<String, TreeSet<String>> post = new HashMap<>(); ���λ�ò�������
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
        System.out.println("���������"+(random+1));
        System.out.println("���ƣ�");
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
        // �����õ��Ʒ��������map������
        post.put("���1",player1);
        post.put("���2",player2);
        post.put("���3",player3);

        //�鿴��ҵ���
        for (String s : post.keySet()) {
            System.out.print(s+":");
            for (String value : post.get(s).values()) {
                System.out.print(value+"  ");
            }
            System.out.println();
        }
    }
}

