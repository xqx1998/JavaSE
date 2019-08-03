package 答案.homework_10.Test04;

import java.util.Scanner;

/*1. 定义一个方法 count(String str)，要求如下:
		 在方法中,键盘录入一个字符(可以以字符串的形式)，统计该字符在str中出现的次数,并返回

	2. 在main方法中提示用户从控制台键盘录入一个字符串,调用count(String str)方法，在控制台输出返回的次数*/
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count = count(s);
        System.out.println("count = " + count);
    }

    //在方法中,键盘录入一个字符(可以以字符串的形式)，统计该字符在str中出现的次数,并返回
    //参数: 有 1个 String
    //返回值:  有 int
    public static int count(String str){
        System.out.println("请输入一个字符:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();  //"h"
        //将录入的一个元素的字符串转换为字符
        char c = s.charAt(0);//'h'

        //统计该字符在str中出现的次数
        //计数
        int count = 0;
        //将字符串str变成一个字符数组
        char[] chars = str.toCharArray();
        //遍历字符数组
        for (int i = 0; i < chars.length; i++) {
            //看当前元素是否和我们录入的字符相同
            if(c == chars[i]){
                count++;
            }
        }

        return count;
    }
}
