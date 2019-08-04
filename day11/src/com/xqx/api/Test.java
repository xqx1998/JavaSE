package com.xqx.api;

import java.util.Arrays;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 14:29
 * description:
 */
public class Test {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        System.out.println(s);
        String[] s1 = s.split(" ");
        int [] array = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            array[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(array);
        StringBuilder s3 = new StringBuilder();
        for (int i = 0; i < array.length-1; i++) {
            s3.append(array[i]+" ");
        }
        s3.append(array[array.length-1]);
        String s4 = s3.toString();
        System.out.println(s4);
        System.out.println(Arrays.toString(array));
    }
}
