package homework.homework_2;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 19:29
 * description:����ʹ��LinkedHashSet�洢����Ԫ�أ�"���Ѿ�","���Ѿ�","��ʩ","����","����"��
 * ʹ�õ���������ǿforѭ������LinkedHashSet��
 * LinkedHasSet�������Ҳ����Դ洢�ظ�Ԫ�أ�����
 *         �ص㣺�ײ�ṹ������+��ϣ������֤����
 */
public class Test {
    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("���Ѿ�");
        strings.add("���Ѿ�");
        strings.add("��ʩ");
        strings.add("����");
        strings.add("����");
        System.out.println("������������");
        //����������
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println();
        System.out.println("��ǿforѭ��������");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}

