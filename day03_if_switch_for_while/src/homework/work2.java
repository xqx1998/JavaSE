package homework;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/19 19:07
 * description:�ڶ���:
 * 	�����������󣬲��ô���ʵ��(if���)��
 * 	1.��������:����¼��һ�����������·ݣ������Ӧ�ļ���
 * 	2.Ҫ��:
 * 		(1)¼��һ������(�����·�,��Χ1-12)
 * 		(2)������·ݶ�Ӧ�ļ���
 * 			3,4,5����
 * 			6,7,8�ļ�
 * 			9,10,11�＾
 * 			12,1,2����
 * 		(3)��ʾ��ʽ����:
 * 			¼���·�:3
 * 			���:3�·��Ǵ���
 * 		��ʾ:�������ֿ��ܾ�Ҫ�õ�if�ĵ����ָ�ʽ. �����·ݲ����÷�Χ��ʾ,����һ����д�������߼����������
 */
public class work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("¼���·ݣ�");
            int month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("�����" + month + "�·�����");
            } else {
                if (month == 3 || month == 4 || month == 5) {
                    System.out.println("�����" + month + "�·��Ǵ���");
                } else if (month == 6 || month == 7 || month == 8) {
                    System.out.println("�����" + month + "�·����ļ�");
                } else if (month == 9 || month == 10 || month == 11) {
                    System.out.println("�����" + month + "�·����＾");
                } else {
                    System.out.println("�����" + month + "�·��Ƕ���");
                }
            }
        }
    }
}
