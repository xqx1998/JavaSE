package CourseLearn.xqx_6;
import CourseLearn.xqx_5.Person;

import java.util.Arrays;

public class SortDemo2 {
    public static void main(String[] args) {
        //定义数组
        int[] arr={24,69,80,57,13};
        //打印排序前数组元素
        System.out.println("排序前:"+ Arrays.toString(arr));
        //开始排序
        Arrays.sort(arr);
        //打印排序后数组元素
        System.out.println("排序后:"+ Arrays.toString(arr));




        //创建一个数组，存储Person对象
        Person[]  pArr={
                        new Person("古力娜扎",20),
                        new Person("马尔扎哈",18),
                        new Person("真皮沙发",25)
                        };
        //将数组中的每个对象以字符串的形式输出，内部会调用Person的toString方法
        System.out.println(Arrays.toString(pArr));
    }
}
