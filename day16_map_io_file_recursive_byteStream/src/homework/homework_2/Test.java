package homework.homework_2;

import java.util.HashMap;
import java.util.Map;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 20:24
 * description:
 * ��ϰ����Map���ϵ�ʹ�ã�һ��
 * ����������һ��map�������£�
 * Map<Integer,String> map =?new?HashMap<Integer, String>();
 * ????????map.put(1,?"������");
 * ??????? map.put(2,?"������");
 * ??????? map.put(3,?"����");
 * ??????? map.put(4,?"���ʦ̫");
 * Ҫ��
 * 1.�������ϣ�����������Ӧ������ӡ��
 * 2.���map�����в���һ������Ϊ5����Ϊ���������Ϣ
 * 	3.�Ƴ���map�еı��Ϊ1����Ϣ
 * 	4.��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "������");
        map.put(2, "������");
        map.put(3, "����");
        map.put(4, "���ʦ̫");
        // 1.�������ϣ�����������Ӧ������ӡ��
        System.out.println("keySet()��ȡ���йؼ��ֱ�����");
        for (Integer num : map.keySet()) {
            System.out.println(num+","+map.get(num));
        }
        System.out.println("----------");
        System.out.println("entrySet()������");
        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry.getKey()+", "+integerStringEntry.getValue());
        }
        // 2.���map�����в���һ������Ϊ5����Ϊ���������Ϣ
        map.put(5, "������");
        // 3.�Ƴ���map�еı��Ϊ1����Ϣ
        map.remove(1);
        // 4.��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"
        map.put(2, "����");
        System.out.println("map���º�");
        for (Integer num : map.keySet()) {
            System.out.println(num+","+map.get(num));
        }
    }
}
/**
 ���н����
 keySet()��ȡ���йؼ��ֱ�����
 1,������
 2,������
 3,����
 4,���ʦ̫
 ----------
 entrySet()������
 1, ������
 2, ������
 3, ����
 4, ���ʦ̫
 map���º�
 2,����
 3,����
 4,���ʦ̫
 5,������

 */