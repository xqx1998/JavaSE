package A01_If;
/*
	需求：使用键盘录入一个整数，判断该数是奇数还是偶数，如果是奇数就打印奇数，否则就打印偶数
*/
import java.util.Scanner;
public class IfDemo02{
	public static void main(String[] args){
		//1.键盘录入：导包、创建对象、接收数据
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int a=sc.nextInt();
		//2.判断该数是奇数还是偶数，如果是奇数就打印奇数，否则就打印偶数 两种情况，使用if...else结构
		//判断奇数和偶数：a%2
		System.out.println("a%1="+a%1);
		if(a%2==1){
			System.out.println("该数为 奇数");
		}else{
			System.out.println("该数为 偶数数");
		}
	}
}