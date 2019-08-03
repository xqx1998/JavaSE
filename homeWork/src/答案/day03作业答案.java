package 答案;day03作业:
第一题:
	1.自定义两个变量,初始值自己给出,用if语句获取两个变量的最大值,并输出.
	public class Test01 {
		public static void main(String[] args) {
			//自定义两个变量
			int a = 10;
			int b = 20;
			//用if语句判断那个数是最大值,因为结果有两种情况,所以我们采用 if...else.. 结构
			if(a>b){
				//如果 a>b 
				System.out.println("a最大,值为: "+a);
			}else{
				//否则 b<a
				System.out.println("b最大,值为: "+b);
			}
		}
	}
	2.定义int类型变量score,代表成绩,判断成绩是否>=60并且成绩个位数是0,如果满足条件,打印出"合格的成绩",如果不满足条件,则打印出"不是合格的成绩"
	public class Test01 {
		public static void main(String[] args) {
			//自定义变量
			int score = 70;
			//判断成绩是否>=60并且成绩个位数是0 那么我们先取出成绩的个位数
			int ge = score%10;
			//用if判断条件  成绩是否>=60并且成绩个位数是0
			if(score>=60 && ge==0){
				//满足条件
				System.out.println("合格的成绩");
			}else{
				//不满足条件
				System.out.println("不是合格的成绩");
			}
		}
	}



第二题:
	分析以下需求，并用代码实现(if语句)：			
	1.功能描述:定义一个变量代表月份，输出对应的季节
	2.要求:
		(1)定义一个整数(代表月份,范围1-12)
		(2)输出该月份对应的季节
			3,4,5春季
			6,7,8夏季
			9,10,11秋季
			12,1,2冬季
		(3)演示格式如下:
			月份:3
			输出:3月份是春季
			
	public class Test02 {
		public static void main(String[] args) {
			//定义变量a代表月份
			int a = 3;
			//判断这个月份在哪个范围内
			if(3<=a && a<=5){
				System.out.println(a+"月份是春季");
			}else if(6<=a && a<=8){
				System.out.println(a+"月份是夏季");
			}else if(a==9 || a==10 || a==11){
				System.out.println(a+"月份是秋季");
			}else if(a==12 || a==1 || a==2){
				System.out.println(a+"月份是冬季");
			}else{
				System.out.println(a+"不属于月份数字");
			}
		}
	}
			
		
	

第三题:
	分别定义两个int类型的变量a,b
		1.定义一个方法,求两个数的和,并打印出来
		2.定义一个方法,求两个数的平均数,并打印出来
		3.定义一个方法,看两个数的和是否大于30,如果大于30,就输出 true 否则就输出 false
	调用上述定义的三个方法,分别将a,b当做参数传入,打印出ab变量的和,平均值及 ab的和是否大于30
		public class Test03 {
			//主方法
			public static void main(String[] args) {
			   int a = 10;
			   int b = 20;
			   //调用加的方法
				add(a,b);
				//调用求平均数的方法
				avg(a,b);
				//调用判断ab之和是否大于30的方法
				equal(a,b);

			}

			//1.定义一个方法,求两个数的和,并打印出来
			public static void add(int a , int b){
				int sum = a + b;
				System.out.println(sum);
			}

			//2.定义一个方法,求两个数的平均数,并打印出来
			public static void avg(int a , int b){
				int c = (a+b)/2;
				System.out.println(c);
			}

			//3.定义一个方法,看ab之和是否大于30,如果大于30,就输出 true 否则就输出 false
			public static void equal(int a , int b){
				int sum = a+b;
				if(sum > 30){
					System.out.println(true);
				}else{
					System.out.println(false);
				}
			}
		}


	
第四题:
	1.打印1到100之内的整数，但数字中包含9的要跳过（十位包含9，个位包含9）
	2.如：1 2 3 4 5 ....
	
	public class Test04 {
		public static void main(String[] args) {
			//1.先得到1-100之间的整数 用for循环,遍历1-100
			for (int i = 1; i <= 100; i++) {
				//2.判断每次循环得到的数字中有没有包含9
				// 2.1将当前循环的这个数(i)的个位和十位求出来
				int ge = i%10;
				int shi = i/10%10;
				//2.2 用if语句判断这个数的 个位和十位都不能包含9
				if(ge == 9 || shi == 9){
					continue;
				}else{
					System.out.println(i);
				}
				
			}
		}
	}
	

		
