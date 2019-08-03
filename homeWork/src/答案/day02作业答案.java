package 答案;第一题:
	1: char,byte,short 这三种类型在参与运算时,会首先提升成什么类型?
		//char,byte,short 这三种类型在参与运算时会自动先提升为int类型
	2: char和int类型能够相互转换,依赖于什么?
		//依赖于ASC码表
	3: int a = 10; byte b = a; 这段代码有没有问题? 如有问题请改正
		有问题,变量a是int类型,不能直接赋值给byte类型的b,要进行强制转换
		改正:
		int a = 10;
		byte b = (byte)a;


第二题:	
byte b1=3,b2=4,b;
b=b1+b2; 
b=3+4;//JDK的常量优化策略
哪句是编译失败的呢？为什么呢？
/*第二句会编译失败,因为b1是byte类型,b2也是byte类型, byte类型+byte类型,最后的结果是int类型, 
现在将一个int类型的结果,赋值给byte类型的变量b,那么就会编译报错.
解决办法是,将第二句进行如下改动:
	b=(byte)(b1+b2)
给它加上一个强制转换,将结果int类型强转为byte类型,再将值赋给byte类型,就不会出错了
*/



第三题:
	 看程序说答案
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
	 
	 
第四题:
	看程序说答案
	int a = 10;
	a += 2; //a=?  12
	a -= 3; //a=?  9
	a *= 4; //a=?  36
	a /= 5; //a=?  7
	a %= 3; //a=?  1
	
	
第五题:
	1.定义一个变量a, 初始化值自己决定,判断a的值是否大于10,  输出true或false
	伪代码
		int a = 10;
		boolean flag1 = (a>10)?true:false;
		System.out.println(flag1);
		或者:
		System.out.println(a>10);
	
	2.定义一个变量b, 初始化值自己决定,判断a和b的值是否相等, 输出true或false
		int b = 20;
		boolean flag2 = (a==b)?true:false;
		System.out.println(flag2);
		或者:
		System.out.println(a==b);
	
	3.定义一个变量c, 初始化值自己决定,判断c的值是否小于等于a和b的值之和,输出true或false
		int c = 40;
		int d = a+b;
		boolean flag3 = (c<=d)?true:false;
		System.out.println(flag3);
		或者:
		System.out.println(c<=(a+b));
		
		




第六题:
	1.定义一个三位整数，请分别获取该三位数上每一位的数值
	2.例如：定义的整数123的个位、十位、百位，分别是3、2、1
	3.将个位,十位,百位打印出来.
	public class Test01{
		public static void main(String[] args){
			int a = 123;
			int ge = a%10;
			int shi = a/10%10;
			int bai = a/10/10%10;
			int qian = a/10/10/10%10;
			System.out.println("数字"+a+"的个位是 "+ge+", 十位是 "+shi+", 百位是 "+bai);
		}
	}

	

	


	
