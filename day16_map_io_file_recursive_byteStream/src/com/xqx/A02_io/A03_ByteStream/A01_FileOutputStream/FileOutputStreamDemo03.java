package com.xqx.A02_io.A03_ByteStream.A01_FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 18:34
 * description:
 *  �ֽ���д���ݵ�����С����:
 *         1:�ֽ���д�������ʵ�ֻ����أ�
 *             window:\r\n
 *             linux:\n
 *             mac:\r
 *
 *         2:�ֽ���д�������ʵ��׷��д���أ�
 *             public FileOutputStream?(String name,boolean append)
 *                 �����ļ��������ָ��������д���ļ���
 *                 ����ڶ�������Ϊtrue �����ֽڽ�д���ļ���ĩβ�����ǿ�ͷ
 */
public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
       //�����ֽ����������
        FileOutputStream fileOutputStream = new FileOutputStream("day16//fos01.txt",true);
        for (int i = 0; i < 10; i++) {
            fileOutputStream.write("Hello world !".getBytes());
            fileOutputStream.write("\r\n".getBytes());
        }

        fileOutputStream.close();
    }
}
