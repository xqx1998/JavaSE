package ��ҵ;��һ��:
1.����һ��HelloWold��
2.�����ж���������
3.����������ʹ����������dos����̨��ӡHelloWorld
4.�ڰ�����ʹ�õ���ע�͡�����ע�������ص�˵����Ϣ



�ڶ���:
1.����JRE��ʲô��
2.����JDK����ʲô��
3.����JVM��ʲô��������ʲô�� 
4.����JRE��JDK��JVM�Ĺ�ϵ��ʲô��


������:
1.����ʲô��java�еĹؼ��� 
2.�ؼ��ֵ��ص� 
3.�ٳ�����5��java�г����Ĺؼ� 


������:
����ѡ���еı�ʶ���У���Щ�ǺϷ���()
    A:  username 
    B:  123username 
    C:  username123 
    D:  class 
    E:  user_name 
    F:  98.3 0 
    G:  _username 
    H:  HelloWorld 
    I:  $ username 

	
������:
1.����һ������Test����
2.Ҫ���ڿ���̨��ӡ���������䣺
    you can you up
    no can no bibi


������:
1.�����������
2.����Ĭ��ʲô����?
3.������Ĭ��ʲô����?
4.long���ͺ�float������Ҫ������ĩβ��ʲô?


������:
1.����һ������ΪDemo����,�����н��������͵ı���������һ��,���������.


�ڰ���:
1.�ҳ����д����г���ĵط�,����������Ϊ�����еĴ���.
public class Test01 {
    public static void main(String[] args) {
        int a; 
        System.out.println(a);
        {
            int c = 20;
            System.out.println(c);
        }
        c = 30;
        System.out.println(c);
    }
}


public class Test02 {
    public static void main(String[] args) {
        int x = 2;
		double x = 3.14;
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        y = x;
        System.out.println("x is " + x);
    }
}

�ھ���:
	�������±���:
		int a = 200;
	�ִ�������Ҫ��,�ô����ʾ����:
	1.��a��ֵ��ֵ��byte���͵ı���b.
	2.��a��ֵ��ֵ��long���͵ı���c.
	