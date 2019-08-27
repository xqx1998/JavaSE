/*
	2.从控制台输入一个三位数并倒叙打印。例如输入的是153，则打印的结构是351
*/
import java.util.Scanner;
public class KuoZhan2 {
    public static void main(String[] args) {
		//1.键盘录入，导包、创建对象、接收数据
		Scanner sc=new Scanner(System.in);
		//接收数据
		System.out.println("请输入一个三位数：");
		int a=sc.nextInt();
		//获取各位、十位、百位数字  153
		int ge=a%10;
		int shi=a/10%10;
		int bai=a/10/10;
		//重新组合一个新的三位数据 351
		int num=ge*100+shi*10+bai;
		System.out.println("倒叙之后："+num);
    }
}