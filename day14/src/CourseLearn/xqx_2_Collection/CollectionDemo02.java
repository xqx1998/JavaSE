package CourseLearn.xqx_2_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
使用迭代器遍历集合的思路：
    1、通过集合的iterator方法获取迭代器对象。
    2、循环判断是否有下一个元素。hasNext方法
    3、如果有下一个元素，那么就获取下一个元素。next方法
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<String> coll=new ArrayList<>();

        //添加元素
        coll.add("hello");
        coll.add("world");
        coll.add("java");

        //使用迭代器遍历集合
        //1、通过集合的iterator方法获取迭代器对象。
        Iterator<String> it = coll.iterator();
        //2、循环判断是否有下一个元素。hasNext方法
        while(it.hasNext()){
            //3、如果有下一个元素，那么就获取下一个元素。next方法
            String s = it.next();
            System.out.println(s);
        }
    }
}
