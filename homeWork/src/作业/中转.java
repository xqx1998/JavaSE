package ��ҵ;	������:
byte b1=3,b2=4,b;
b=b1+b2; 
b=3+4;
�ľ��Ǳ���ʧ�ܵ��أ�Ϊʲô�أ�


������:
�ҳ����д����г���ĵط�,����������Ϊ�����еĴ���.
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
        byte b = 3;
        b = b + 4;
        System.out.println("b=" + b);
    }
}

	
	
public class Test03 {
    public static void main(String[] args) {
        int x = 2;
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        y = x;
        System.out.println("x is " + x);
    }
}



	
������:	
byte b1=3,b2=4,b;
b=b1+b2; 
b=3+4;
�ľ��Ǳ���ʧ�ܵ��أ�Ϊʲô�أ�
/*�ڶ�������ʧ��,��Ϊb1��byte����,b2Ҳ��byte����, byte����+byte����,���Ľ����int����, 
���ڽ�һ��int���͵Ľ��,��ֵ��byte���͵ı���b,��ô�ͻ���뱨��.
����취��,���ڶ���������¸Ķ�:
	b=(byte)(b1+b2)
��������һ��ǿ��ת��,�����int����ǿתΪbyte����,�ٽ�ֵ����byte����,�Ͳ��������
*/


