package homework;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/19 19:45
 * description:1.�ӿ���̨����5���������ƽ��ֵ
 */
public class work71 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("�������"+i+1+"������");
            sum += sc.nextInt();
        }
        System.out.println("ƽ��ֵΪ��"+sum/5);
    }
}
