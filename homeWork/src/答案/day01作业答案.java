package 答案;第一题:
1.定义一个HelloWold类
2.在类中定义主方法
3.在主方法中使用输出语句在dos控制台打印HelloWorld
4.在案例中使用当行注释、多行注释添加相关的说明信息
//定义一个HelloWold类
public class HelloWold{
	/*定义主方法*/
	public static void main(String[] args){
		//打印字符串"HelloWorld"
		System.out.println("HelloWorld");
	}
}


第二题:
1.描述JRE是什么？//JRE是Java运行运行环境.
2.描述JDK的是什么？ //JDK是java开发环境
3.描述JVM是什么？作用是什么？  //JVM是java虚拟机,实现JAVA程序的跨平台
4.简述JRE、JDK、JVM的关系是什么？//JDK包含JRE和开发工具,JRE包含JVM和一些核心类库


第三题:
1.简述什么是java中的关键字 //java中已经定义好的,有特俗含义的字,不可以随便使用
2.关键字的特点  //1.小写  2.变色
3.举出至少5个java中常见的关键 //public class static  void int  

第四题:
以下选项中的标识符中，哪些是合法的()
    A:  username //合法
    B:  123username //不合法 数字开头了
    C:  username123 //合法
    D:  class //不合法  class是关键字
    E:  user_name //合法
    F:  98.3 0 //不合法 数字开头了
    G:  _username //合法
    H:  HelloWorld  //合法
    I:  $ username //不合法  空格不是组成部分

	
第五题:
1.定义一个名叫Test的类
2.要求在控制台打印输出如下语句：
    you can you up
    no can no bibi
public class Test{
	public static void main(String[] args){
		System.out.println("you can you up");
		System.out.println("no can no bibi");
	}
}



第六题:
1.简述四类八种
/*
	整型: byte short int long
	浮点型: float double
	字符型: char
	布尔型: boolean
*/
2.整型默认什么类型? //int
3.浮点数默认什么类型? //double
4.long类型和float类型需要在数据末尾加什么? //long类型要加L  float类型要加F

第七题:
1.定义一个名称为Demo的类,在类中将八种类型的变量都定义一遍,并进行输出.
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



第八题:
1.找出下列代码中出错的地方,并将其修正为能运行的代码.
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
修正后:
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
        int x = 2;
		double x = 3.14; //在此之前已经定义了一个变量x,在这里不能再次定义变量x,因为在同一作用域内变量名不可重复
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
public class Test02 {
    public static void main(String[] args) {
        int x = 2;
		//去掉double x = 3.14;
        {
            int y = 6;
            System.out.println("x is " + x);
            System.out.println("y is " + y);
        }
        int y = x; //因为这里已经超出之前y变量的取值范围,那么我们就可以重新定义一个变量y,进行赋值
        System.out.println("x is " + x);
    }
}
	
	


	
	