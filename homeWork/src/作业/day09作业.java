day09作业:

必做题:
========================================
第一题:
	1.定义一个Animal类,包含如下行为:
		eat()  打印"要吃饭"
		run()  打印"会跑步"
		sleep() 打印"要睡觉"
	2.定义一个Dog类,继承Animal类,重写eat(),run()方法
		定义自己特有的行为 :
			cry() 打印"狗会汪汪叫"
	3.定义测试类DogTest, 创建Dog的对象,依次调用eat(),run(),sleep(),cry()方法,打印出如下语句
			狗要吃那啥
			狗跑的如脱缰的野狗
			要睡觉
			狗会汪汪叫
			
			
第二题:
	1.定义一个Phone抽象类,包含如下方法:
		普通方法: call() 输出:"打电话"
		普通方法: sendMessage() 输出:"发短信"
		抽象方法: playGame();
		
		
	2.定义一个IPhone类,继承Phone类
		重写sendMessage()方法,输出:"发彩信"
		实现playGame()方法,输出:"打王者农药"
		定义自己特有的行为 :
			siri() 打印"人工智障"
			
	3.定义测试类IPhoneTest, 创建IPhone的对象,调用方法,打印出如下语句
			打电话
			发彩信
			打王者农药
			人工智障
			
			
			
第三题:	
	1.定义Person类,包含空参、满参构造和以下成员变量:
			姓名name
			年龄age
		生成所有成员变量set/get方法
		定义方法：void printPerson(),打印出"我是山顶洞人"
		
	2.定义Student继承于Person类,新增如下属性
			学校 school
		生成空参、满参构造和set/get方法	
		定义方法:void printStudent(),先输出"我叫XXX,我今年YYY岁,我现在的学校是:ZZZ" 再调用printPerson()方法
		
	3.在测试类中,创建并初始化一个Student 对象 s, 调用printStudent()方法,打印出如下语句:
		我叫卡特琳娜,我今年19岁,我现在的学校是:战争学院
		我是山顶洞人

		
		
第四题:
	1.定义抽象类Phone，要求如下：
		包含空参、满参构造和以下成员变量
			品牌 brand（ String 型）
        生成所有成员变量set/get方法
        定义抽象方法：void playMusic(String s)
	2.定义类IPhone，要求如下：
		继承抽象类 Phone
			构造方法包括：空参构造和满参构造方法
			重写抽象方法：
			void playMusic(String s)，要求：输出打印"XXX手机正在播放歌曲:s"
			PS：XXX是Phone类中的 brand属性值，s是传入的参数
	3.定义测试类TestDemo，在main方法实现以下功能：
		创建并初始化一个IPhone 对象 phone，调用phone的playMusic(String s)方法,传入参数"菊花台"
		打印出如下语句:
			华为手机正在播放歌曲:菊花台
		
		
		


			
			


		

		



			
			