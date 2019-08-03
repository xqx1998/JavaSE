package 倖权祥;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 18:20
 * description:第二题:
 * 	将上面这题加上如下功能
 * 		1.在运算结束后主动询问:"是否结束使用计算机?"0代表不结束,1代表结束
 * 		2.选择结束,立即终止程序
 * 		3.选择不结束,则再次开始运算,直到结束为止
 */
public class Test02 {
    public static void main(String[] args) {
        //创建键入类对象
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请输入第一个参数：");
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个参数：");
            int num2 = scanner.nextInt();
            System.out.println("请输入要进行何种运算(1代表加法,2代表减法,3代表乘法,4代表除法取商,5代表除法取余):");
            //创建操作指令变量
            int code = scanner.nextInt();
            switch (code) {
                case 1:
                    System.out.println(num1 + "与" + num2 + "之和为：" + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + "与" + num2 + "之差为：" + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + "与" + num2 + "之积为：" + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println(num1 + "对" + num2 + "取商为：" + (num1 / num2));
                    } else {
                        System.out.println("除数不能为0");
                    }
                    break;
                case 5:
                    System.out.println(num1 + "对" + num2 + "取余为：" + (num1 % num2));
                    break;
            }
            System.out.println("是否结束使用计算机? 0代表不结束,1代表结束");
            System.out.println("请输入指令：");
            //创建结束操作指令变量
            int code1 = scanner.nextInt();
            if (code1==1){
                break;
            }
        }while (true);
    }
}
