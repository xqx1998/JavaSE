package Lambda���ʽ.Demo02;

import java.util.*;

import static java.lang.Integer.toUnsignedString;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 10:38
 * description:����ʽ�ӿ�
 * �� ��ľ�̬��������
 * �� ��ķǾ�̬��������
 */
public class Demo02 {
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
         * 1��ľ�̬��������
         * Դ����Ԫ��ת��Ϊ16���Ʋ���ֵ���¼�����
         * ����Lambdaԭʼд���������Lambda���ʽ�ᱻ����Ϊ Function �ӿڣ�
         * �ӿ���ͨ��Integer.toHexString(i) ��ԭ�����ϵ�Ԫ�ؽ���ת����
         */
        List<String> hexList1 = CollectionUtil.convert(list, i -> Integer.toHexString(i));
        System.out.println("hexList1 = " + hexList1);

        /**
         * 1��ľ�̬��������
         * �����Lambda���ʽ������У�ֻ�ж� Integer.toHexString() ���������ã�
         * û���������룬������ǿ���ֱ�Ӱѷ�����Ϊ�������ݣ��ɱ����������Ǵ���
         * ����Ǿ�̬��������
         */
        List<String> hexList2 = CollectionUtil.convert(list, Integer::toHexString);
        System.out.println("hexList2 = " + hexList2);

        /**
         * �� ��ķǾ�̬��������
         * �Ѹո����ɵ� String ���� hexList �е�Ԫ�ض���ɴ�д����Ҫ������String���toUpperCase()����
         */
        List<String> upperList = CollectionUtil.convert(hexList2, i -> i.toUpperCase());
        System.out.println("upperList = " + upperList);

        /**
         * �� ��ķǾ�̬��������
         * ��Ϊ������ֻ�ж� toUpperCase() �ĵ��ã����Կ��԰ѷ�����Ϊ�������ô��ݣ���Ȼ���Լ�д
         */
        List<String> upperList1 = CollectionUtil.convert(hexList2, String::toUpperCase);
        System.out.println("upperList1 = " + upperList1);

        /**
         * �� ָ��ʵ���ķǾ�̬��������
         * ����һ�������������ģ������ȶ���һ������ Integer num = 2000 ��
         * Ȼ����������ֺͼ����е�ÿ�����ֽ��бȽϣ��ȽϵĽ������һ���µļ��ϡ�
         * �Ƚ϶������ǿ����� Integer �� compareTo ����:
         */
        Integer num = 2000;
        List<Integer> compareList = CollectionUtil.convert(list, integer -> num.compareTo(integer));
        // compareList.forEach(i -> System.out.println("i = " + i));
        System.out.println("compareList = " + compareList);

        /**
         * ��ǰ�����ƣ�����Lambda�Ĵ�����У���Ȼֻ�ж� num.compareTo(i) �ĵ��ã�
         * ���Կ��Լ�д�����ǣ���Ҫע����ǣ���η����ĵ����߲��Ǽ��ϵ�Ԫ�أ�
         * ����һ���ⲿ�ľֲ����� num ����˲���ʹ��Integer::compareTo ��
         * ��Ϊ�������޷�ȷ�������ĵ����ߡ�Ҫָ�������ߣ���Ҫ��  ����::������ �ķ�ʽ��
         */
        List<Integer> compareList1 = CollectionUtil.convert(list, num::compareTo);
        compareList1.forEach(i -> System.out.println(i));
        System.out.println("compareList1 = " + compareList1);

        /**
         * �� ���캯������
         * ���һ���������Ѽ����е�������Ϊ����ֵ�������� Date ���󲢷��뼯�ϣ��������Ǿ���Ҫ�õ�Date�Ĺ��캯��
         * ���Խ��ռ����е�ÿ��Ԫ�أ�Ȼ���Ԫ����Ϊ Date �Ĺ��캯��������
         */
        List<Date> dateList = CollectionUtil.convert(list, i -> new Date());
        System.out.println("dateList = " + dateList);



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
