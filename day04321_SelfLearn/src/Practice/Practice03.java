package Practice;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:������:
 * 	���1-100֮�䣬�����ĸ�������������֮�ͣ�ż���ĸ���������ż��֮�͡����ڿ���̨�Ͻ��д�ӡ
 */
public class Practice03 {
    public static void main(String[] args) {
        //��������������
        int count = 0;
        int sum = 0;
        System.out.println("1~100����������");
        for (int i = 1; i < 101; i++) {
            if(i%2==1){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        System.out.println("��������Ϊ��"+count+"��");
        System.out.println("����֮��Ϊ��"+sum);

        //����ż����������
        int count2 = 0;
        int sum2 = 0;
        System.out.println("1~100����ż����");
        for (int i = 1; i < 101; i++) {
            if(i%2==0){
                System.out.println(i);
                sum2+=i;
                count2++;
            }
        }
        System.out.println("ż������Ϊ��"+count2+"��");
        System.out.println("ż��֮��Ϊ��"+sum2);
    }
}
