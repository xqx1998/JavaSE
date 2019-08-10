package com.xqx.A03_TreeSet.Test3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/8 20:55
 * description:
 */
public class Test {
    public static void main(String[] args) {
        //ÎÞÐò
        // Set<Integer> nums = new HashSet<>();
        // ÓÐÐò
        Set<Integer> nums = new TreeSet<>();
        Random random = new Random();
        while (nums.size()<10){
            nums.add(random.nextInt(20)+1);
        }

        nums.forEach(num -> System.out.println(num));
    }
}
