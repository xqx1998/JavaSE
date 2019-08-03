package 倖权祥;

import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/22 18:27
 * description:第三题:
 * 分析以下需求，并用代码实现：
 * (1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
 * (2)涨工资的条件如下：
 * [10-15)     +5000
 * [5-10)      +2500
 * [3~5)       +1000
 * [1~3)       +500
 * [0~1)       +200
 * (3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
 * 严立林 15:10:39 (多人发送)
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入工龄：");
            int workAge = scanner.nextInt();
            System.out.println("请输入基本工资：");
            int baseMoney = scanner.nextInt();
            //创建应涨工资
            int addMoney = 0;
            //创建涨后工资
            int money = 0;
            //判断
            if (workAge >= 0) {
                if (workAge > 15) {
                    addMoney = 5000;
                    money = baseMoney + addMoney;
                } else if (workAge >= 10 && workAge <= 15) {
                    addMoney = 5000;
                    money = baseMoney + addMoney;
                } else if (workAge >= 5 && workAge < 10) {
                    addMoney = 2500;
                    money = baseMoney + addMoney;
                } else if (workAge >= 3 && workAge < 5) {
                    addMoney = 1000;
                    money = baseMoney + addMoney;
                } else if (workAge >= 1 && workAge < 3) {
                    addMoney = 500;
                    money = baseMoney + addMoney;
                } else if (workAge == 0) {
                    addMoney = 200;
                    money = baseMoney + addMoney;
                }
                System.out.println("您目前工作了" + workAge + "年，基本工资为 " + baseMoney + "元, 应涨工资 " + addMoney + "元,涨后工资 " + money + "元");
                System.out.println("是否继续，继续请按0，结束请按1");
                int code = scanner.nextInt();
                if (code==1)
                    //结束
                    return;
            } else {
                System.out.println("您输入的工龄有误，请重新输入");
            }

        }

    }

}