������:
�ҳ����д����г���ĵط�,����������Ϊ�����еĴ���.
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
��������:
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
        byte b = 3;
        b = b + 4;//����b��byte����,4Ĭ����int����,�������,���Ϊint����,��int���͵Ľ����ֵ��byte���͵ı���b,�ͻ����
        System.out.println("b=" + b);
    }
}
������:
public class Test02 {
    public static void main(String[] args) {
        byte b = 3;
        b = (byte)(b+4); //���������һ��ǿ������ת��������
        System.out.println("b=" + b);
    }
}
	

	
public class Test07 {
    public static void main(String[] args) {
        int x = 2;
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
public class Test07 {
    public static void main(String[] args) {
        int x = 2;
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        int y = x; //��Ϊ�����Ѿ�����֮ǰy������ȡֵ��Χ,��ô���ǾͿ������¶���һ������y,���и�ֵ
        System.out.println("x is " + x);
    }
}


�ھ���:
	
			
			
������:
	1.����һ������a, ��ʼ��ֵ�Լ�����,�ж�a��ֵ�Ƿ����10,  ���true��false
	2.����һ������b, ��ʼ��ֵ�Լ�����,�ж�a��b��ֵ�Ƿ����, ���true��false
	3.����һ������c, ��ʼ��ֵ�Լ�����,�ж�c��ֵ�Ƿ�С�ڵ���a��b��ֵ֮��,���true��false
		int a = 11;
		if(a > 10){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		int b = 20;
		if(a == b){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		int c = 30;
		if(c <= (a+b)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		

		
			
��ʮ����:
�뽫���³��˵Ĳ���,����ÿ���׶�,��װ�ɶ�Ӧ�ķ���,�ٵ��÷�װ�ķ���,�ﵽ��֮ǰ����һ����Ч��.
	public class Test05{
		public static void main(String[] args){
			//ũ��
			System.out.println("����");
			System.out.println("��ˮ");
			System.out.println("ʩ��");
			System.out.println("����");
			System.out.println("�ո�");
			System.out.println("����С�̷�");
			
			//С�̷�
			System.out.println("���䵽ũó�г�");
			System.out.println("̧�߼۸�");
			System.out.println("ߺ��");
			System.out.println("��������");
			
			//����
			System.out.println("ϴ��");
			System.out.println("�в�");
			System.out.println("����");
			System.out.println("װ��");
			
			//����
			System.out.println("��");
		}
	}
	�޸ĺ�:
	public class Test05 {
	
		public static void main(String[] args) {
			farmer(); // ����ũ��ķ���
			seller(); // ����С�̷��ķ���
			cook(); // ���ó��ӵķ���
			guest(); // ���ÿ��˷���
		}
		
		// ����
		public static void cook() {
			System.out.println("ϴ��");
			System.out.println("�в�");
			System.out.println("����");
			System.out.println("װ��");
		}
		
		// ����
		public static void guest() {
			System.out.println("��");
		}
		
		// С�̷�
		public static void seller() {
			System.out.println("���䵽ũó�г�");
			System.out.println("̧�߼۸�");
			System.out.println("ߺ��");
			System.out.println("��������");
		}
		
		// ũ�񲮲�
		public static void farmer() {
			System.out.println("����");
			System.out.println("��ˮ");
			System.out.println("ʩ��");
			System.out.println("����");
			System.out.println("�ո�");
			System.out.println("����С�̷�");
		}
	}
	
��ǿ��:
=============================================================================		
������:
	1.����һ��Phone��.������������
			Ʒ��brand
			�۸�price
		�������г�Ա����set/get����,�ղι�����вι���
		
	2.����һ��Person��,������������
			����name
			����age
		�������г�Ա����set/get����,�ղι�����вι���
		����һ�����ֻ���Ϊ palyPhone(Phone p) Ҫ���ӡ:"YYY���XXX�������ֻ�,�ֻ�Ʒ����ZZZ,�۸�ΪQQQ
		
		PS��YYY��Person���е� age����ֵ��XXX��Person ���е� name����ֵ��ZZZ��Phone ���е� brand����ֵ,QQQ��Phone ���е� price����ֵ"
	
	3.�ڲ�����TestDemo��,����Person����ren,����ren�� palyPhone(Phone p) ����,��ӡ�� 
		"40����������������ֻ�,�ֻ�Ʒ����С��,�۸�Ϊ2999"
		ps:����p��Ҫ���д�������ʼ������brand�� price	
	
	
	
			

������:
	1.���������Study��Ҫ�����£�
		�����ղΡ����ι�������³�Ա����
			������󷽷���void stu(Phone p);
			������ͨ����: void info1()  ��ӡ"�ú�ѧϰ,��������"
			������ͨ����: void info2()  ��ӡ"��������,��н����"
			
	
	2.������Phone��Ҫ�����£�
		�����ղΡ����ι�������³�Ա����
			Ʒ�� brand
			�۸� price
        �������г�Ա����set/get����
        ���巽����void printPhone(),��ӡ��Phone�ľ�����Ϣ,��"XXX�ֻ�,�۸�YYY"
		ps: XXXΪPhone���brand���� yyyΪPhone���price����
		
	3.������Student�������ղΡ����ι�������³�Ա����
        ���� name��String �ͣ�
		���� age��int�ͣ�
        �������г�Ա����set/get����
		�����Ա������void studying(Learn le)��Ҫ��
			1.�����yyy���xxxxѧϰ�С���
			2.Ȼ���ڷ�����ͨ�������Learnd����le���ε���info1()��info2(),stu(Phone p)����
		ps: yyyΪStudent���е�age����,xxxxΪStudent���е�name����,
		ps: Learn�̳���Study�࣬��Ҫʵ��stu(Phone p)���󷽷���ʵ��Ҫ�󣺵��ò���p��printPhone()����;
		
	4.�����������,��������ʼ��һ��Student ���� s, ����studying(Learn le)����,��ӡ���������:
		15��Ĺ���ͮѧϰ��
		�ú�ѧϰ,��������
		��������,��н����
		��Ϊ�ֻ�,�۸�1999

		
		
					
������:
		����Ҫ��������¹��ܣ�
		�� ����ӿ�Study��Ҫ�����£�
			  ������󷽷��� void studyLine(Line line) 
			  ����Ĭ�Ϸ����� void info()��Ҫ�����ε���stu1()��stu2()
			  ����˽�з����� void stu1 (),Ҫ�����"�ú���ϰ����������"
							 void stu2 (),Ҫ�����"��ͷ���ã���н����"
							 
							 
		�ڶ�����Line�������ղΡ����ι�������³�Ա����
				������ѧϰ basicClass��String �ͣ�
				��ҵ��ѧϰ emplymentClass��String �ͣ�
			�������г�Ա����set/get����
			�����Ա������void printLine(),Ҫ�����"��ϰ·�ߣ�������ѧϰ��xxx����ҵ��ѧϰ��yyy",
				PS�� xxxΪ����basicClassֵ��yyyΪ����emplymentClassֵ
				
				
		�۶�����Student�������ղΡ����ι�������³�Ա����
			���� name��String �ͣ�
			���� age��int�ͣ�
        �������г�Ա����set/get����
		�����Ա������void studying(Study sy)��Ҫ�������xxxx��ϰ�С���Ȼ���ڷ��������ε���info()��studyLine (Line line)
		PS��xxxΪ����nameֵ������line��Ҫ���д�������ʼ������basicClass�� emplymentClass
		
		
		�� ���������Test����main����ʵ�����¹��ܣ�
		��������ʼ��һ��Student����stu�����÷��� studying(Study sy)
		syΪStudy��ʵ���࣬��Ҫʵ��studyLine (Line line)���󷽷���ʵ��Ҫ�󣺵��ò���line��printLine()����;
			ʾ�����£�
				�Ծ�����ϰ��
				�ú���ϰ,��������
				��ͷ����,��н����
				ѧϰ·��,������ѧϰ:JAVASE,��ҵ��ѧϰ:JAVAEE
				
				
������(������������Ƶ������):
		���������ʼǱ��࣬ʵ�ֱʼǱ�ʹ��USB��ꡢUSB����
			USB �ӿڣ������������ܡ��رչ���
			�ʼǱ��࣬�������й��ܡ��ػ����ܡ�ʹ�� USB�豸����
			����࣬Ҫʵ�� USB�ӿڣ����߱�����ķ���
			�����࣬Ҫʵ�� USB�ӿڣ��߱��û��ķ���



			

		����Ҫ��������¹��ܣ�
			�� ����ӿ�Bluetooth��Ҫ�����£�
					������󷽷��� void btFunction()
					����Ĭ�Ϸ����� void connecting()��Ҫ�����"��������WIFI"
					
			�� ���������Phone��Ҫ�����£�
					�����ղΡ����ι�������³�Ա����
					����name�� String �ͣ�
					�������г�Ա����set/get����
					������󷽷���void playMusic(Song song)
					
			�۶�����Song 
				   �����ղΡ����ι�������³�Ա����
					���� singer��String �ͣ�
					���� name�� String �ͣ�
					�������г�Ա����set/get����
					
			�� ������IPhone��Ҫ�����£�
					�̳г����� Phone��ʵ�ֽӿ� Bluetooth
					���췽���������ղι�������ι��췽��(String)
					��д���󷽷���
						void btFunction()��Ҫ�����"֧��WIFI����"
						void playMusic(Song song)��Ҫ�������ӡ"XXX�ֻ����ڲ���YYY����ZZZ"
				PS��XXX��Phone���е� name����ֵ��YYY��Song ���е� singer����ֵ��ZZZ��Song ���е� name����ֵ
				
			�� ���������Test����main����ʵ�����¹��ܣ�
			   ��������ʼ��һ��IPhone ����phone��һ��Song ����s������phone�� btFunction()��connecting()��playMusic(Song song)����,��ӡ����:
				֧��WIFI����
				��������WIFI
				��Ϊ�ֻ����ڲ����ܽ��׳��ľջ���
					
					

				

�ڰ���:
	������˵�����ע�ⲻҪ��ǰ���д��롣
	public class Test {
		public static void main(String[] args) {
			short s = 30;
			int i = 50;
			s += i;// s = (short)(s+i)
			System.out.println("s="+s); //  80
			int x = 0;
			int y = 0;
			int z = 0;
			boolean b;

			b = x>0 && z++>1;
			x++;//x=1
			System.out.println("b="+b);// false
			System.out.println("z="+z); //0

			b = x>0 || z++>1;
			System.out.println("b="+b);//true
			System.out.println("z="+z); //0        
		}
	}	


������:
	���߼������ʵ�����²���ʽ
		1. 0 < x < 5
			0<x && x<5
			
		2. 10 <= a <= 20
			10<=a && a<=20
		
		3. b < 5 ���� b > 10
			b < 5 || b > 10
		
		
		4. 0 < c < 5 ���� 10 < c < 20
			(0<c&&c<5)  ||  (10<c&&c<20)
		

��ʮ��:
	1.����һ����������һ��ѧ���ɼ�(int����)
	2.�жϸ�ѧ���ɼ��Ƿ񼰸�
	3.��ӡ��ʽ��
		�ɼ�>=60:��� ����
		�ɼ�<60: ��� ������

	��ʾ������ʹ�� ��Ԫ���������ʵ��
	public class Test02{
		public static void main(String[] args){
			int a = 70;
			String result = (a>=60)?"����":"������";
			System.out.println(result);
			System.out.println((a>=60)?"����":"������");
		}
	}
	

	
	2.��������int���ͱ���c,d,e. ����������������ֵ,����ӡ����
	public class Test04{
		public static void main(String[] args){
			int c = 10;
			int d = 20;
			int e = 30;
			//�Ƚ�����c�ͱ���d �е����ֵ�����
			int max1 = (c>d)?c:d;
			//�ٽ�cd�е����ֵ ��e���бȽ�,������ֵ
			int max2 = (max1>e)?max1:e;
			System.out.println(max2);
			
			//int max2 = (((c>d)?c:d)>e)?((c>d)?c:d):e;
		}
	}
	
					

�ڰ���:
	1.��������int���ͱ���a,b. ����������������ֵ,����ӡ����
	public class Test03{
		public static void main(String[] args){
			int a = 10;
			int b = 20;
			int max = (a>b)?a:b;
			System.out.println(max);
		}
	}
				

������:
�۲����д���,�ҳ����еĴ���,�����Ը���
public class Test02 {
    public static void main(String[] args) {
		byte b;
		System.out.println("b=" + b);
        b = 3;
        b = b + 4;
        System.out.println("b=" + b);
    }
}
		