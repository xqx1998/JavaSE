package Practice;

import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:������:
 * 	����һ������Ϊ5��int���͵����飬������Ԫ���������Լ�����¼�롣��������е���Сֵ�����ж���Сֵ�Ƿ�Ϊż����
 * 	�����ż�����������СֵΪż�������������ż�����������СֵΪ��������
 */
public class Practice05 {
    public static void main(String[] args) {
        //��̬��������
        int[] array = new int[5];
        //�������������
        Scanner scanner = new Scanner(System.in);
        //Ϊ�����һ��Ԫ�ظ�ֵ
        System.out.println("�������1������");
        array[0] = scanner.nextInt();
        //������Сֵ����
        int min = array[0];
        //Ϊ���鸳ֵ
        for (int i = 1; i < array.length; i++) {
            System.out.println("�������"+(i+1)+"������");
            array[i] = scanner.nextInt();
            // ����Сֵ�Ƚ�,��С��ֵ����Сֵ
            if(min>array[i])
                min = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            //��������Ԫ��
            System.out.println(array[i]);
        }
        if(min%2==0){
            System.out.println("��СֵΪż����"+min);
        }else{
            System.out.println("��СֵΪ������"+min);
        }
    }
}
