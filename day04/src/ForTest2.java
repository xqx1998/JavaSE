/*
	需求2：循环打印如下图形
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		@@@@@@@@@
		要求：每次只能打印一个@
		
		
		
*/
public class ForTest2{
    public static void main(String[] args) {
		for(int i=1;i<=9;i++){
			//内循环执行完了之后就会在一行打印9个@  @@@@@@@@@
			for(int j=1;j<=9;j++){
				System.out.print("@  ");
			}
			//换行
			System.out.println();
		}
    }
}