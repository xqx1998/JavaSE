package A03_branch;

/*
	if����ʽ1

	��ʽ��
		if (��ϵ����ʽ) {
			�����;	
		}
	
	ִ�����̣�
		1:���ȼ����ϵ����ʽ��ֵ
		2:�����ϵ����ʽ��ֵΪtrue��ִ�������
		3:�����ϵ����ʽ��ֵΪfalse�Ͳ�ִ�������
		4:����ִ�к�����������
*/
public class IfDemo {
	public static void main(String[] args) {
		System.out.println("��ʼ");
		
		//������������
		int a = 10;
		int b = 20;
		
		//�����ж�a��b��ֵ�Ƿ���ȣ������ȣ����ڿ���̨�����a����b
		if(a == b) {
			System.out.println("a����b");
		}
		
		//�����ж�a��c��ֵ�Ƿ���ȣ������ȣ����ڿ���̨�����a����c
		int c = 10;
		if(a == c) {
			System.out.println("a����c");
		}
		
		System.out.println("����");
	}
}