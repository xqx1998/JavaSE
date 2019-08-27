package com.xqx.A02_Arrays;

import java.util.Arrays;

/**
 * createAuthor£∫xingquanxiang
 * createTime£∫2019/8/3 10:43
 * description:√∞≈›≈≈–Ú
 */
public class BubbleSortDemo {
    public static void main(String[] args) {
        int [] array = {10,9,4,3,2,4,6,5,1,11,1,1,1};
        System.out.println("≈≈–Ú«∞£∫");
        System.out.println(Arrays.toString(array));
        System.out.println("√∞≈›≈≈–Ú£∫");
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print("µ⁄"+(i+1)+"¥Œ≈≈–Ú∫Û£∫");
            for (int i1 = 0; i1 < array.length; i1++) {
                System.out.print(array[i1]+"   ");
            }
            System.out.println();
        }
        System.out.println("≈≈–ÚΩ·π˚£∫");
        System.out.println(Arrays.toString(array));
        System.out.println("----------------");
        System.out.println("Arrays≈≈–Ú£∫");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
