package com.xqx.InnerClassTest;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 19:35
 * description:
 */
public class JumppingDemo {
    public static void main(String[] args) {
        //需求：创建接口操作类的对象，调用method方法
        JumppingOperator jumppingOperator = new JumppingOperator();
        jumppingOperator.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("跳高");
            }
        });
    }
}
