/*
	5.循环输入5个整数，打印5个数中的最大值和最小值
	提示：
		1.定义两个整型变量max和min保存第一次输入的数，默认将第一个数最为最大值和最小值
		2.循环接收另外4个数，分别和max和min比较大小，找到最大值和最小值
*/
import java.util.Scanner;
public class KuoZhan5 {
    public static void main(String[] args) {
		//1.键盘录入，导包、创建对象、接收数据
		Scanner sc=new Scanner(System.in);
		//2.第一次输入数据
		int num=sc.nextInt();
		//定义两个变量分别表示最大值和最小值，将第一次接收的整数作为默认的最大值和最小值
		int max=num; //10
		int min=num;
		//3.循环输入4次数据
		for(int i=1;i<=4;i++){
			int a=sc.nextInt();
			//判断获取最大值
			if(a>max){
				max=a;
			}
			//判断获取最小值
			if(a<min){
				min=a;
			}
		}
		//打印结果
		System.out.println("max="+max);
		System.out.println("min="+min);
    }
}