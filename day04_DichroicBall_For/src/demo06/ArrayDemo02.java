package demo06;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化一个数组
        //int[] arr=new int[]{100,200,300,400,500};
        int[] arr={100,200,300,400,500};

        //取索引为3的值
        System.out.println(arr[3]); //400

        //打印数组的长度
//        int length=arr.length;
        int length = arr.length;  //.var自动生成左边的变量
//        System.out.println("length="+length);
        System.out.println("length = " + length);  //soutv自动打印变量的名称和值
    }
}
