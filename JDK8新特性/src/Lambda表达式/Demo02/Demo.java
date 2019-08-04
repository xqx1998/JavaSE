package Lambda���ʽ.Demo02;

import java.util.*;

import static java.lang.Integer.toUnsignedString;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 10:38
 * description:����ʽ�ӿ�
 */
public class Demo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1000, 200, 3000);
        ListIterator<Integer> integerListIterator = list.listIterator();
        List<String> hexList = new LinkedList<>();
        while (integerListIterator.hasNext()){
            hexList.add(toHexString(integerListIterator.next()));
        }
        System.out.println(hexList);
    }
    // ����������е�Ԫ��תΪʮ�����Ʊ��棬����Integer.toHexString() ����
    public static  String toHexString(int i){
        return toUnsignedString(i ,4);
    }
}
