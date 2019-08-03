package Practice;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 15:10
 * description:第八题(思考):
 * 	1.打印1到100之内的整数，但数字中包含3的要跳过
 * 	2.每行输出5个满足条件的数，之间用空格分隔
 * 	3.如：1 2 4 5 6
 * 		  7 8 9 10 11
 * 		  ...
 *
 * 		  提示:System.out.println();//输出并换行
 * 			   System.out.print();//输出不换行
 */
public class Practice08 {
    public static void main(String[] args) {
        //创建换行计数器
        int count = 0;
        for (int i = 1; i < 100; i++) {
            //判断是否含有3
            if (i%10==3 || i/10%10==3){
            //    满足条件不做任何处理
            }else{
                System.out.print(i+"  ");
                count++;
                //判断奇数器是否等于5，若等，则换行
                if (count==5){
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}
