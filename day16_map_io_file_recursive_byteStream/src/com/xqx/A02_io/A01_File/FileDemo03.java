package com.xqx.A02_io.A01_File;

import java.io.File;
import java.lang.reflect.Field;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 11:54
 * description:
 *  File��ɾ�����ܣ�
 *         public boolean delete()��ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼
 */
public class FileDemo03 {
    public static void main(String[] args) {
        //ɾ���ļ�
        File file = new File("E:\\DarkHorseLearn\\1.txt");
        boolean delete = file.delete();
        System.out.println("delete = " + delete);
        //ɾ��Ŀ¼
        File dir1 = new File("E:\\DarkHorseLearn\\dir1");
        System.out.println("dir1.delete() = " + dir1.delete());
        File mydir = new File("day16\\src\\mydir");
        System.out.println("mydir = " + mydir);
        System.out.println("mydir.mkdir() = " + mydir.mkdir());
        System.out.println("mydir.getPath() = " + mydir.getPath());
    }
}
