import java.util.Random;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/24 15:52
 * description:
 * ����һ����λ�� �����ֱ�����һ������Ϊ4��������
 * 1����ÿ�����ּ���5
 * 2�����õ���ÿ�����ֶ�10ȡ��
 * 3����һ��������Ϊ0
 * 4����Ӧ������ս��
 * <p>
 * ע�⣺���ܹ�������ܹ����㷨һ��
 * ����������ȡӲ�̱���
 */
public class AddPass1 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������Ҫ���ܵ������ַ�����");
            String num = scanner.next();
            //������������ַ�������������
            int[] array = new int[num.length()];
            //�������� �ж��Ƿ���м��ܲ���
            boolean flag = true;
            for (int i = 0; i < num.length(); i++) {
                try {
                    array[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
                } catch (NumberFormatException e) {
                    System.out.println("�ַ�������");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("���ܺ�");
                for (int i = 0; i < array.length; i++) {
                   array[i] = (array[i] + 5)%10;
                    System.out.print(array[i]);
                }
                System.out.println("---------------");
                System.out.println("���ܺ�");
                for (int i = 0; i < array.length; i++) {
                    array[i] = (array[i] + 5)%10;
                    System.out.print(array[i]);
                }
            }
            System.out.println();


            // int numAdd5 = 0;
            // System.out.println("���ܺ�");
            // System.out.println("numAdd5 = " + numAdd5);
            // System.out.println("���ܣ�");
            // int num0 = (numAdd5 / 10 / 10 / 10 % 10 + 5) % 10 * 1000 + (numAdd5 / 10 / 10 % 10 + 5) % 10 * 100
            //         + (numAdd5 / 10 % 10 + 5) % 10 * 10 + (numAdd5 % 10 + 5) % 10;
            // System.out.println(num0);


        }
    }

}
