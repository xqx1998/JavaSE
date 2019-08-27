package com.xqx.Generic.Demo5_genericTypeWildcard;

import java.util.ArrayList;
import java.util.List;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 16:40
 * description:
 */
public class GenericDemo {
    public static void main(String[] args) {
        // 类型通配符
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        //类型通配符上限： <? extends 类型>
        List<? extends Number> list4 = new ArrayList<Integer>();
        List<? extends Number> list5 = new ArrayList<Number>();
        // List<? extends Number> list6 = new ArrayList<Object>(); //Object为Number类的超类

        //类型通配符上限： <? super 类型>
        // List<? super Number> list7 = new ArrayList<Integer>(); //Integer为Number类的派生类
        List<? super Number> list8 = new ArrayList<Number>();
        List<? super Number> list9 = new ArrayList<Object>();
    }
}
