package Practice;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:������:
 * 	����λ����,ǧλ���ڸ�λ,��λ����ʮλ,�������������ǰ��������Գ���,��:1221,3443,9999....
 * 	��2000-5000�����жԳ�����ƽ����!
 */
public class Practice07 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 2000; i < 5001; i++) {
            if(i%10==i/10/10/10%10 && i/10%10==i/10/10%10){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        System.out.println("2000-5000�����жԳ�����ƽ����:"+sum*1.0/count);
    }
}
