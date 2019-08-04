package com.xqx.listDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 19:02
 * description:
 */
public class ListDemo {
    /*
        ����
            ����һ�����ϣ�List<String> list = new ArrayList<String>();
            ����������Ԫ�أ�list.add("hello");list.add("world");list.add("java");
            �������ϣ��õ�ÿһ��Ԫ�أ�����û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ��

        ConcurrentModificationException:���������������޸�ʱ������ͨ����⵽����Ĳ����޸ĵķ������׳����쳣
     */
        public static void main(String[] args) {
            //�������϶���
            List<String> list = new ArrayList<String>();

            //���Ԫ��
            list.add("hello");
            list.add("world");
            list.add("java");

            //�������ϣ��õ�ÿһ��Ԫ�أ�����û��"world"���Ԫ�أ�����У��Ҿ����һ��"javaee"Ԫ�أ���д����ʵ��
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if(s.equals("world")) {
//                list.add("javaee");
//            }
//        }

            for(int i=0; i<list.size(); i++) {
                String s = list.get(i);
                if(s.equals("world")) {
                    list.add("javaee");
                }
            }

            //������϶���
            System.out.println(list);
        }
    }

