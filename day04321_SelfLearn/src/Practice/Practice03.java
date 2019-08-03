package Practice;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第三题:
 * 	求出1-100之间，奇数的个数和所有奇数之和，偶数的个数和所有偶数之和。并在控制台上进行打印
 */
public class Practice03 {
    public static void main(String[] args) {
        //创建奇数计数器
        int count = 0;
        int sum = 0;
        System.out.println("1~100所有奇数：");
        for (int i = 1; i < 101; i++) {
            if(i%2==1){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println("奇数个数为："+count+"个");
        System.out.println("奇数之和为："+sum);

        //创建偶数数计数器
        int count2 = 0;
        int sum2 = 0;
        System.out.println("1~100所有偶数：");
        for (int i = 1; i < 101; i++) {
            if(i%2==0){
                System.out.println(i);
                sum2+=i;
                count2++;
            }
        }
        System.out.println("偶数个数为："+count2+"个");
        System.out.println("偶数之和为："+sum2);
    }
}
