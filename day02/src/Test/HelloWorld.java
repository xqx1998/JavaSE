package Test;

import A02_Scanner.ScannerTest;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/17 20:01
 * description:
 * 第七题:
 * 	1.键盘录入一个三位整数，请编写代码分别获取该三位数上个位、十位、百位每一位的数值
 * 	2.例如：整数123的个位、十位、百位，分别是3、2、1
 * 	3.将个位,十位,百位打印出来.(在黑窗口输出如示例:"数字123的个位是3,十位是2,百位是1")
 * 		提示:利用/和%运算符
 */
public class HelloWorld {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = scanner.nextInt();
        int a3 = a/100;
        int a2 = (a/10)%10;
        int a1 = a%10;

        System.out.println(a3 + ", " + a2 + ", " + a1);
        // System.out.println("请输入第二个数：");
        // System.out.println("请输入第三个数：");
    }
}
