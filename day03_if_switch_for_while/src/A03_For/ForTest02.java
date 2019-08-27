package A03_For;

/*
	求和
	
	需求：
		求1-5之间的数据和，并把求和结果在控制台输出
*/
public class ForTest02 {
    public static void main(String[] args) {
		//求和的最终结果必须保存起来，需要定义一个变量(积分卡)，用于保存求和的结果，初始值为0
		int sum=0;//积分卡默认是0分
		
		//从1开始到5结束的数据，使用循环结构完成，逛5次超市
		for(int i=1;i<=5;i++){ //i表示第几次逛超市就积几个积分。
		
			//int sum=0;//积分卡默认是0分,错误写法，要放到for循环外面
		
			//将反复进行的事情写入循环结构内部，此处反复进行的事情是将数据 i 加到用于保存最终求和的变量 sum 中
			sum+=i;//等价于sum=sum+i;
		}
		//当循环执行完毕时，将最终数据打印出来
		System.out.println(sum);
    }
}