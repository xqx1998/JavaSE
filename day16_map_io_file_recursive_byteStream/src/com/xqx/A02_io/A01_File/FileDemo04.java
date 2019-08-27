package com.xqx.A02_io.A01_File;

import java.io.File;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 14:19
 * description:
 *
 *     File类的判断和获取功能：
 *         public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
 *         public boolean isFile()：测试此抽象路径名表示的File是否为文件
 *         public boolean exists()：测试此抽象路径名表示的File是否存在
 *
 *         public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
 *         public String getPath()：将此抽象路径名转换为路径名字符串
 *         public String getName()：返回由此抽象路径名表示的文件或目录的名称
 *
 *         public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
 *         public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
 *
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File f = new File("day16\\src\\mydir");
        System.out.println("f.mkdir() = " + f.mkdir());
        // public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        System.out.println("f.isDirectory() = " + f.isDirectory());
        // public boolean isFile()：测试此抽象路径名表示的File是否为文件
        System.out.println("f.isFile() = " + f.isFile());
        // public boolean exists()：测试此抽象路径名表示的File是否存在
        System.out.println("f.exists() = " + f.exists());
        // public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        System.out.println("f.getAbsolutePath() = " + f.getAbsolutePath());
        // public String getPath()：将此抽象路径名转换为路径名字符串
        System.out.println("f.getPath() = " + f.getPath());
        // public String getName()：返回由此抽象路径名表示的文件或目录的名称
        System.out.println("f.getName() = " + f.getName());
        File file1 = new File("day16\\src\\mydir\\A.java");
        File file2 = new File("day16\\src\\mydir\\B.java");
        try {
            System.out.println("file1.createNewFile() = " + file1.createNewFile());
            System.out.println("file1.createNewFile() = " + file2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        // public String[] list()：返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        String[] list = f.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");
        // public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
            // System.out.println("file.delete() = " + file.delete()); //立即删除此文件
            if(file.getName().equals("A.java"))  //判断文件名是否与A.java相同
                file.deleteOnExit();  //程序运行结束时删除此文件
        }

        System.out.println("f.getTotalSpace() = " + f.getTotalSpace()/1024/1024/1024);//返回路径所在分区的大小
        File[] files1 = f.listFiles();
        for (File file : files1) {
            System.out.println(file);
        }

    }
}
