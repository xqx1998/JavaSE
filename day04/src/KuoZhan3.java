/*
	3.�й��������˵��������Ĺ����ǣ�
	����һ�򣬰��겻���İ������򡣣�����ܹ���4���������ܱ�100�����������꣬
	����ܱ�400����Ҳ�����꣩�����ӡ��1988�굽2019�������������ݡ�
*/
public class KuoZhan3 {
    public static void main(String[] args) {
		//1.forѭ������1988-2019�������������ݡ�
		for(int year=1988;year<=2019;year++){
			//2.�ж� ����Ƿ񹻱�4���������ܱ�100����  ���� ����ܱ�400����Ҳ������
			/*if(year%4==0 && year%100!=0){
				System.out.println(year+"��������");
			}else if(year%400==0){
				System.out.println(year+"��������");
			}*/
			if((year%4==0 && year%100!=0) || year%400==0){
				System.out.println(year+"��������");
			}
		}
    }
}