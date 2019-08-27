package demo06;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //定义数组并初始化
        int[] arr=new int[3];
        //直接打印数组名称,地址值  [I@880ec60
        System.out.println(arr);
        //获取每一个索引出的值，索引：数据在数组中的位置编号。从0开始
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0
        //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
       // System.out.println(arr[3]);//0
        System.out.println("-------------------------");
        //存值
        arr[0]=100;
        arr[1]=200;
        arr[2]=300;

        int a=arr[0];
        System.out.println(a);//100
        System.out.println(arr[1]);//200
        System.out.println(arr[2]);//200  ctrl+d

    }
}
