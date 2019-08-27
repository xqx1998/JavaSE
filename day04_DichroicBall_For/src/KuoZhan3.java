/*
	3.中国有闰年的说法。闰年的规则是：
	四年一闰，百年不闰，四百年再闰。（年份能够被4整除但不能被100整除算是闰年，
	年份能被400整除也是闰年）。请打印出1988年到2019年的所有闰年年份。
*/
public class KuoZhan3 {
    public static void main(String[] args) {
		//1.for循环遍历1988-2019年的所有闰年年份。
		for(int year=1988;year<=2019;year++){
			//2.判断 年份是否够被4整除但不能被100整除  或者 年份能被400整除也是闰年
			/*if(year%4==0 && year%100!=0){
				System.out.println(year+"年是闰年");
			}else if(year%400==0){
				System.out.println(year+"年是闰年");
			}*/
			if((year%4==0 && year%100!=0) || year%400==0){
				System.out.println(year+"年是闰年");
			}
		}
    }
}