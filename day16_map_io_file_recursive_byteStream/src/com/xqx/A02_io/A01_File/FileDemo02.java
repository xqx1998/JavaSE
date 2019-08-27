package com.xqx.A02_io.A01_File;

import java.io.File;
import java.io.IOException;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 11:45
 * description:
 * File类创建功能：
 *         public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
 *             如果文件不存在，就创建文件，并返回true
 *             如果文件存在，就不创建文件，并返回false
 *
 *         public boolean mkdir()：创建由此抽象路径名命名的目录
 *             如果目录不存在，就创建目录，并返回true
 *             如果目录存在，就不创建目录，并返回false
 *
 *         public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
 *             自己补齐
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // public boolean createNewFile()：当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
        File file = new File("E:\\DarkHorseLearn\\1.txt");
        System.out.println("file = " + file);
        try {
            boolean newFile = file.createNewFile();
            System.out.println("newFile = " + newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  public boolean mkdir()：创建由此抽象路径名命名的目录
        File dir1 = new File("E:\\DarkHorseLearn\\dir1");
        boolean mkdir = dir1.mkdir();
        System.out.println("mkdir = " + mkdir);
        // public boolean mkdirs()：创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
        File dir12 = new File("E:\\DarkHorseLearn\\dir1\\dir11\\dir111");
        boolean mkdirs = dir12.mkdirs();
        System.out.println("mkdirs = " + mkdirs);
    }

}
