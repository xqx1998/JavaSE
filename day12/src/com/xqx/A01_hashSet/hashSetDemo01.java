package com.xqx.A01_hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SplittableRandom;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 17:03
 * description:
 * HashSet���ϸ������ص�
 * 1.�ײ����ݽṹ�ǹ�ϣ��
 * 2.�Լ��ϵĵ���˳�����κα�֤��Ҳ����˵����֤�洢��ȡ����Ԫ��˳��һ��
 * 3.û�д������ķ��������Բ���ʹ����ͨforѭ������
 * 4.������set���ϣ������ǲ������ظ�Ԫ�صļ���
 */
public class hashSetDemo01 {
    public static void main(String[] args) {
        // �������϶���
        HashSet<String> hs = new HashSet<String>();

        // ���Ԫ��
        hs.add("xing");
        hs.add("quan");
        hs.add("xiang");

        // ���� lambda���ʽ
        hs.forEach(i -> System.out.println(i));

        // ��ǿforѭ��
        for (String s:hs) {
            System.out.println(s);
        }
    }

}
