package com.xqx.A01_map.homework;

import java.util.*;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/10 14:23
 * description:5,录入一个字符串,统计每个字母出现的次数
 * 	例如:abeljjadkk	格式:a(2)b(1)..
 */
public class MapTest01 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // 创建HashMap对象
        HashMap<String, Integer> map = new HashMap<>();
        // 将字符串拆分放在list对象中
        List<String> strings = Arrays.asList(str.split(""));
        // System.out.println(strings);
        // 遍历 list对象那
        for (int i = 0; i < strings.size(); i++) {
            // 判断获取的元素是否为空，不为空则进入操作
            if (!strings.get(i).equals("")) {
                int count = 1;
                String s = strings.get(i);
                // System.out.println(s);
                for (int i1 = i + 1; i1 < strings.size(); i1++) {
                    if (s.equals(strings.get(i1))) {
                        strings.set(i1, "");
                        count++;
                    }
                }
                strings.set(i, "");
                map.put(s, count);
            }

        }
        // System.out.println(A01_map);
        // 遍历map集合
        map.forEach((i,s) -> System.out.print(i+"("+s+")"));
    }
}
