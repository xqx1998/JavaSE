package demo06;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //静态初始化一个数组
        //int[] arr=new int[]{100,200,300,400,500};
        int[] arr={100,200,300,400,500,600,700,1000};

        //打印数组中的所有值
       /* System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);*/

       //for循环实现遍历打印数组值
        /*for(int i=0;i<7;i++){
            System.out.println(arr[i]);
        }*/
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------------");
        //使用while循环遍历
        /*int i=0;
        while (i<arr.length){
            System.out.println(arr[i]);
            i++;
        }*/
        //骚操作，快捷键  数组名.fori + 按回车
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/

        //打印数组的长度
//        int length=arr.length;
        int length = arr.length;  //.var自动生成左边的变量
//        System.out.println("length="+length);
        System.out.println("length = " + length);  //soutv自动打印变量的名称和值
    }
}
