/*
	4.循环输入整数进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果
	提示：
		这一天肯定要使用到循环，但是该用哪一种循环呢?
		隐含的信息：至少需要输入一次
*/
import java.util.Scanner;
public class KuoZhan4 {
    public static void main(String[] args) {
		
		//1.定义一sum变量累加
		int sum=0;
		//2.键盘录入，导包、创建对象、接收数据
		Scanner sc=new Scanner(System.in);
		//3.使用do...while循环接收数据
		//初始化语句
		int a=0;
		do{
			//循环体
			//接收输入的数据
			System.out.println("请输入一个整数进行累加，输入0表示结束:");
			a=sc.nextInt();
			//累加
			sum+=a;
		}while(a!=0);
		//打印结果
		System.out.println("sum="+sum);
    }
}