package A04_While;

/*
	���������
	
	����
		�������ɽ�������������(8844.43��=8844430����)����������һ���㹻���ֽ�����ĺ����0.1���ס�
		���ʣ����۵����ٴΣ������۳����������ĸ߶�?
*/
public class WhileTest {
    public static void main(String[] args) {
		//����һ������������ʼֵΪ0
        int count=0;
		
		//����ֽ�ź��

		//�������������ĸ߶�
		int zf = 8844430;

		for (double paper=0.1; paper<=zf; paper*=2)
		    count++;
        System.out.println("�۵���"+count+"��");
    }
}