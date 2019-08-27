package test;

import java.util.Random;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/28 19:58
 * description:
 */
public class Test4 {
    public static void main(String[] args) {
        // 1、创建键入类
        Scanner scanner = new Scanner(System.in);
        // 2、键盘录入字符串
        System.out.println("请输入字符串:");
        String str = scanner.next();
        // 创建随机对象
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            //创建 StringBuilder 对象
            StringBuilder str1 = new StringBuilder();
            // 循环三次 获取字符 附加到 str1
            for (int i1 = 0; i1 < 3; i1++) {
                // 3、生成随机数 0 ~ 3 获取随机索引对应的字符
                char ch = str.charAt(random.nextInt(str.length()));
                // 附加
                str1.append(ch);
            }
            //打印输出
            System.out.println(str1.toString());
        }
    }
}
