package ��;��һ��:
	1: char,byte,short �����������ڲ�������ʱ,������������ʲô����?
		//char,byte,short �����������ڲ�������ʱ���Զ�������Ϊint����
	2: char��int�����ܹ��໥ת��,������ʲô?
		//������ASC���
	3: int a = 10; byte b = a; ��δ�����û������? �������������
		������,����a��int����,����ֱ�Ӹ�ֵ��byte���͵�b,Ҫ����ǿ��ת��
		����:
		int a = 10;
		byte b = (byte)a;


�ڶ���:	
byte b1=3,b2=4,b;
b=b1+b2; 
b=3+4;//JDK�ĳ����Ż�����
�ľ��Ǳ���ʧ�ܵ��أ�Ϊʲô�أ�
/*�ڶ�������ʧ��,��Ϊb1��byte����,b2Ҳ��byte����, byte����+byte����,���Ľ����int����, 
���ڽ�һ��int���͵Ľ��,��ֵ��byte���͵ı���b,��ô�ͻ���뱨��.
����취��,���ڶ���������¸Ķ�:
	b=(byte)(b1+b2)
��������һ��ǿ��ת��,�����int����ǿתΪbyte����,�ٽ�ֵ����byte����,�Ͳ��������
*/



������:
	 ������˵��
	 int a = 10;
	 int b = 3;
	 int c = a + b; //c=? 13
	 int d = a - b; //d=?  7
	 int e = a * b; //e=?  30
	 int f = a / b; //f=?  3
	 int g = a % b; //g=?  1
	 a++;//a=?  11
	 ++a;//a=?  12
	 b--;//b=?  2
	 --b;//b=?  1
	 
	 
������:
	������˵��
	int a = 10;
	a += 2; //a=?  12
	a -= 3; //a=?  9
	a *= 4; //a=?  36
	a /= 5; //a=?  7
	a %= 3; //a=?  1
	
	
������:
	1.����һ������a, ��ʼ��ֵ�Լ�����,�ж�a��ֵ�Ƿ����10,  ���true��false
	α����
		int a = 10;
		boolean flag1 = (a>10)?true:false;
		System.out.println(flag1);
		����:
		System.out.println(a>10);
	
	2.����һ������b, ��ʼ��ֵ�Լ�����,�ж�a��b��ֵ�Ƿ����, ���true��false
		int b = 20;
		boolean flag2 = (a==b)?true:false;
		System.out.println(flag2);
		����:
		System.out.println(a==b);
	
	3.����һ������c, ��ʼ��ֵ�Լ�����,�ж�c��ֵ�Ƿ�С�ڵ���a��b��ֵ֮��,���true��false
		int c = 40;
		int d = a+b;
		boolean flag3 = (c<=d)?true:false;
		System.out.println(flag3);
		����:
		System.out.println(c<=(a+b));
		
		




������:
	1.����һ����λ��������ֱ��ȡ����λ����ÿһλ����ֵ
	2.���磺���������123�ĸ�λ��ʮλ����λ���ֱ���3��2��1
	3.����λ,ʮλ,��λ��ӡ����.
	public class Test01{
		public static void main(String[] args){
			int a = 123;
			int ge = a%10;
			int shi = a/10%10;
			int bai = a/10/10%10;
			int qian = a/10/10/10%10;
			System.out.println("����"+a+"�ĸ�λ�� "+ge+", ʮλ�� "+shi+", ��λ�� "+bai);
		}
	}

	

	


	
