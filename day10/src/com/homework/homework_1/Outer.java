package com.homework.homework_1;

public class Outer {
    /*
        两个明确：
            返回值类型：
            参数列表:   无参
     */
    public static Inter method(){
        return new Inter() {
            @Override
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
