package homework;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/19 19:45
 * description:4.循环输入大于0的数字进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果
 * 	提示：
 * 		这一天肯定要使用到循环，但是该用哪一种循环呢?
 */
public class work74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int temp = 0;
        do{
            System.out.println("请输入数字：");
            temp = sc.nextInt();
            sum += temp;
        }while (temp!=0);
        System.out.println("sum="+sum);
    }
}
