import java.util.Random;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/24 15:52
 * description:
 * 生成一个四位数 将数字保存在一个长度为4的数组中
 * 1、将每个数字加上5
 * 2、将得到的每个数字对10取余
 * 3、第一个数不能为0
 * 4、答应输出最终结果
 *
 * 注意：加密过程与解密过程算法一样
 */
public class AddPass {
    public static void main(String[] args) {
        while (true) {
            // 创建随机类
            Random random = new Random();
            // 生成一个四位数的随机数 1000~9999 （9999-1000+1）+1000
            int num = random.nextInt(9000) + 1000;
            System.out.println(num);
            // 每个数字加上5
            // 个位
            System.out.println(num%10);
            // 十位
            System.out.println(num/10%10);
            // 百位
            System.out.println(num/10/10%10);
            // 千位
            System.out.println(num/10/10/10%10);
            int num01 = (num/10/10/10%10+5)%10;
            if (num01 != 0) {
                int numAdd5 = num01 * 1000 + (num / 10 / 10 % 10 + 5) % 10 * 100
                                + (num / 10 % 10 + 5) % 10 * 10 + (num % 10 + 5) % 10;
                System.out.println("加密后：");
                System.out.println("numAdd5 = " + numAdd5);
                System.out.println("解密：");
                int num0 = (numAdd5/10/10/10%10+5)%10 * 1000 + (numAdd5 / 10 / 10 % 10 + 5) % 10 * 100
                        + (numAdd5 / 10 % 10 + 5) % 10 * 10 + (numAdd5 % 10 + 5) % 10;
                System.out.println(num0);
                break;
            }
        }
    }

}
