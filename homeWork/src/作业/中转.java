package 作业;	第六题:
byte b1=3,b2=4,b;
b=b1+b2; 
b=3+4;
哪句是编译失败的呢？为什么呢？


第七题:
找出下列代码中出错的地方,并将其修正为能运行的代码.
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



	
第六题:	
byte b1=3,b2=4,b;
b=b1+b2; 
b=3+4;
哪句是编译失败的呢？为什么呢？
/*第二句会编译失败,因为b1是byte类型,b2也是byte类型, byte类型+byte类型,最后的结果是int类型, 
现在将一个int类型的结果,赋值给byte类型的变量b,那么就会编译报错.
解决办法是,将第二句进行如下改动:
	b=(byte)(b1+b2)
给它加上一个强制转换,将结果int类型强转为byte类型,再将值赋给byte类型,就不会出错了
*/


第七题:
找出下列代码中出错的地方,并将其修正为能运行的代码.
public class Test01 {
    public static void main(String[] args) {
        int a; 
        System.out.println(a); //变量a没赋值直接使用,会出错
        {
            int c = 20;
            System.out.println(c);
        }
        c = 30;//这里超出了变量c的取值范围,根本找不到变量c,就不能重新赋值
        System.out.println(c);//这里超出了变量c的取值范围,根本找不到变量c 同样不能打印
    }
}
修正代码:
public class Test01 {
    public static void main(String[] args) {
        int a = 10; //给a赋上初始化值
        System.out.println(a); 
        {
            int c = 20;
            System.out.println(c);
        }
        int c = 30;//因为这里已经超出之前c变量的取值范围,那么我们就可以重新定义一个变量c 进行赋值,这样就能打印输出了
        System.out.println(c);
    }
}





public class Test02 {
    public static void main(String[] args) {
        byte b = 3;
        b = b + 4;//这里b是byte类型,4默认是int类型,两者相加,结果为int类型,将int类型的结果赋值给byte类型的变量b,就会出错
        System.out.println("b=" + b);
    }
}
修正后:
public class Test02 {
    public static void main(String[] args) {
        byte b = 3;
        b = (byte)(b+4); //在这里加上一个强制类型转换就行了
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
        y = x; //在这里已经超出了变量y的取值范围,根本找不到变量c,就不能重新赋值
        System.out.println("x is " + x);
    }
}
修正后:
public class Test07 {
    public static void main(String[] args) {
        int x = 2;
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        int y = x; //因为这里已经超出之前y变量的取值范围,那么我们就可以重新定义一个变量y,进行赋值
        System.out.println("x is " + x);
    }
}


第九题:
	
			
			
第五题:
	1.定义一个变量a, 初始化值自己决定,判断a的值是否大于10,  输出true或false
	2.定义一个变量b, 初始化值自己决定,判断a和b的值是否相等, 输出true或false
	3.定义一个变量c, 初始化值自己决定,判断c的值是否小于等于a和b的值之和,输出true或false
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
		

		
			
第十二题:
请将以下炒菜的步骤,根据每个阶段,封装成对应的方法,再调用封装的方法,达到和之前代码一样的效果.
	public class Test05{
		public static void main(String[] args){
			//农民
			System.out.println("播种");
			System.out.println("浇水");
			System.out.println("施肥");
			System.out.println("除虫");
			System.out.println("收割");
			System.out.println("卖给小商贩");
			
			//小商贩
			System.out.println("运输到农贸市场");
			System.out.println("抬高价格");
			System.out.println("吆喝");
			System.out.println("卖给厨子");
			
			//厨子
			System.out.println("洗菜");
			System.out.println("切菜");
			System.out.println("炒菜");
			System.out.println("装盘");
			
			//客人
			System.out.println("吃");
		}
	}
	修改后:
	public class Test05 {
	
		public static void main(String[] args) {
			farmer(); // 调用农民的方法
			seller(); // 调用小商贩的方法
			cook(); // 调用厨子的方法
			guest(); // 调用客人方法
		}
		
		// 厨子
		public static void cook() {
			System.out.println("洗菜");
			System.out.println("切菜");
			System.out.println("炒菜");
			System.out.println("装盘");
		}
		
		// 客人
		public static void guest() {
			System.out.println("吃");
		}
		
		// 小商贩
		public static void seller() {
			System.out.println("运输到农贸市场");
			System.out.println("抬高价格");
			System.out.println("吆喝");
			System.out.println("卖给厨子");
		}
		
		// 农民伯伯
		public static void farmer() {
			System.out.println("播种");
			System.out.println("浇水");
			System.out.println("施肥");
			System.out.println("除虫");
			System.out.println("收割");
			System.out.println("卖给小商贩");
		}
	}
	
