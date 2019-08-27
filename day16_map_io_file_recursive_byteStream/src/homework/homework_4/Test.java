package homework.homework_4;

import java.util.*;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 20:41
 * description:��ϰ�ģ�Map���ϵ�ʹ�ã�����
 * �ġ�����һ������ΪString���͵�List���ϣ�ͳ�Ƹü�����ÿ���ַ���ע�⣬�����ַ��������ֵĴ�����
 * ���磺�������С�abc������bcd������Ԫ�أ���������������Ϊ����a = 1,b = 2,c = 2,d = 1����
 */
public class Test {
    public static void main(String[] args) {
        //����list���ϴ洢�ַ���
        ArrayList<String> strs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("���������ַ������м�ֿ����س����� 0 �س�����");
        while(true){
            String str = scanner.next();
            if (str.equals("0"))
                break;
            else
                strs.add(str);
        }
        //����haspMap���ϴ洢��ֵ�� LinkedHashMap�������Ԫ��ʱ����Ȼ����
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        // �����ַ�������
        for (String str : strs) {
            //�����ַ���ÿһ���ַ�
            for (int i = 0; i < str.length(); i++) {
                //�������� ��ֵ��ȡ���ַ�
                Character key = str.charAt(i);
                //�ж� map�����йؼ����Ƿ����key
                if (map.containsKey(key)) {//�ǣ���ȡ��Ӧ��value,����value��1
                    Integer count = map.get(key);
                    map.put(key, ++count);
                }else{ //�����ڣ����һ�γ��֣�����map����value��Ϊ1
                    map.put(key, 1);
                }
            }
        }

        //����
        for (Map.Entry<Character, Integer> characterIntegerEntry : map.entrySet()) {
            System.out.print(characterIntegerEntry.getKey()+"="+characterIntegerEntry.getValue()+",");
        }
        System.out.print("\b");

    }
}
/*
ִ�н����
���������ַ������м�ֿ����س����� 0 �س�����
abc
bcd
0
a=1,b=2,c=2,d=1
 */
