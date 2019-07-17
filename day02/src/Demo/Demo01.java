package Demo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/17 10:34
 * description:
 */
public class Demo01 {
    public static void main(String[] args) {
        //自动转化类型 long->double  小范围转大范围
        long a = 100L;
        double b = a;
        System.out.println("a = "+a + " b = "+b);

        // 强制转化类型 double -> long
        double c = 13.14;
        long d = (long)c;
        System.out.println("c = "+c + " d = "+d);

    }
}
