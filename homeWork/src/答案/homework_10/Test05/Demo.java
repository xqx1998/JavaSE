package 答案.homework_10.Test05;

import java.util.Random;
import java.util.Scanner;

/*1. 定义一个方法 count(String str)，要求如下:
		 在方法中,随机从传入的字符串中获取一个字符，统计该字符在str中出现的次数,并返回
	2. 在main方法中提示用户从控制台键盘录入一个字符串,调用count(String str)方法，在控制台输出返回的次数*/
public class Demo {
    public static void main(String[] args) {
        System.out.println("请录入一个字符串");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count = count(s);
        System.out.println("count = " + count);

    }

    public static int count(String str){
        //不能直接获取字符,但是我们能获得随机索引
        Random random = new Random();
        //i是随机索引   取值范围为: 0 ~ str.length()-1
        int i = random.nextInt(str.length()); //0 ~ str.length()-1
        //通过随机索引 获取随机字符
        char c = str.charAt(i);
        System.out.println("c = " + c);

        //先将字符串转化为字符数组
        char[] chars = str.toCharArray();
        //计数器
        int count = 0;
        //遍历数组
        for (int j = 0; j < chars.length; j++) {
            //判断当前字符是否和随机字符一样
            if(chars[j] == c){
                //计数器加一
                count++;
            }
        }

        return count;
    }
}
