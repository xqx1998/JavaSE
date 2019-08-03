package Practice;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第二题:
 * 	遍历1到200之间（包含1和200）的所有数字，统计能被7整除的偶数的个数，最后将个数和数字都打印在控制台
 */
public class Practice02 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("1~200能被7整除的偶数:");
        for (int i = 1; i <= 200; i++) {
            if (i%7==0 && i%2==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("一共有："+count+"个");
    }
}
