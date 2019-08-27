package com.xqx.Generic.Demo5_genericTypeWildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 16:40
 * description:
 */
public class GenericDemo {
    public static void main(String[] args) {
        // ����ͨ���
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        //����ͨ������ޣ� <? extends ����>
        List<? extends Number> list4 = new ArrayList<Integer>();
        List<? extends Number> list5 = new ArrayList<Number>();
        // List<? extends Number> list6 = new ArrayList<Object>(); //ObjectΪNumber��ĳ���

        //����ͨ������ޣ� <? super ����>
        // List<? super Number> list7 = new ArrayList<Integer>(); //IntegerΪNumber���������
        List<? super Number> list8 = new ArrayList<Number>();
        List<? super Number> list9 = new ArrayList<Object>();
    }
}
