import java.util.Random;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/20 18:30
 * description:
 */
public class ArrayTest01 {
    public static void main(String[] args) {
        //��������
        int[] arr= new int[6];
        // ������������
        Random random = new Random();
        // �������ֵ������
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        // ��������
        for (int i: arr) {
            System.out.println(i);
        }
        //�������һ��ֵ��max������
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // �������ֵ��max�Ƚϣ�������ֵ�����ֵ
            if(max < arr[i])
                max = arr[i]; 
        }
        System.out.println("max = " + max);
    }
}
