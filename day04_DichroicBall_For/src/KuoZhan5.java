/*
	5.ѭ������5����������ӡ5�����е����ֵ����Сֵ
	��ʾ��
		1.�����������ͱ���max��min�����һ�����������Ĭ�Ͻ���һ������Ϊ���ֵ����Сֵ
		2.ѭ����������4�������ֱ��max��min�Ƚϴ�С���ҵ����ֵ����Сֵ
*/
import java.util.Scanner;
public class KuoZhan5 {
    public static void main(String[] args) {
		//1.����¼�룬�������������󡢽�������
		Scanner sc=new Scanner(System.in);
		//2.��һ����������
		int num=sc.nextInt();
		//�������������ֱ��ʾ���ֵ����Сֵ������һ�ν��յ�������ΪĬ�ϵ����ֵ����Сֵ
		int max=num; //10
		int min=num;
		//3.ѭ������4������
		for(int i=1;i<=4;i++){
			int a=sc.nextInt();
			//�жϻ�ȡ���ֵ
			if(a>max){
				max=a;
			}
			//�жϻ�ȡ��Сֵ
			if(a<min){
				min=a;
			}
		}
		//��ӡ���
		System.out.println("max="+max);
		System.out.println("min="+min);
    }
}