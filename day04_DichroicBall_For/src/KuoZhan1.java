/*
	1.�ӿ���̨����5���������ƽ��ֵ
*/
import java.util.Scanner;
public class KuoZhan1 {
    public static void main(String[] args) {
		//1.����¼�룬�������������󡢽�������
		Scanner sc=new Scanner(System.in);
		//����һ������sum���ۼ����
		int sum=0;
		//ʹ��forѭ������5������
		for(int i=1;i<=5;i++){
			//��ʾ
			System.out.println("�������"+i+"����");
			int num=sc.nextInt();
			//2.��5�������
			sum+=num;
		}
		System.out.println("sum="+sum);
		//3.��ƽ��ֵ
		double avg=sum*1.0/5;
		System.out.println("avg="+avg);
    }
}