package ��Ȩ��;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/22 18:27
 * description:������:
 * �����������󣬲��ô���ʵ�֣�
 * (1)���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
 * (2)�ǹ��ʵ��������£�
 * [10-15)     +5000
 * [5-10)      +2500
 * [3~5)       +1000
 * [1~3)       +500
 * [0~1)       +200
 * (3)����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
 * ������ 15:10:39 (���˷���)
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("�����빤�䣺");
            int workAge = scanner.nextInt();
            System.out.println("������������ʣ�");
            int baseMoney = scanner.nextInt();
            //����Ӧ�ǹ���
            int addMoney = 0;
            //�����Ǻ���
            int money = 0;
            //�ж�
            if (workAge >= 0) {
                if (workAge > 15) {
                    addMoney = 5000;
                    money = baseMoney + addMoney;
                } else if (workAge >= 10 && workAge <= 15) {
                    addMoney = 5000;
                    money = baseMoney + addMoney;
                } else if (workAge >= 5 && workAge < 10) {
                    addMoney = 2500;
                    money = baseMoney + addMoney;
                } else if (workAge >= 3 && workAge < 5) {
                    addMoney = 1000;
                    money = baseMoney + addMoney;
                } else if (workAge >= 1 && workAge < 3) {
                    addMoney = 500;
                    money = baseMoney + addMoney;
                } else if (workAge == 0) {
                    addMoney = 200;
                    money = baseMoney + addMoney;
                }
                System.out.println("��Ŀǰ������" + workAge + "�꣬��������Ϊ " + baseMoney + "Ԫ, Ӧ�ǹ��� " + addMoney + "Ԫ,�Ǻ��� " + money + "Ԫ");
                System.out.println("�Ƿ�����������밴0�������밴1");
                int code = scanner.nextInt();
                if (code==1)
                    //����
                    return;
            } else {
                System.out.println("������Ĺ�����������������");
            }

        }

    }

}
