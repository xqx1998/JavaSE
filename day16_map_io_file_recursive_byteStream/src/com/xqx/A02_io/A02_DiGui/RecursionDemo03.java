package com.xqx.A02_io.A02_DiGui;

import java.io.File;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 14:18
 * description:递归案例3
 * 需求：
 * 需求：给定一个路径(E:\\itcast)，请通过递归完成遍历该目录下的所有内容，并把所有文件的绝对路径输出在控制台
 *
 */
public class RecursionDemo03 {
    static int count1 = 0;
    static int count2 = 0;
    public static void main(String[] args) {
        System.out.println("请输入要遍历的目录：");
        String dir = new Scanner(System.in).next();
        //参数定义为文件数组遍历
        getDoc(new File[]{new File(dir)});
        System.out.println("共"+count1+"个文件");
        System.out.println("--------------");
        //参数定义为文件 遍历
        getDoc(new File(dir));
        System.out.println("共"+count2+"个文件");
        System.out.println("--------------");

    }

    //遍历目录中内容
    public static void getDoc(File[] dirs) {
        //遍历文件数组
        for (File dir : dirs) {
            //判断文件是否是目录
            if (dir.isDirectory()) { //是：递归调用
                getDoc(dir.listFiles());
            } else { //不是：计数器加1，输出文件绝对路径
                // if (dir.getName().substring(dir.getName().length()-4).equals(".avi")) {
                    count1++;
                    System.out.println(dir.getAbsolutePath());
                // }
            }
        }

    }

    // 遍历目录中所有文件
    public static void getDoc(File dir){
        //判断文件是否是目录
        if (dir.isDirectory()){ //是：获取目录下所有文件或目录生成数组
            File[] files = dir.listFiles();
            for (File file : files) { //遍历数组
                //判断文件是否是目录
                if (file.isDirectory()){  //是：递归调用
                    getDoc(file);
                }else{ //不是：计数器加1，输出文件绝对路径
                    count2++;
                    System.out.println(file.getAbsolutePath());
                }
            }
        }else { //不是：计数器加1，输出文件绝对路径
            count2++;
            System.out.println(dir.getAbsolutePath());
        }
    }
}
