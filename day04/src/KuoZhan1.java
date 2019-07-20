/*
	1.从控制台输入5个数求和求平均值
*/
import java.util.Scanner;
public class KuoZhan1 {
    public static void main(String[] args) {
		//1.键盘录入，导包、创建对象、接收数据
		Scanner sc=new Scanner(System.in);
		//定义一个变量sum，累加求和
		int sum=0;
		//使用for循环接收5个整数
		for(int i=1;i<=5;i++){
			//提示
			System.out.println("请输入第"+i+"个数");
			int num=sc.nextInt();
			//2.对5个数求和
			sum+=num;
		}
		System.out.println("sum="+sum);
		//3.求平均值
		double avg=sum*1.0/5;
		System.out.println("avg="+avg);
    }
}