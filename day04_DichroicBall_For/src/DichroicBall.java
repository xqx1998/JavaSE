import java.util.Random;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/20 11:57
 * description:
 */
public class DichroicBall {
    public static void main(String[] args) {
        //˫ɫ��
//     ����6����1-33
//     ����1����1-15
//  �н�����Ϊ��

        Random rd = new Random();
        //����������ź��������
        int[] red = new int[6];
        //�������к��������
        int[] all = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33};
        for (int i = 0; i < red.length; i++) {
            while (true) {
                //���all���������
                int num = rd.nextInt(33);
                if (all[num] != 0) {
                    red[i] = all[num];
                    all[num] = 0;
                    break;
                }
            }
        }
//  System.out.println("����ĺ���Ϊ��");
//  for (int i = 0; i < red.length; i++) {
//   System.out.print(red[i]+" ");
//  }
//  System.out.println("");
//  System.out.println("����ĺ���Ϊ��");
        int blue = rd.nextInt(15) % (15 - 1 + 1) + 1;
//  System.out.println(blue);

        Scanner input = new Scanner(System.in);
        //����������������������
        int[] player = new int[6];
        for (int i = 0; i < player.length; i++) {
            System.out.println("��������Ҫ��ĵ�" + (i + 1) + "��������룺");
            int reds = input.nextInt();
            player[i] = reds;
        }
        System.out.println("������ĺ������Ϊ��");
        for (int i = 0; i < player.length; i++) {
            System.out.print(player[i] + " ");
        }
        //������������������
        System.out.println("��������Ҫ���������룺");
        int blues = input.nextInt();

        boolean flag = true;
        for (int i = 0; i < red.length; i++) {
            if (red[i] == player[i]) {
                if (blue == blues) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            } else {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("��ϲ���н��ˣ�");
        } else {
            System.out.println("�Բ�����δ�н���");
        }
    }
}
