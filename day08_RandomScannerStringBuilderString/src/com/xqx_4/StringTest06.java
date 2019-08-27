package com.xqx_4;

public class StringTest06 {

    public static void main(String[] args) {
        String str="hello itheima";
        //boolean	contains​(String s)：判断字符串是否包含给定字符串s
        boolean f = str.contains("s");
        System.out.println(f);

        //boolean	endsWith​(String suffix)：判断字符串是否以给定的suffix结尾
        String filename="a.txt";
        boolean b = filename.endsWith("avi");
        System.out.println(b?"这是一个好看的小电影":"垃圾");

        //int	indexOf​(String str)：返回指定子字符串第一次出现的字符串内的索引。
        int index = str.indexOf("e");
        System.out.println("index = " + index);
        index = str.lastIndexOf("e");
        System.out.println("index = " + index);

        String info="zhangsan-18-女";
        String[] split = info.split("-");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


    }
}
