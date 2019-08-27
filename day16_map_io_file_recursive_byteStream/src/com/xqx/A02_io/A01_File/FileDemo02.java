package com.xqx.A02_io.A01_File;

import java.io.File;
import java.io.IOException;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 11:45
 * description:
 * File�ഴ�����ܣ�
 *         public boolean createNewFile()�������и����Ƶ��ļ�������ʱ������һ���ɸó���·�����������¿��ļ�
 *             ����ļ������ڣ��ʹ����ļ���������true
 *             ����ļ����ڣ��Ͳ������ļ���������false
 *
 *         public boolean mkdir()�������ɴ˳���·����������Ŀ¼
 *             ���Ŀ¼�����ڣ��ʹ���Ŀ¼��������true
 *             ���Ŀ¼���ڣ��Ͳ�����Ŀ¼��������false
 *
 *         public boolean mkdirs()�������ɴ˳���·����������Ŀ¼�������κα��赫�����ڵĸ�Ŀ¼
 *             �Լ�����
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // public boolean createNewFile()�������и����Ƶ��ļ�������ʱ������һ���ɸó���·�����������¿��ļ�
        File file = new File("E:\\DarkHorseLearn\\1.txt");
        System.out.println("file = " + file);
        try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  public boolean mkdir()�������ɴ˳���·����������Ŀ¼
        File dir1 = new File("E:\\DarkHorseLearn\\dir1");
        boolean mkdir = dir1.mkdir();
        System.out.println("mkdir = " + mkdir);
        // public boolean mkdirs()�������ɴ˳���·����������Ŀ¼�������κα��赫�����ڵĸ�Ŀ¼
        File dir12 = new File("E:\\DarkHorseLearn\\dir1\\dir11\\dir111");
        boolean mkdirs = dir12.mkdirs();
        System.out.println("mkdirs = " + mkdirs);
    }

}
