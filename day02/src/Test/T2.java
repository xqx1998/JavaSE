package Test;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/17 20:58
 * description: * ������:
 *  * 	1.����¼��intȡֵ��Χ���������������д����ֱ��ȡ����ÿһλ����ֵ
 *  * 	2.���磺����123�ĸ�λ��ʮλ����λ���ֱ���3��2��1
 *  * 	3.����λ,ʮλ,��λ��ӡ����.(�ںڴ��������ʾ��:"����123�ĸ�λ��3,ʮλ��2,��λ��1")
 *  * 		��ʾ:����/��%�����
 ���������£�
 ������һ������
 * 1234567
 * ����ĩλ�ǣ�7
 * ����������2λ�ǣ�6
 * ����������3λ�ǣ�5
 * ����������4λ�ǣ�4
 * ����������5λ�ǣ�3
 * ����������6λ�ǣ�2
 * ������λ�ǣ�1
 */
public class T2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ������");
        int a = scanner.nextInt();
        String str = a+"";
        for (int i = 0; i < str.length(); i++) {
            if(i==0){
                System.out.println("����ĩλ�ǣ�"+a%10);
            }else if(i==str.length()-1){
                int temp = 10;
                for (int j = 0; j < i-1; j++) {
                    temp *= 10;
                }
                System.out.println("������λ�ǣ�"+(a/temp));
            }else{
                int temp = 10;
                for (int j = 0; j < i-1; j++) {
                    temp *= 10;
                }
                System.out.println("����������"+(i+1)+"λ�ǣ�"+(a/temp%10));
            }
        }
    }
}
