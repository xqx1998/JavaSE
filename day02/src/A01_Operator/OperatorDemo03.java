package A01_Operator;

/*
	�ַ���"+"����
*/
public class OperatorDemo03 {
	public static void main(String[] args) {
		//������������
		int i = 10;
		char c = 'A'; //'A'��ֵ��65
		c = 'a'; //'a'��ֵ��97
		c = '0'; //'0'��ֵ��48
		System.out.println(i + c);
		
		//char ch = i + c;
		//char���ͻᱻ�Զ�����Ϊint����
		int j = i + c;
		System.out.println(j);
		
		//int k = 10 + 13.14;
		double d = 10 + 13.14;
	}
}