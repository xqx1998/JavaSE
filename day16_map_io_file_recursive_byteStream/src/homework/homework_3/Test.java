package homework.homework_3;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 20:32
 * description:��ϰ����Map���ϵ�ʹ�ã�����
 * ��2�����飬��һ����������Ϊ��[������ʡ,�㽭ʡ,����ʡ,�㶫ʡ,����ʡ]���ڶ�������Ϊ��[������,����,�ϲ�,����,����]��
 * ����һ������Ԫ����Ϊkey���ڶ�������Ԫ����Ϊvalue�洢��Map�����С���{������ʡ=������, �㽭ʡ=����, ��}��
 */
public class Test {
    public static void main(String[] args) {
        //�������϶���  LinkedHashMap�������Ԫ��ʱ����Ȼ����
        HashMap<String, String> hashMap = new LinkedHashMap<>();
        String[] array1 = {"������ʡ", "�㽭ʡ", "����ʡ", "�㶫ʡ", "����ʡ"};
        String[] array2 = {"������","����","�ϲ�","����","����"};
        //���Ԫ��
        for (int i = 0; i < array1.length; i++) {
            hashMap.put(array1[i],array2[i]);
        }
        // ����
        for (String s : hashMap.keySet()) {
            System.out.println(s + "="+ hashMap.get(s));
        }
    }
}
/**
 ���н����
 ������ʡ=������
 �㽭ʡ=����
 ����ʡ=�ϲ�
 �㶫ʡ=����
 ����ʡ=����
 */