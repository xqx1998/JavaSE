package homework;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/19 19:07
 * description:������:
 * 	1.��ӡ1��100֮�ڵ��������������а���9��Ҫ������ʮλ����9����λ����9��
 * 	2.�磺1 2 3 4 5 ....
 * 		��ʾ:���Է�����˼��,���������ʹ�ӡ,�����������Ͳ���ӡ,�����Ǹ�λ��Ϊ9����ʮλ��Ϊ9
 *
 */
public class work4 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if(i%10==9 || i/10%10==9){
                //�˴������������ô�ӡ
            }else{
                System.out.println(i);
            }

        }
    }
}
