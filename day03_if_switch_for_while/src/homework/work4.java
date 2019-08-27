package homework;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/19 19:07
 * description:第四题:
 * 	1.打印1到100之内的整数，但数字中包含9的要跳过（十位包含9，个位包含9）
 * 	2.如：1 2 3 4 5 ....
 * 		提示:可以反过来思考,满足条件就打印,不满足条件就不打印,条件是个位不为9并且十位不为9
 *
 */
public class work4 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i%10==9 || i/10%10==9){
                //此处满足条件则不用打印
            }else{
                System.out.println(i);
            }

        }
    }
}
