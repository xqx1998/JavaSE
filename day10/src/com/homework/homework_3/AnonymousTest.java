package com.homework.homework_3;

public class AnonymousTest {
    public void test(Product p) {
        System.out.println("购买了一个" + p.getName() + ",花掉了" + p.getPrice()+"元");
    }

    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();
        //补全代码：调用AnonymousTest的test方法，使之打印"购买了一个小米手机,花掉了2999.0元。提示：使用匿名内部类实现
        ta.test(new Product() {
            @Override
            public double getPrice() {
                return 2999;
            }

            @Override
            public String getName() {
                return "小米手机";
            }
        });
    }

}