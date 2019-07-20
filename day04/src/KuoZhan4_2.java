/*
	4.循环输入整数进行累加，直到输入的数字为0，就结束循环，并最后输出累加的结果
	提示：
		这一天肯定要使用到循环，但是该用哪一种循环呢?
		隐含的信息：至少需要输入一次
*/
import java.util.Scanner;
public class KuoZhan4_2{
    public static void main(String[] args) {
		
		//1.定义一sum变量累加
		int sum=0;
		//2.键盘录入，导包、创建对象、接收数据
		Scanner sc=new Scanner(System.in);
		//3.使用while循环接收数据
		while(true){
			//接收数据
			int num=sc.nextInt();
			//判断是否是0，如果是0那么就跳出循环
			if(num==0){
				break;
			}
			//累加
			sum+=num;
		}
		//打印结果
		System.out.println("sum="+sum);
    }
}