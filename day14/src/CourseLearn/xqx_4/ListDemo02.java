package CourseLearn.xqx_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
使用迭代器遍历集合的思路：
    1、通过集合的iterator方法获取迭代器对象。
    2、循环判断是否有下一个元素。hasNext方法
    3、如果有下一个元素，那么就获取下一个元素。next方法
 */
public class ListDemo02 {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> list=new ArrayList<>();

        //添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //使用迭代器遍历集合
        //1、通过集合的iterator方法获取迭代器对象。
        Iterator<String> it = list.iterator();
        //2、循环判断是否有下一个元素。hasNext方法
        while(it.hasNext()){
            //3、如果有下一个元素，那么就获取下一个元素。next方法
            String s = it.next();
            //System.out.println(s);
            /*if(s.equals("world")){//ConcurrentModificationException
                list.add("javaEE");
            }*/
            if(s.equals("hello")){
                //list.remove("hello");
                list.set(0,"hi");
            }

        }
        System.out.println(list);
    }
}
