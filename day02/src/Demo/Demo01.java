package Demo;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/17 10:34
 * description:
 */
public class Demo01 {
    public static void main(String[] args) {
        //�Զ�ת������ long->double  С��Χת��Χ
        long a = 100L;
        double b = a;
        System.out.println("a = "+a + " b = "+b);

        // ǿ��ת������ double -> long
        double c = 13.14;
        long d = (long)c;
        System.out.println("c = "+c + " d = "+d);

    }
}
