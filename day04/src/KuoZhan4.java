/*
	4.ѭ���������������ۼӣ�ֱ�����������Ϊ0���ͽ���ѭ�������������ۼӵĽ��
	��ʾ��
		��һ��϶�Ҫʹ�õ�ѭ�������Ǹ�����һ��ѭ����?
		��������Ϣ��������Ҫ����һ��
*/
import java.util.Scanner;
public class KuoZhan4 {
    public static void main(String[] args) {
		
		//1.����һsum�����ۼ�
		int sum=0;
		//2.����¼�룬�������������󡢽�������
		Scanner sc=new Scanner(System.in);
		//3.ʹ��do...whileѭ����������
		//��ʼ�����
		int a=0;
		do{
			//ѭ����
			//�������������
			System.out.println("������һ�����������ۼӣ�����0��ʾ����:");
			a=sc.nextInt();
			//�ۼ�
			sum+=a;
		}while(a!=0);
		//��ӡ���
		System.out.println("sum="+sum);
    }
}