第五题:
	求出1-100之间，奇数的个数和所有奇数之和。并在控制台上进行打印
	
	public class Test05 {
		public static void main(String[] args) {
			//1.定义求和变量
			int sum = 0;
			//2.定义计数器
			int count = 0;
		   //3.先得到1-100之间的整数 用for循环,遍历1-100
			for (int i = 1; i <= 100; i++) {
				//4.判断当前遍历的数(i),是否为奇数,使用if语句
				if(i%2==1){
					//5.如果通过判断,则证明为奇数
					//将其累加到求和变量中
					sum += i;
					//计数器加1
					count++;
				}
			}
		}
	}
		

第六题:
	分析以下需求，并用while循环将代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，折叠多少次，可以折成珠穆朗玛峰的高度。
	
	public class Test06 {
		public static void main(String[] args) {
			//1.定义变量x代表纸的厚度
			double x = 0.0001;
			//2.定义变量count代表折叠次数
			int count = 0;
		   //3.因为现在我们不知道要循环多少次,所以这种不知道循环次数的情况下,一般我们用死循环
			while(true){
				//在死循环中,执行的是折纸的操作,每折一次,纸的厚度翻倍,同时折纸的次数加1
				x *= 2;
				count++;
				//4.当每一次折纸操作完成后,我们都要将当前纸的厚度和珠穆朗玛峰高度进行比较, 假如比珠穆朗玛峰高,则折纸操作结束
				if(x >= 8848){
					//结束死循环,即终止折纸操作
					break;
				}
			}

			//5.等while死循环结束后 那么现在纸的厚度已经超出珠穆朗玛峰了,这时计数器count变量,就记录了折纸的次数
			System.out.println(count);

		}
	}
	

	
第七题:
	求出三位数中所有的水仙花数,并将他们打印到控制台上.求出所有水仙花数的和,并统计共有多少个水仙花数.
	(什么是水仙花数? 一个三位数的 个位的三次方+十位的三次方+百位的三次方等于他本身,那么这个数就是水仙花数)
	例:153   1*1*1+5*5*5+3*3*3=153
	
	public class Test07 {
		public static void main(String[] args) {
			//1.定义求和变量
			int sum = 0;
			//2.定义计数器
			int count = 0;
			//3.先得到所有的三位数,即100-999 利用for循环实现
			for (int i = 100; i <= 999; i++) {
				//4.得到当前遍历的数(i)的个位,十位,和百位
				int ge = i%10;
				int shi = i/10%10;
				int bai = i/10/10%10;
				//5.判断 个位的三次方+十位的三次方+百位的三次方是否等于他本身, 如果相等,那么证明当前遍历的数是水仙花数(判断用if语句)
				if(ge*ge*ge+shi*shi*shi+bai*bai*bai == i){
					//6.能进入到if中,说明通过了水仙花数的判断,那么就将当前遍历的数累加到求和变量上,同时计数器加一
					sum += i;
					count++;
				}
			}
			//7.for循环结束后,我们就能得到所有三位数中的水仙花数的和(sum)和个数(count)
			System.out.println("sum: "+sum);
			System.out.println("count: "+count);

		}
	}
	 
	 
 
第八题:
	1.打印1到100之内的整数，但数字中包含3的要跳过
	2.每行输出5个满足条件的数，之间用空格分隔
	3.如：1 2 4 5 6
		  7 8 9 10 11
		  ...
		  
	public class Test08{
		public static void main(String[] args) {
			//1.定义计数器,记录输出的数的个数
			int count = 0;
			//2.先得到1-100的数,利用for循环实现
			for (int i = 1; i <= 100; i++) {
				//3.判断当前遍历的数(i)是否包含3
				//3.1 先得到当前遍历的数(i)的个位和十位
				int ge = i%10;
				int shi = i/10%10;
				//3.2 判断当前遍历的数(i)是否包含3,包含3就跳过, 即个位十位都不包含3才是符合条件的数据
				if(ge != 3 && shi != 3){
					//4.符合条件,就打印输出,同时计数器加1,注意 println后面的ln决定着这行输出语句换不换行,去掉ln,就不换行,中间加上空格字符串用户隔开每个数据
					System.out.print(i+" ");
					count++;
					//5.因为计数器代表的是输出了几个数字,那么每次计数器计数之后,我们都要判断当前输出数字的个数是不是5的倍数,是5的倍数就换行
					if(count % 5 == 0){
						//加上ln,什么都不输出,就是换行
						System.out.println();
					}
				}
			}
		}
	}
