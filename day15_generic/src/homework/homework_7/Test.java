package homework.homework_7;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 21:00
 * description:
 * ��дһ�����ͷ�����ʵ������������������ָ��λ��Ԫ�ؽ�����
 * ��ʾ��������ȷ
 * <p>
 * ��дһ�����ͷ���������һ�������������͵����飬����ת�����е�����Ԫ��
 */
public class Test {
    public static void main(String[] args) {
        Generic generic = new Generic<>();
        String[] strs = {"hello", "world", "Java", "web", "dev"};
        System.out.println("ԭ���飺");
        for (String str : strs) {
            System.out.print(str + "  ");
        }
        //����ָ��λ�ý���Ԫ��
        strs = (String[]) generic.change(strs, 0, 4);
        //��������
        System.out.println();
        System.out.println("ָ��λ�ý���Ԫ�غ�");
        for (String str : strs) {
            System.out.print(str + "  ");
        }
        System.out.println();


        //���Է�ת �ַ�������
        strs = (String[]) generic.reserves(strs);
        System.out.println("ָ��λ�ý���Ԫ�ز���ת�����");
        for (String str : strs) {
            System.out.print(str + "  ");
        }

        System.out.println();
        //���Է�ת ��������
        Integer[] ints = new Integer[]{1,2,3,4,5,6};
        System.out.println("ԭ���飺");
        for (Integer integer : ints) {
            System.out.print(integer+"  ");
        }
        System.out.println();
        ints = (Integer[]) generic.reserves(ints);
        System.out.println("��ת�����");
        for (Integer i : ints) {
            System.out.print(i + "  ");
        }
    }
}
/**
 ԭ���飺
 hello  world  Java  web  dev
 ָ��λ�ý���Ԫ�غ�
 dev  world  Java  web  hello
 ָ��λ�ý���Ԫ�ز���ת�����
 hello  web  Java  world  dev
 ԭ���飺
 1  2  3  4  5  6
 ��ת�����
 6  5  4  3  2  1
 */