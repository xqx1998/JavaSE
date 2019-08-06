package Lambda���ʽ.Demo02;

import java.util.*;

import static java.lang.Integer.toUnsignedString;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 10:38
 * description:����ʽ�ӿ�
 * �� ��ľ�̬��������
 */
public class Demo01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000, 2000, 3000);
        System.out.println("list = " + list);
        //����listIterator����
        ListIterator<Integer> integerListIterator = list.listIterator();
        //����ת����Ľ������
        List<String> hexList = new LinkedList<>();
        //ѭ��ת��list�е�ÿһ��Ԫ�ز���ӵ����������
        while (integerListIterator.hasNext()){
            //���
            hexList.add(toHexString(integerListIterator.next()));
        }
        System.out.println("hexList = " + hexList);

        /**
         * Դ����Ԫ��ת��Ϊ16���Ʋ���ֵ���¼�����
         * ����Lambdaԭʼд���������Lambda���ʽ�ᱻ����Ϊ Function �ӿڣ�
         * �ӿ���ͨ��Integer.toHexString(i) ��ԭ�����ϵ�Ԫ�ؽ���ת����
         */
        List<String> hexList1 = CollectionUtil.convert(list, i -> Integer.toHexString(i));
        System.out.println("hexList1 = " + hexList1);

        /**
         * �����Lambda���ʽ������У�ֻ�ж� Integer.toHexString() ���������ã�
         * û���������룬������ǿ���ֱ�Ӱѷ�����Ϊ�������ݣ��ɱ����������Ǵ���
         * ����Ǿ�̬��������
         */
        List<String> hexList2 = CollectionUtil.convert(list, Integer::toHexString);
        System.out.println("hexList2 = " + hexList2);

    }

    /**
     * ����������е�Ԫ��תΪʮ�����Ʊ��棬����Integer.toHexString() ����
     * @param i Ҫת����ֵ
     * @return
     */
    public static  String toHexString(int i){
        return toUnsignedString(i ,16);
    }
}
