/*
	1.打印1到100之内的整数，但数字中包含9的要跳过（十位包含9，个位包含9）
	2.如：1 2 3 4 5 ....
		提示:可以反过来思考,满足条件就打印,不满足条件就不打印,条件是个位不为9并且十位不为9
*/
public class Test4 {
    public static void main(String[] args) {
		//1.打印1到100之内的整数 for循环
		for(int i=1;i<=100;i++){
			//2.获取个位数和十位数
			int ge=i%10;
			int shi=i/10;
			//3.判断个位不为9并且十位不为9才打印出来
			if(ge!=9 && shi!=9){
				System.out.println(i);
			}
		}
		
		
    }
}