package demo06;
/*
   常见的小问题：
        1.数组索引越界异常：
           ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        2.空指针异常：.前面的对象是null就会出现空指针异常
            Exception in thread "main" java.lang.NullPointerException
 */
public class ArrayDemo03 {
    public static void main(String[] args) {
        //静态初始化一个数组
        //int[] arr=new int[]{100,200,300,400,500};
        int[] arr={100,200,300,400,500};

        //取索引为4的值
       // System.out.println(arr[4]); //500
        //System.out.println(arr[5]);//索引越界异常
        arr=null;

        //打印数组的长度
//        int length=arr.length;
        int length = arr.length;  //.var自动生成左边的变量
//        System.out.println("length="+length);
        System.out.println("length = " + length);  //soutv自动打印变量的名称和值
    }
}
