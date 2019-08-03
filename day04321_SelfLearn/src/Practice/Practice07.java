package Practice;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第七题:
 * 	在四位数中,千位等于个位,百位等于十位,这样的数字我们把它叫做对称数,例:1221,3443,9999....
 * 	求2000-5000中所有对称数的平均数!
 */
public class Practice07 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 2000; i < 5001; i++) {
            if(i%10==i/10/10/10%10 && i/10%10==i/10/10%10){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("2000-5000中所有对称数的平均数:"+sum*1.0/count);
    }
}
