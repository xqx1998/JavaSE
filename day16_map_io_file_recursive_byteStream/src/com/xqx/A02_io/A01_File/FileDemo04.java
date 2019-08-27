package com.xqx.A02_io.A01_File;

import java.io.File;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 14:19
 * description:
 *
 *     File����жϺͻ�ȡ���ܣ�
 *         public boolean isDirectory()�����Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
 *         public boolean isFile()�����Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
 *         public boolean exists()�����Դ˳���·������ʾ��File�Ƿ����
 *
 *         public String getAbsolutePath()�����ش˳���·�����ľ���·�����ַ���
 *         public String getPath()�����˳���·����ת��Ϊ·�����ַ���
 *         public String getName()�������ɴ˳���·������ʾ���ļ���Ŀ¼������
 *
 *         public String[] list()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
 *         public File[] listFiles()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
 *
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("day16\\src\\mydir");
        System.out.println("f.mkdir() = " + f.mkdir());
        // public boolean isDirectory()�����Դ˳���·������ʾ��File�Ƿ�ΪĿ¼
        System.out.println("f.isDirectory() = " + f.isDirectory());
        // public boolean isFile()�����Դ˳���·������ʾ��File�Ƿ�Ϊ�ļ�
        System.out.println("f.isFile() = " + f.isFile());
        // public boolean exists()�����Դ˳���·������ʾ��File�Ƿ����
        System.out.println("f.exists() = " + f.exists());
        // public String getAbsolutePath()�����ش˳���·�����ľ���·�����ַ���
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        // public String getPath()�����˳���·����ת��Ϊ·�����ַ���
        System.out.println("f.getPath() = " + f.getPath());
        // public String getName()�������ɴ˳���·������ʾ���ļ���Ŀ¼������
        System.out.println("f.getName() = " + f.getName());
        File file1 = new File("day16\\src\\mydir\\A.java");
        File file2 = new File("day16\\src\\mydir\\B.java");
        try {
            System.out.println("file1.createNewFile() = " + file1.createNewFile());
            System.out.println("file1.createNewFile() = " + file2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // public String[] list()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼�������ַ�������
        String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");
        // public File[] listFiles()�����ش˳���·������ʾ��Ŀ¼�е��ļ���Ŀ¼��File��������
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
            // System.out.println("file.delete() = " + file.delete()); //����ɾ�����ļ�
            if(file.getName().equals("A.java"))  //�ж��ļ����Ƿ���A.java��ͬ
                file.deleteOnExit();  //�������н���ʱɾ�����ļ�
        }

        System.out.println("f.getTotalSpace() = " + f.getTotalSpace()/1024/1024/1024);//����·�����ڷ����Ĵ�С
        File[] files1 = f.listFiles();
        for (File file : files1) {
            System.out.println(file);
        }

    }
}