加强题:
=============================================================================		
第五题:
	1.定义一个Phone类.包含如下属性
			品牌brand
			价格price
		生成所有成员变量set/get方法,空参构造和有参构造
		
	2.定义一个Person类,包含如下属性
			姓名name
			年龄age
		生成所有成员变量set/get方法,空参构造和有参构造
		定义一个玩手机行为 palyPhone(Phone p) 要求打印:"YYY岁的XXX正在玩手机,手机品牌是ZZZ,价格为QQQ
		
		PS：YYY是Person类中的 age属性值，XXX是Person 类中的 name属性值，ZZZ是Phone 类中的 brand属性值,QQQ是Phone 类中的 price属性值"
	
	3.在测试类TestDemo中,创建Person对象ren,调用ren的 palyPhone(Phone p) 方法,打印出 
		"40岁的罗永浩正在玩手机,手机品牌是小米,价格为2999"
		ps:参数p需要自行创建并初始化变量brand与 price	
	
	
	
			

第六题:
	1.定义抽象类Study，要求如下：
		包含空参、满参构造和以下成员方法
			定义抽象方法：void stu(Phone p);
			定义普通方法: void info1()  打印"好好学习,天天向上"
			定义普通方法: void info2()  打印"键盘敲烂,月薪过万"
			
	
	2.定义类Phone，要求如下：
		包含空参、满参构造和以下成员变量
			品牌 brand
			价格 price
        生成所有成员变量set/get方法
        定义方法：void printPhone(),打印出Phone的具体信息,如"XXX手机,价格YYY"
		ps: XXX为Phone类的brand属性 yyy为Phone类的price属性
		
	3.定义类Student，包含空参、满参构造和以下成员变量
        姓名 name（String 型）
		年龄 age（int型）
        生成所有成员变量set/get方法
		定义成员方法：void studying(Learn le)，要求：
			1.输出“yyy岁的xxxx学习中”，
			2.然后在方法内通过传入的Learnd对象le依次调用info1()，info2(),stu(Phone p)方法
		ps: yyy为Student类中的age方法,xxxx为Student类中的name方法,
		ps: Learn继承于Study类，需要实现stu(Phone p)抽象方法，实现要求：调用参数p的printPhone()方法;
		
	4.定义测试类中,创建并初始化一个Student 对象 s, 调用studying(Learn le)方法,打印出如下语句:
		15岁的关晓彤学习中
		好好学习,天天向上
		键盘敲烂,月薪过万
		华为手机,价格1999

		
		
					
第五题:
		根据要求完成以下功能：
		① 定义接口Study，要求如下：
			  定义抽象方法： void studyLine(Line line) 
			  定义默认方法： void info()，要求：依次调用stu1()，stu2()
			  定义私有方法： void stu1 (),要求：输出"好好练习，天天向上"
							 void stu2 (),要求：输出"镜头拍烂，月薪百万"
							 
							 
		②定义类Line，包含空参、满参构造和以下成员变量
				基础班学习 basicClass（String 型）
				就业班学习 emplymentClass（String 型）
			生成所有成员变量set/get方法
			定义成员方法：void printLine(),要求：输出"练习路线，基础班学习：xxx，就业班学习：yyy",
				PS： xxx为变量basicClass值，yyy为变量emplymentClass值
				
				
		③定义类Student，包含空参、满参构造和以下成员变量
			姓名 name（String 型）
			年龄 age（int型）
        生成所有成员变量set/get方法
		定义成员方法：void studying(Study sy)，要求：输出“xxxx练习中”，然后在方法内依次调用info()，studyLine (Line line)
		PS：xxx为变量name值，参数line需要自行创建并初始化变量basicClass与 emplymentClass
		
		
		④ 定义测试类Test，在main方法实现以下功能：
		创建并初始化一个Student对象stu，调用方法 studying(Study sy)
		sy为Study的实现类，需要实现studyLine (Line line)抽象方法，实现要求：调用参数line的printLine()方法;
			示例如下：
				苍井空练习中
				好好练习,天天向上
				镜头拍烂,月薪百万
				学习路线,基础班学习:JAVASE,就业班学习:JAVAEE
				
				
