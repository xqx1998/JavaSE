package 倖权祥;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 18:59
 * description:第五题:
 * 	键盘录入任意一个一个正整数,求1到这个数之间所有整数之和.
 * 		提示:求和我们一般用for循环,那么我们就要找到哪个变量是控制循环的关键
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入正整数：");
            int num = scanner.nextInt();
            if (num > 0) {
                int sum = 0;
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("1到" + num + "之间所有整数之和为：" + sum);
                System.out.println();
                System.out.println("是否继续，继续请按0，结束请按1");
                int code = scanner.nextInt();
                if (code==1)
                    //结束
                    return;
            } else {
                System.out.println("您输入数值有误，请重新输入");
            }
        }while (true);
    }
}
