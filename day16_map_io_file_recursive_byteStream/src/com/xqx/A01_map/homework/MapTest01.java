package com.xqx.A01_map.homework;

import java.util.*;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/10 14:23
 * description:5,¼��һ���ַ���,ͳ��ÿ����ĸ���ֵĴ���
 * 	����:abeljjadkk	��ʽ:a(2)b(1)..
 */
public class MapTest01 {
    public static void main(String[] args) {
        System.out.println("�������ַ�����");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        // ����HashMap����
        HashMap<String, Integer> map = new HashMap<>();
        // ���ַ�����ַ���list������
        List<String> strings = Arrays.asList(str.split(""));
        // System.out.println(strings);
        // ���� list������
        for (int i = 0; i < strings.size(); i++) {
            // �жϻ�ȡ��Ԫ���Ƿ�Ϊ�գ���Ϊ����������
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
        // ����map����
        map.forEach((i,s) -> System.out.print(i+"("+s+")"));
    }
}
