import java.util.Random;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/24 15:52
 * description:
 * 生成一个四位数 将数字保存在一个长度为4的数组中
 * 1、将每个数字加上5
 * 2、将得到的每个数字对10取余
 * 3、第一个数不能为0
 * 4、答应输出最终结果
 * <p>
 * 注意：加密过程与解密过程算法一样
 * 衍生：加密取硬盘编码
 */
public class AddPass1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要加密的数字字符串：");
            String num = scanner.next();
            //定义接收数字字符串的整型数组
            int[] array = new int[num.length()];
            //创建变量 判断是否进行加密操作
            boolean flag = true;
            for (int i = 0; i < num.length(); i++) {
                try {
                    array[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
                } catch (NumberFormatException e) {
                    System.out.println("字符串有误！");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("加密后：");
                for (int i = 0; i < array.length; i++) {
                   array[i] = (array[i] + 5)%10;
                    System.out.print(array[i]);
                }
                System.out.println("---------------");
                System.out.println("解密后：");
                for (int i = 0; i < array.length; i++) {
                    array[i] = (array[i] + 5)%10;
                    System.out.print(array[i]);
                }
            }
            System.out.println();


            // int numAdd5 = 0;
            // System.out.println("加密后：");
            // System.out.println("numAdd5 = " + numAdd5);
            // System.out.println("解密：");
            // int num0 = (numAdd5 / 10 / 10 / 10 % 10 + 5) % 10 * 1000 + (numAdd5 / 10 / 10 % 10 + 5) % 10 * 100
            //         + (numAdd5 / 10 % 10 + 5) % 10 * 10 + (numAdd5 % 10 + 5) % 10;
            // System.out.println(num0);


        }
    }

}
