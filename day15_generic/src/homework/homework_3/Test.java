package homework.homework_3;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 19:35
 * description:����¼��һ���ַ�����ȥ�������ظ��ַ�����ӡ����ͬ����Щ�ַ���
 * ���뱣֤˳���������룺aaaabbbcccddd����ӡ���Ϊ��abcd��
 *TreeSet����
 *         �����������������ѡһ
 *             1��TreeSet�����е�Ԫ��ʵ��Comparable��Ȼ����Ľӿڣ������������
 *             2��Ԫ�ز���Ҫʵ��Comparable�ӿڣ������ڴ���TreeSet���϶����ʱ�򴫵�һ��Comparator�Ƚ�������
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String str = scanner.next();
        TreeSet<Character> characters = new TreeSet<>();
        for (int i = 0; i < str.length(); i++) {
            // System.out.println(str.charAt(i));
            //���Ԫ��
            characters.add(str.charAt(i));
        }
        for (Character character : characters) {
            System.out.print(character);
        }

    }
}
