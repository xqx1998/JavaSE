package com.xqx.A02_io.A01_File;

import java.io.File;
import java.lang.reflect.Field;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 11:37
 * description:
 *  File���ļ���Ŀ¼·�����ĳ����ʾ
 *           1:�ļ���Ŀ¼�ǿ���ͨ��File��װ�ɶ����
 *           2:����File���ԣ����װ�Ĳ�����һ���������ڵ��ļ���������һ��·�������ѡ��������Ǵ��ڵģ�Ҳ�����ǲ����ڵġ�
 *             ������Ҫͨ������Ĳ��������·��������ת��Ϊ������ڵ�
 *
 *     ���췽����
 *         File(String pathname)��ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����
 *         File(String parent, String child)���Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����
 *         File(File parent, String child)���Ӹ�����·��������·�����ַ��������µ� Fileʵ����
 */
public class FileDemo01 {
    public static void main(String[] args) {
        //File(String pathname)��ͨ����������·�����ַ���ת��Ϊ����·�����������µ� Fileʵ����
        File file = new File("E:\\DarkHorseLearn\\1.txt");
        System.out.println("file = " + file);

        //File(String parent, String child)���Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ����
        File file1 = new File("E:\\DarkHorseLearn", "2.txt");
        System.out.println("file1 = " + file1);

        //File(File parent, String child)���Ӹ�����·��������·�����ַ��������µ� Fileʵ����
        File file2 = new File("E:\\DarkHorseLearn");
        File file3 = new File(file2, "3.txt");
        System.out.println("file3 = " + file3);
    }
}
