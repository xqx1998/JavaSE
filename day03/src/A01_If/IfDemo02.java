package A01_If;
/*
	����ʹ�ü���¼��һ���������жϸ�������������ż��������������ʹ�ӡ����������ʹ�ӡż��
*/
import java.util.Scanner;
public class IfDemo02{
	public static void main(String[] args){
		//1.����¼�룺�������������󡢽�������
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��������");
		int a=sc.nextInt();
		//2.�жϸ�������������ż��������������ʹ�ӡ����������ʹ�ӡż�� ���������ʹ��if...else�ṹ
		//�ж�������ż����a%2
		System.out.println("a%1="+a%1);
		if(a%2==1){
			System.out.println("����Ϊ ����");
		}else{
			System.out.println("����Ϊ ż����");
		}
	}
}