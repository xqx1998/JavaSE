/*
	第五题:
	求出三位数中所有的水仙花数,并将他们打印到控制台上.求出所有水仙花数的和,并统计共有多少个水仙花数.
	(什么是水仙花数? 一个三位数的 个位的三次方+十位的三次方+百位的三次方等于他本身,那么这个数就是水仙花数)
	例:153   1*1*1+5*5*5+3*3*3=153
		提示:不光要找出水仙花数,还要求和,还要统计个数!
*/
public class Test5 {
    public static void main(String[] args) {
		int sum=0;//累加
		int count=0;//计数器
		
		//1.循环遍历100-999
		for(int i=100;i<=999;i++){
			//2.获取各位、十位、百位数字  153
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10;
			//3.判断各位、十位、百位数字的立方和是否等于这个整数，如果等于就是水仙花数据
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				//是水仙花数
				System.out.println(i);
				//求和
				sum+=i;
				//统计个数
				count++;
			}
		}
		//打印累加结果
		System.out.println("sum="+sum);
		//打印统计的个数
		System.out.println("count="+count);
    }
}