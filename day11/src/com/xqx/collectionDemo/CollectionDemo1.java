package com.xqx.collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/3 18:15
 * description:
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList<String>();
        collection.add("xing");
        collection.add("quan");
        collection.add("xiang");
        showBody(collection);
        collection.remove("xing");
        System.out.println("-----------------");
        showBody(collection);
        System.out.println("*******************");

        Collection collection1 = new ArrayList<Integer>();
        collection1.add(3);
        collection1.add(2);
        collection1.add(4);
        collection1.add(5);
        showBody(collection1);
        System.out.println("---------------");
        collection1.remove(4);
        showBody(collection1);
        System.out.println("*******************");

    }

    public static void showBody(Collection collection){
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
