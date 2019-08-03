package Practice;

import java.awt.*;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第一题:
 * 	键盘录入三角形的三条边长,判断输入的三条边长能否构成三角形?
 * 		提示:三角形构成条件:任意两边之和大于第三边
 */
public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一条边长：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二条边长：");
        int num2 = scanner.nextInt();
        System.out.println("请输入第三条边长：");
        int num3 = scanner.nextInt();
        if(num1+num2>num3 && num1+num3>num2 && num2+num3>num1){
            System.out.println("能构成三角形，三边长分别为："+num1+", "+num2+", "+num3);
        }else{
            System.out.println("不能构成三角形，不满足条件：任意两条边大于第三边");
        }
    }
}
