package homework;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/19 19:45
 * description:4.ѭ���������0�����ֽ����ۼӣ�ֱ�����������Ϊ0���ͽ���ѭ�������������ۼӵĽ��
 * 	��ʾ��
 * 		��һ��϶�Ҫʹ�õ�ѭ�������Ǹ�����һ��ѭ����?
 */
public class work74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int temp = 0;
        do{
            System.out.println("���������֣�");
            temp = sc.nextInt();
            sum += temp;
        }while (temp!=0);
        System.out.println("sum="+sum);
    }
}
