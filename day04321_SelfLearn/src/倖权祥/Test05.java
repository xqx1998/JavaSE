package ��Ȩ��;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 18:59
 * description:������:
 * 	����¼������һ��һ��������,��1�������֮����������֮��.
 * 		��ʾ:�������һ����forѭ��,��ô���Ǿ�Ҫ�ҵ��ĸ������ǿ���ѭ���Ĺؼ�
 */
public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("��������������");
            int num = scanner.nextInt();
            if (num > 0) {
                int sum = 0;
                for (int i = 1; i <= num; i++) {
                    sum += i;
                }
                System.out.println("1��" + num + "֮����������֮��Ϊ��" + sum);
                System.out.println();
                System.out.println("�Ƿ�����������밴0�������밴1");
                int code = scanner.nextInt();
                if (code==1)
                    //����
                    return;
            } else {
                System.out.println("��������ֵ��������������");
            }
        }while (true);
    }
}
