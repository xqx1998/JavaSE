package com.xqx.homework;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/7 22:01
 * description:
 * StringBuilder���ʹ��
 * �塢�����������󣬲��ô���ʵ�֣�
 * 	(1)���������ַ�������{"010","3223","666","7890987","123123"}��
 * 	(2)�жϸ������ַ��������е������ַ����Ƿ��ǶԳ�(��һ�����ֺ����һ��������ȣ�
 * 	   �ڶ������ֺ͵����ڶ�����������ȵģ���������)�ģ�����������
 * 	(3)�磺010 �ǶԳƵģ�3223 �ǶԳƵģ�123123 ���ǶԳƵģ�
 * 	(4)���մ�ӡ�������жԳ��ַ����ĸ�����
 * ע���ж϶Գƿ���reverse(),�����ַ��������䷴ת��ʽȡ����
 */
public class HomeWork_5 {
    public static void main(String[] args) {
        String [] strs = {"010","3223","666","7890987","123123"};
        for (int i = 0; i < strs.length; i++) {
            System.out.println(new StringBuilder(strs[i]).reverse());
            System.out.println("--------------");
            if (strs[i].equals(new StringBuilder(strs[i]).reverse().toString())){
                System.out.println(strs[i]);
            }
        }
    }
}
