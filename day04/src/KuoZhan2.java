/*
	2.�ӿ���̨����һ����λ���������ӡ�������������153�����ӡ�Ľṹ��351
*/
import java.util.Scanner;
public class KuoZhan2 {
    public static void main(String[] args) {
		//1.����¼�룬�������������󡢽�������
		Scanner sc=new Scanner(System.in);
		//��������
		System.out.println("������һ����λ����");
		int a=sc.nextInt();
		//��ȡ��λ��ʮλ����λ����  153
		int ge=a%10;
		int shi=a/10%10;
		int bai=a/10/10;
		//�������һ���µ���λ���� 351
		int num=ge*100+shi*10+bai;
		System.out.println("����֮��"+num);
    }
}