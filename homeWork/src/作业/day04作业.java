day04作业:

第一题:
	分析以下需求，并用代码实现(每个小需求都需要封装成方法,并在main方法中调用)
	1.求两个数据之和(整数 小数),在main方法中打印出来
	2.判断两个数据是否相等(整数 整数),在控制台上打印出来 
	3.获取两个数中较大的值(整数 小数),在控制台上打印出来
	4.获取两个数中较小的值(整数 整数),在main方法中打印出来
	PS:在控制台上打印出来,那就是说无论在我们自己定义的方法中打印,还是将结果返回在主方法中打印,都是打印在控制台上,所以有没有返回值都可以
		但是,假如说是在主方法中打印出来,那就说明在主方法中调用该方法后,一定要获取到该方法的结果,才能在主方法中打印,所以就必须有返回值
	

第二题:
	1.定义两个变量代表长方形的长和宽
		定义方法计算该长方形的周长,并在main方法中打印周长(周长 = (长+宽)*2)
	2.定义两个变量代表长方形的长和宽
		定义方法计算该长方形的面积,并在main方法中打印面积(面积 = 长*宽)
	3.定义一个变量代表圆的半径(π取3.14)
		定义方法计算该圆的周长,并在main方法中打印周长(周长 = 2*π*半径)
	4.定义一个变量代表圆的半径(π取3.14)
		定义方法计算该圆的面积,并在main方法中打印面积(面积 = π*半径*半径)
		

第三题:
	分析以下需求，并用代码实现：
	什么是水仙花数呢?
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	153 = 1*1*1 + 5*5*5 + 3*3*3
	要求:
		1.定义方法 isSXH(int num)
			功能:判断数字num是否是水仙花数,如果是返回true,如果不是返回false
		2.在主方法中借助1中定义的方法,打印所有的水仙花数及水仙花数的总个数
	

	
第四题:
	定义一个方法,该方法能多次打印HelloWorld,要求调用该方法,传入一个int类型的参数n,要求调用该方法,能通过参数n控制打印HelloWorld的次数.
		当传入0时,HelloWorld不打印
		当传入1时,HelloWorld打印1次
		当传入2时,HelloWorld打印2次
		当传入3时,HelloWorld打印3次
					.
					.
					.
		当传入100时,HelloWorld打印100次		
		以此类推

		
第五题:
	1.定义一个方法,能够判断传入的int类型数据是不是偶数,返回true或false
	2.借用1中定义的方法,判断1-100中那些数字是偶数,并打印出来,求和.
	

第六题:
	1.定义一个方法,功能为:计算1~n之间的奇数的平均数,并将其结果返回.
	2.在主方法中调用该方法,随便传入一个整数,将返回的结果打印出来
	

