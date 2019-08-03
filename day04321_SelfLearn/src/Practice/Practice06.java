package Practice;

import java.util.Date;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第六题:
 * 	1.打印1到100之内的整数，但数字中包含3的要跳过
 * 	3.统计跳过了多少个元素.并打印在控制台上
 */
public class Practice06 {
    public static void main(String[] args) {
        //创建计数器
        int count = 0;
        System.out.println("1~100中数字中不包含3的数为：");
        Date time1 = new Date();
        for (int i = 1; i < 101; i++) {
            if (i%10==3 || i/10%10==3){
                count++;
                continue;
            }else{
                System.out.println(i);
            }
        }
        Date time2 = new Date();
        long timeDifference = time2.getTime()-time1.getTime();
        System.out.println("timeDifference = " + timeDifference);
        System.out.println("跳过了"+count+"个元素");
    }
}
// <= : timeDifference = 33746
//
