package homework.homework_4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 19:56
 * description:
 */
public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int count = 0;
            ArrayList<Integer> integers = new ArrayList<>();
            //����������

            for (int i1 = 0; i1 < 6; i1++) {
                System.out.println("�������" + (i1 + 1) + "���������");
                integers.add(scanner.nextInt());
            }
            System.out.println("������������룺");
            integers.add(scanner.nextInt());

            System.out.println();

            //��ȡ���ɵ�˫ɫ�����
            ArrayList<Integer> nums = new DichroicBall().getNums();
            for (int i1 = 0; i1 < nums.size(); i1++) {
                if (nums.get(i1) == integers.get(i1)) {
                    count++;
                }
            }
            System.out.println("����ģ�");
            //��������ģ�
            integers.forEach(in -> System.out.print(in + "  "));
            System.out.println();
            System.out.println("���ɵ�:");
            //�������ɵ�
            nums.forEach(num -> System.out.print(num+"  "));
            System.out.println();
            System.out.println("����" + count + "�β���");
        }
    }
}
