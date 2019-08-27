package homework.homework_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 20:07
 * description:��ϰһ��HashMap�洢�����Զ������ֵ��String
 * һ����ʹ��Map���ϴ洢�Զ�����������Car������name��color��Ա��������������Ӧ�ļ۸���ֵ����ʹ��keySet��entrySet���ַ�ʽ����Map���ϡ�
 */
public class Test {
    public static void main(String[] args) {
        //����hashmap����
        HashMap<Car, Double> cars = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            System.out.println("�������"+(i+1)+"��С����Ʒ��");
            car.setName(scanner.next());
            System.out.println("�������"+(i+1)+"��С������ɫ");
            car.setColor(scanner.next());
            System.out.println("�������"+(i+1)+"��С���ļ۸�");
            cars.put(car, scanner.nextDouble());
        }
        //keySet����
        for (Car car : cars.keySet()) {
            System.out.println(car + "  �۸�"+ cars.get(car));
        }
        //entrySet����
        Set<Map.Entry<Car, Double>> entries = cars.entrySet();
        for (Map.Entry<Car, Double> entry : entries) {
            System.out.println(entry.getKey()+"  �۸�"+entry.getValue());
        }

    }

}

/**
 ���н����
 �������1��С����Ʒ��
 ���
 �������1��С������ɫ
 ��
 �������1��С���ļ۸�
 199999.9
 �������2��С����Ʒ��
 ����
 �������2��С������ɫ
 �����
 �������2��С���ļ۸�
 200000.0
 �������3��С����Ʒ��
 ·����ʤ
 �������3��С������ɫ
 ��
 �������3��С���ļ۸�
 1530000
 Car{name='���', color='��'}  �۸�199999.9
 Car{name='����', color='�����'}  �۸�200000.0
 Car{name='·����ʤ', color='��'}  �۸�1530000.0
 Car{name='���', color='��'}  �۸�199999.9
 Car{name='����', color='�����'}  �۸�200000.0
 Car{name='·����ʤ', color='��'}  �۸�1530000.0
 */
