package test;

import java.util.Random;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/28 19:58
 * description:
 */
public class Test4 {
    public static void main(String[] args) {
        // 1������������
        Scanner scanner = new Scanner(System.in);
        // 2������¼���ַ���
        System.out.println("�������ַ���:");
        String str = scanner.next();
        // �����������
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            //���� StringBuilder ����
            StringBuilder str1 = new StringBuilder();
            // ѭ������ ��ȡ�ַ� ���ӵ� str1
            for (int i1 = 0; i1 < 3; i1++) {
                // 3����������� 0 ~ 3 ��ȡ���������Ӧ���ַ�
                char ch = str.charAt(random.nextInt(str.length()));
                // ����
                str1.append(ch);
            }
            //��ӡ���
            System.out.println(str1.toString());
        }
    }
}
