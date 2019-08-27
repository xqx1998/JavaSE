package com.xqx.A02_io.A02_DiGui;

import java.io.File;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 14:18
 * description:�ݹ鰸��3
 * ����
 * ���󣺸���һ��·��(E:\\itcast)����ͨ���ݹ���ɱ�����Ŀ¼�µ��������ݣ����������ļ��ľ���·������ڿ���̨
 *
 */
public class RecursionDemo03 {
    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) {
        System.out.println("������Ҫ������Ŀ¼��");
        String dir = new Scanner(System.in).next();
        //��������Ϊ�ļ��������
        getDoc(new File[]{new File(dir)});
        System.out.println("��"+count1+"���ļ�");
        System.out.println("--------------");
        //��������Ϊ�ļ� ����
        getDoc(new File(dir));
        System.out.println("��"+count2+"���ļ�");
        System.out.println("--------------");

    }

    //����Ŀ¼������
    public static void getDoc(File[] dirs) {
        //�����ļ�����
        for (File dir : dirs) {
            //�ж��ļ��Ƿ���Ŀ¼
            if (dir.isDirectory()) { //�ǣ��ݹ����
                getDoc(dir.listFiles());
            } else { //���ǣ���������1������ļ�����·��
                // if (dir.getName().substring(dir.getName().length()-4).equals(".avi")) {
                    count1++;
                    System.out.println(dir.getAbsolutePath());
                // }
            }
        }

    }

    // ����Ŀ¼�������ļ�
    public static void getDoc(File dir){
        //�ж��ļ��Ƿ���Ŀ¼
        if (dir.isDirectory()){ //�ǣ���ȡĿ¼�������ļ���Ŀ¼��������
            File[] files = dir.listFiles();
            for (File file : files) { //��������
                //�ж��ļ��Ƿ���Ŀ¼
                if (file.isDirectory()){  //�ǣ��ݹ����
                    getDoc(file);
                }else{ //���ǣ���������1������ļ�����·��
                    count2++;
                    System.out.println(file.getAbsolutePath());
                }
            }
        }else { //���ǣ���������1������ļ�����·��
            count2++;
            System.out.println(dir.getAbsolutePath());
        }
    }
}
