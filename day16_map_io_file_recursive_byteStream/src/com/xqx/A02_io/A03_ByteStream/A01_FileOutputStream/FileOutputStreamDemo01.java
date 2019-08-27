package com.xqx.A02_io.A03_ByteStream.A01_FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 18:34
 * description:
 * FileOutputStream���ļ���������ڽ�����д��File
 * FileOutputStream?(String name)�������ļ��������ָ��������д���ļ�
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //�����ֽ����������
        //FileOutputStream?(String name)�������ļ��������ָ��������д���ļ�
        FileOutputStream fos = new FileOutputStream("day16\\1.txt");
        /*
            �����������飺
                A:����ϵͳ���ܴ������ļ�
                B:�������ֽ����������
                C:���ֽ����������ָ�򴴽��õ��ļ�
         */

        //void write?(int b)����ָ�����ֽ�д����ļ������
        fos.write(97);
        fos.write(57);
        fos.write(55);

        //���Ҫ�ͷ���Դ
        //void close?()���رմ��ļ���������ͷ��������������κ�ϵͳ��Դ��
        fos.close();
    }
}
