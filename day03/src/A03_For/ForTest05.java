package A03_For;

/*
	水仙花
		水仙花数是一个三位数的整数，如果这个数的个位、十位、百位的立方和等于这个整数，
		那么这个整数就成为水仙花数据。
		例如：153就是一个水仙花数
			3*3*3+5*5*5+1*1*1*1=27+125+1=153
	需求：
		在控制台打印水仙花数的个数
*/
public class ForTest05 {
    public static void main(String[] args) {
		//定义一个计数器
		int count=0;
		//1.输出所有的水仙花数必然要使用到循环，遍历所有的三位数，三位数从100开始，到999结束
		for(int i=100;i<1000;i++){
			//2.在计算之前获取三位数中每个位上的值  153
			int ge=i%10;//3
			int	shi=i/10%10; //5
			int bai=i/10/10; //1
			//3.判定条件是将三位数中的每个数值取出来，计算立方和后与原始数字比较是否相等
			if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
				//4.输出满足条件的数字就是水仙花数,说明i就是水仙花数，那么计数器+1
				//System.out.println(i);
				count++;
			}	
		}
		//输出水仙花数的个数
		System.out.println("100-999之间总共有"+count+"个水仙花数");
    }
}