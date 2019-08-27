/*
	需求3：打印九九乘法表		
*/
public class ForTest4{
    public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			//内循环执行完了之后就会在一行打印9个@  @@@@@@@@@
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			//换行
			System.out.println();
		}
    }
}