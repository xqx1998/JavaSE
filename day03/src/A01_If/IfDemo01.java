package A01_If;

import java.util.Scanner;

/*
	����ʹ�ü���¼��һ��ѧ���ĳɼ����жϸ�ѧ���Ƿ񼰸�?(����60�ֱ�ʾ����)
	if(��ϵ���ʽ){//��ϵ���ʽҲ�����ж�����
		//����壺��ӡ��ѧ���ĳɼ������ˡ�
	}
	
*/
public class IfDemo01{
	public static void main(String[] args){
		//1.Scanner����¼�������
		//����
		//��������
		Scanner sc = new Scanner(System.in);
		//��������
		System.out.println("������ɼ���");
		float grade = sc.nextFloat();
		//if�жϣ��ж�����>=60
		if(grade>=60.0){
			System.out.println("��ѧ���ĳɼ�������");
		}/*else{
			System.out.println("��ѧ���ĳɼ�δ����");
		}*/
	}
}