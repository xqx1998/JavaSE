package ��;��һ��:
1.����һ��HelloWold��
2.�����ж���������
3.����������ʹ����������dos����̨��ӡHelloWorld
4.�ڰ�����ʹ�õ���ע�͡�����ע�������ص�˵����Ϣ
//����һ��HelloWold��
public class HelloWold{
	/*����������*/
	public static void main(String[] args){
		//��ӡ�ַ���"HelloWorld"
		System.out.println("HelloWorld");
	}
}


�ڶ���:
1.����JRE��ʲô��//JRE��Java�������л���.
2.����JDK����ʲô�� //JDK��java��������
3.����JVM��ʲô��������ʲô��  //JVM��java�����,ʵ��JAVA����Ŀ�ƽ̨
4.����JRE��JDK��JVM�Ĺ�ϵ��ʲô��//JDK����JRE�Ϳ�������,JRE����JVM��һЩ�������


������:
1.����ʲô��java�еĹؼ��� //java���Ѿ�����õ�,�����׺������,���������ʹ��
2.�ؼ��ֵ��ص�  //1.Сд  2.��ɫ
3.�ٳ�����5��java�г����Ĺؼ� //public class static  void int  

������:
����ѡ���еı�ʶ���У���Щ�ǺϷ���()
    A:  username //�Ϸ�
    B:  123username //���Ϸ� ���ֿ�ͷ��
    C:  username123 //�Ϸ�
    D:  class //���Ϸ�  class�ǹؼ���
    E:  user_name //�Ϸ�
    F:  98.3 0 //���Ϸ� ���ֿ�ͷ��
    G:  _username //�Ϸ�
    H:  HelloWorld  //�Ϸ�
    I:  $ username //���Ϸ�  �ո�����ɲ���

	
������:
1.����һ������Test����
2.Ҫ���ڿ���̨��ӡ���������䣺
    you can you up
    no can no bibi
public class Test{
	public static void main(String[] args){
		System.out.println("you can you up");
		System.out.println("no can no bibi");
	}
}



������:
1.�����������
/*
	����: byte short int long
	������: float double
	�ַ���: char
	������: boolean
*/
2.����Ĭ��ʲô����? //int
3.������Ĭ��ʲô����? //double
4.long���ͺ�float������Ҫ������ĩβ��ʲô? //long����Ҫ��L  float����Ҫ��F

������:
1.����һ������ΪDemo����,�����н��������͵ı���������һ��,���������.
public class Demo{
	public static void main(String[] args){
		byte num1 = 10;
		System.out.println(num1);
		
		short num2 = 100;
		System.out.println(num2);
		
		int num3 = 1000;
		System.out.println(num3);
		
		long num4 = 100000L;
		System.out.println(num4);
		
		float num5 = 1.1F;
		System.out.println(num5);
		
		double num6 = 3.14;
		System.out.println(num6);
		
		char var = 'A';
		System.out.println(var);
		
		boolean flag = true;
		System.out.println(flag);
	}
}



�ڰ���:
1.�ҳ����д����г���ĵط�,����������Ϊ�����еĴ���.
public class Test01 {
    public static void main(String[] args) {
        int a; 
        System.out.println(a); //����aû��ֱֵ��ʹ��,�����
        {
            int c = 20;
            System.out.println(c);
        }
        c = 30;//���ﳬ���˱���c��ȡֵ��Χ,�����Ҳ�������c,�Ͳ������¸�ֵ
        System.out.println(c);//���ﳬ���˱���c��ȡֵ��Χ,�����Ҳ�������c ͬ�����ܴ�ӡ
    }
}
������:
public class Test01 {
    public static void main(String[] args) {
        int a = 10; //��a���ϳ�ʼ��ֵ
        System.out.println(a); 
        {
            int c = 20;
            System.out.println(c);
        }
        int c = 30;//��Ϊ�����Ѿ�����֮ǰc������ȡֵ��Χ,��ô���ǾͿ������¶���һ������c ���и�ֵ,�������ܴ�ӡ�����
        System.out.println(c);
    }
}




public class Test02 {
    public static void main(String[] args) {
        int x = 2;
		double x = 3.14; //�ڴ�֮ǰ�Ѿ�������һ������x,�����ﲻ���ٴζ������x,��Ϊ��ͬһ�������ڱ����������ظ�
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        y = x; //�������Ѿ������˱���y��ȡֵ��Χ,�����Ҳ�������c,�Ͳ������¸�ֵ
        System.out.println("x is " + x);
    }
}
������:
public class Test02 {
    public static void main(String[] args) {
        int x = 2;
		//ȥ��double x = 3.14;
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        int y = x; //��Ϊ�����Ѿ�����֮ǰy������ȡֵ��Χ,��ô���ǾͿ������¶���һ������y,���и�ֵ
        System.out.println("x is " + x);
    }
}
	
	


	
	