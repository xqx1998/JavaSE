/*
	4.ѭ���������������ۼӣ�ֱ�����������Ϊ0���ͽ���ѭ�������������ۼӵĽ��
	��ʾ��
		��һ��϶�Ҫʹ�õ�ѭ�������Ǹ�����һ��ѭ����?
		��������Ϣ��������Ҫ����һ��
*/
import java.util.Scanner;
public class KuoZhan4_2{
    public static void main(String[] args) {
		
		//1.����һsum�����ۼ�
		int sum=0;
		//2.����¼�룬�������������󡢽�������
		Scanner sc=new Scanner(System.in);
		//3.ʹ��whileѭ����������
		while(true){
			//��������
			int num=sc.nextInt();
			//�ж��Ƿ���0�������0��ô������ѭ��
			if(num==0){
				break;
			}
			//�ۼ�
			sum+=num;
		}
		//��ӡ���
		System.out.println("sum="+sum);
    }
}