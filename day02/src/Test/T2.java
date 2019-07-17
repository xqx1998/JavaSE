package Test;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/17 20:58
 * description: * 第七题:
 *  * 	1.键盘录入int取值范围内任意整数，请编写代码分别获取该数每一位的数值
 *  * 	2.例如：整数123的个位、十位、百位，分别是3、2、1
 *  * 	3.将个位,十位,百位打印出来.(在黑窗口输出如示例:"数字123的个位是3,十位是2,百位是1")
 *  * 		提示:利用/和%运算符
 输出结果如下：
 请输入一个数：
 * 1234567
 * 该数末位是：7
 * 该数倒数第2位是：6
 * 该数倒数第3位是：5
 * 该数倒数第4位是：4
 * 该数倒数第5位是：3
 * 该数倒数第6位是：2
 * 该数首位是：1
 */
public class T2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int a = scanner.nextInt();
        String str = a+"";
        for (int i = 0; i < str.length(); i++) {
            if(i==0){
                System.out.println("该数末位是："+a%10);
            }else if(i==str.length()-1){
                int temp = 10;
                for (int j = 0; j < i-1; j++) {
                    temp *= 10;
                }
                System.out.println("该数首位是："+(a/temp));
            }else{
                int temp = 10;
                for (int j = 0; j < i-1; j++) {
                    temp *= 10;
                }
                System.out.println("该数倒数第"+(i+1)+"位是："+(a/temp%10));
            }
        }
    }
}
