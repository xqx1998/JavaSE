package CourseLearn.xqx_2_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
常用方法：
    boolean add(E e):添加元素,返回值表示是否添加成功，使用ArrayList集合返回的是固定值true。
    boolean remove(Object o):从集合中移除指定的元素，返回值表示是否移除成功
    void clear():清空集合中的元素
    boolean contains(Object o):判断集合中是否存在指定的元素，true表示包含
    boolean isEmpty():判断集合是否为空，true表示为空
    int size():集合的长度，也就是集合中元素的个数
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> coll=new ArrayList<>();//只能调用Collection中定义的方法

        List<String> list=new ArrayList<>();//可以调用List和Collection中定义的方法
        ArrayList<String> arrayList=new ArrayList<>();//可以调用ArrayList list Collection中定义的方法



        //添加元素
        coll.add("java");
        System.out.println(coll);


    }
}
