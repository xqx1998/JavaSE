package Test;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/18 19:42
 * description:
 */
/*
 * ������
 */
import java.util.ArrayList;
import java.util.Collections;

public class T6 {
    public static void main(String[] args) {
        //1.׼����
        ArrayList<String> poker = new ArrayList<>();

        //2.��������String���͵����飬�����洢�ƵĻ�ɫ�����
        String[] colors = {"","","",""};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //������С��
        poker.add("����");
        poker.add("С��");

        //4.��52����װ��poker��
        for (String num : numbers) {
            for (String color : colors) {
                poker.add(color+num);
            }
        }

        //5.�����Ƶ�˳��
        Collections.shuffle(poker);

        //6.����
        //�����ĸ����ϴ洢������ҵ��ƺ͵���
        ArrayList<String> landlord = new ArrayList<>();
        ArrayList<String> farmer01 = new ArrayList<>();
        ArrayList<String> farmer02 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if(i<51){
                //ÿ�η�һ�ţ����������������
                if(i%3==0){
                    landlord.add(poker.get(i));
                }else if(i%3==1){
                    farmer01.add(poker.get(i));
                }else{
                    farmer02.add(poker.get(i));
                }
            }else{
                //����������Ʒ������
                dipai.add(poker.get(i));
            }
        }

        //6.����
        System.out.println("��Ȩ�飺" + landlord);
        System.out.println("��   �壺" + farmer01);
        System.out.println("�����ԣ�" + farmer02);
        System.out.println("��   �ƣ�" + dipai);
    }

}
