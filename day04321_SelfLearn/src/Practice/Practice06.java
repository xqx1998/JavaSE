package Practice;

import java.util.Date;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:������:
 * 	1.��ӡ1��100֮�ڵ��������������а���3��Ҫ����
 * 	3.ͳ�������˶��ٸ�Ԫ��.����ӡ�ڿ���̨��
 */
public class Practice06 {
    public static void main(String[] args) {
        //����������
        int count = 0;
        System.out.println("1~100�������в�����3����Ϊ��");
        Date time1 = new Date();
        for (int i = 1; i < 101; i++) {
            if (i%10==3 || i/10%10==3){
                count++;
                continue;
            }else{
                System.out.println(i);
            }
        }
        Date time2 = new Date();
        long timeDifference = time2.getTime()-time1.getTime();
        System.out.println("timeDifference = " + timeDifference);
        System.out.println("������"+count+"��Ԫ��");
    }
}
// <= : timeDifference = 33746
//
