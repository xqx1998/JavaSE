import java.util.Random;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/24 15:52
 * description:
 * ����һ����λ�� �����ֱ�����һ������Ϊ4��������
 * 1����ÿ�����ּ���5
 * 2�����õ���ÿ�����ֶ�10ȡ��
 * 3����һ��������Ϊ0
 * 4����Ӧ������ս��
 *
 * ע�⣺���ܹ�������ܹ����㷨һ��
 */
public class AddPass {
    public static void main(String[] args) {
        while (true) {
            // ���������
            Random random = new Random();
            // ����һ����λ��������� 1000~9999 ��9999-1000+1��+1000
            int num = random.nextInt(9000) + 1000;
            System.out.println(num);
            // ÿ�����ּ���5
            // ��λ
            System.out.println(num%10);
            // ʮλ
            System.out.println(num/10%10);
            // ��λ
            System.out.println(num/10/10%10);
            // ǧλ
            System.out.println(num/10/10/10%10);
            int num01 = (num/10/10/10%10+5)%10;
            if (num01 != 0) {
                int numAdd5 = num01 * 1000 + (num / 10 / 10 % 10 + 5) % 10 * 100
                                + (num / 10 % 10 + 5) % 10 * 10 + (num % 10 + 5) % 10;
                System.out.println("���ܺ�");
                System.out.println("numAdd5 = " + numAdd5);
                System.out.println("���ܣ�");
                int num0 = (numAdd5/10/10/10%10+5)%10 * 1000 + (numAdd5 / 10 / 10 % 10 + 5) % 10 * 100
                        + (numAdd5 / 10 % 10 + 5) % 10 * 10 + (numAdd5 % 10 + 5) % 10;
                System.out.println(num0);
                break;
            }
        }
    }

}
