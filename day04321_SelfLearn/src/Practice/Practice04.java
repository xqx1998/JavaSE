package Practice;

import java.util.Random;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:������:
 * 	����һ������Ϊ10���������飬Ԫ�������������(89-156)����ȡ����������������Ͷ�Ӧ��Ԫ�ض�Ϊż����Ԫ��,��ͳ�����ǵĸ���
 * 		PS:0��ż��
 */
public class Practice04 {
    public static void main(String[] args) {
        //��������
        int[] array = new int[10];
        //������������
        Random random = new Random();
        System.out.println("�������Ϊ��");
        for (int i = 0; i < array.length; i++) {
            // x~y : (y-x+1)+x
            array[i] = random.nextInt(68)+89;
            System.out.println(array[i]);
        }
        System.out.println("�����������Ͷ�Ӧ��Ԫ�ض�Ϊż������Ϊ��");
        // ����������
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(i%2==0 && array[i]%2==0){
                System.out.println(i + " : "+array[i]);
                count++;
            }
        }
        System.out.println("�ܸ���Ϊ��"+count);
    }

}