第六题(看后面两个视频做这题):
		进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
			USB 接口，包含开启功能、关闭功能
			笔记本类，包含运行功能、关机功能、使用 USB设备功能
			鼠标类，要实现 USB接口，并具备点击的方法
			键盘类，要实现 USB接口，具备敲击的方法



			

		根据要求完成以下功能：
			① 定义接口Bluetooth，要求如下：
					定义抽象方法： void btFunction()
					定义默认方法： void connecting()，要求：输出"可以连接WIFI"
					
			② 定义抽象类Phone，要求如下：
					包含空参、满参构造和以下成员变量
					名称name（ String 型）
					生成所有成员变量set/get方法
					定义抽象方法：void playMusic(Song song)
					
			③定义类Song 
				   包含空参、满参构造和以下成员变量
					歌手 singer（String 型）
					歌名 name（ String 型）
					生成所有成员变量set/get方法
					
			④ 定义类IPhone，要求如下：
					继承抽象类 Phone，实现接口 Bluetooth
					构造方法包括：空参构造和满参构造方法(String)
					重写抽象方法：
						void btFunction()，要求：输出"支持WIFI功能"
						void playMusic(Song song)，要求：输出打印"XXX手机正在播放YYY唱的ZZZ"
				PS：XXX是Phone类中的 name属性值，YYY是Song 类中的 singer属性值，ZZZ是Song 类中的 name属性值
				
			⑤ 定义测试类Test，在main方法实现以下功能：
			   创建并初始化一个IPhone 对象phone和一个Song 对象s，调用phone的 btFunction()、connecting()和playMusic(Song song)方法,打印如下:
				支持WIFI功能
				可以连接WIFI
				华为手机正在播放周杰伦唱的菊花残
					
					

				

第八题:
	看程序说结果，注意不要提前运行代码。
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


第七题:
	用逻辑运算符实现如下不等式
		1. 0 < x < 5
			0<x && x<5
			
		2. 10 <= a <= 20
			10<=a && a<=20
		
		3. b < 5 或者 b > 10
			b < 5 || b > 10
		
		
		4. 0 < c < 5 或者 10 < c < 20
			(0<c&&c<5)  ||  (10<c&&c<20)
		

第十题:
	1.定义一个整数代表一个学生成绩(int类型)
	2.判断该学生成绩是否及格
	3.打印格式：
		成绩>=60:输出 及格
		成绩<60: 输出 不及格

	提示：可以使用 三元算术运算符实现
	public class Test02{
		public static void main(String[] args){
			int a = 70;
			String result = (a>=60)?"及格":"不及格";
			System.out.println(result);
			System.out.println((a>=60)?"及格":"不及格");
		}
	}
	

	
	2.定义三个int类型变量c,d,e. 求出三个变量的最大值,并打印出来
	public class Test04{
		public static void main(String[] args){
			int c = 10;
			int d = 20;
			int e = 30;
			//先将变量c和变量d 中的最大值求出来
			int max1 = (c>d)?c:d;
			//再将cd中的最大值 和e进行比较,求出最大值
			int max2 = (max1>e)?max1:e;
			System.out.println(max2);
			
			//int max2 = (((c>d)?c:d)>e)?((c>d)?c:d):e;
		}
	}
	
					

第八题:
	1.定义两个int类型变量a,b. 求出两个变量的最大值,并打印出来
	public class Test03{
		public static void main(String[] args){
			int a = 10;
			int b = 20;
			int max = (a>b)?a:b;
			System.out.println(max);
		}
	}
				

第三题:
观察下列代码,找出其中的错误,并加以改正
public class Test02 {
    public static void main(String[] args) {
		byte b;
		System.out.println("b=" + b);
        b = 3;
        b = b + 4;
        System.out.println("b=" + b);
    }
}
		