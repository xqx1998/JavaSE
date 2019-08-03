package 倖权祥;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 18:05
 * description:第一题:
 * 	1.要求用我们现在所学的知识完成一个简易计算机功能,能够进行加减乘除运算,演示示例如下:
 * 		请输入第一个参数:
 * 		5
 * 		请输入第二个参数:
 * 		6
 * 		请输入要进行何种运算(1代表加法,2代表减法,3代表乘法,4代表除法取商,5代表除法取余):
 * 		1
 * 		5与6之和为:11
 */
public class Test01 {
    public static void main(String[] args) {
        //创建键入类对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个参数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个参数：");
        int num2 = scanner.nextInt();
        System.out.println("请输入要进行何种运算(1代表加法,2代表减法,3代表乘法,4代表除法取商,5代表除法取余):");
        //创建操作指令变量
        int code = scanner.nextInt();
        switch (code){
            case 1:
                System.out.println(num1+"与"+num2+"之和为："+(num1+num2));
                break;
            case 2:
                System.out.println(num1+"与"+num2+"之差为："+(num1-num2));
                break;
            case 3:
                System.out.println(num1+"与"+num2+"之积为："+(num1*num2));
                break;
            case 4:
                if(num2!=0) {
                    System.out.println(num1 + "对" + num2 + "取商为：" + (num1 / num2));
                }else{
                    System.out.println("除数不能为0");
                }
                break;
            case 5:
                System.out.println(num1+"对"+num2+"取余为："+(num1%num2));
                break;
        }
    }
}
