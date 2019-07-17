package Demo;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/17 11:22
 * description:
 */
public class Demo02 {
    public static void main(String[] args) {
        // byte a = 200; 不可以 取值范围为-128~127

        byte b = 100;
        byte c = (byte)200;
        System.out.println("b="+b+" c="+c);

        byte d = 3+4;
        System.out.println("d="+d);

        byte d1 = (byte)(b+c);
        System.out.println("d1="+d1);

        byte e = (byte)(199 + 1);
        System.out.println("e="+e);

    }
}
