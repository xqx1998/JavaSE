package A04_While;

/*
	珠穆朗玛峰
	
	需求：
		世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我有一张足够大的纸，它的厚度是0.1毫米。
		请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
*/
public class WhileTest {
    public static void main(String[] args) {
		//定义一个计数器，初始值为0
        int count=0;
		
		//定义纸张厚度

		//定义珠穆朗玛峰的高度
		int zf = 8844430;

		for (double paper=0.1; paper<=zf; paper*=2)
		    count++;
        System.out.println("折叠了"+count+"次");
    }
}