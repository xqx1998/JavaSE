package homework;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/19 19:45
 * description:5.ѭ������5����������ӡ5�����е����ֵ����Сֵ
 * 	��ʾ��
 * 		1.�����������ͱ���max��min�����һ�����������Ĭ�Ͻ���һ������Ϊ���ֵ����Сֵ
 * 		2.ѭ����������4�������ֱ��max��min�Ƚϴ�С���ҵ����ֵ����Сֵ
 */
public class work75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������֣�");
        int max = sc.nextInt();
        int min = max;
        int temp = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("���������֣�");
            temp = sc.nextInt();
            if(max<temp)
                max = temp;
            if(min>temp){
                min = temp;
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}
