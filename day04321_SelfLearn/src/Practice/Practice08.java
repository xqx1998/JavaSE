package Practice;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:�ڰ���(˼��):
 * 	1.��ӡ1��100֮�ڵ��������������а���3��Ҫ����
 * 	2.ÿ�����5����������������֮���ÿո�ָ�
 * 	3.�磺1 2 4 5 6
 * 		  7 8 9 10 11
 * 		  ...
 *
 * 		  ��ʾ:System.out.println();//���������
 * 			   System.out.print();//���������
 */
public class Practice08 {
    public static void main(String[] args) {
        //�������м�����
        int count = 0;
        for (int i = 1; i < 100; i++) {
            //�ж��Ƿ���3
            if (i%10==3 || i/10%10==3){
            //    �������������κδ���
            }else{
                System.out.print(i+"  ");
                count++;
                //�ж��������Ƿ����5�����ȣ�����
                if (count==5){
                    count = 0;
                    System.out.println();
                }
            }
        }
    }
}
