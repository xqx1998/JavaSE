package CourseLearn.xqx_2_Collection;

public class IntegerDemo {
    public static void main(String[] args) {

        //int ---> String
        int num=100;
        //在开发中
        String s1=num+"";
        System.out.println(s1);
        //方式2
        System.out.println(String.valueOf(num));


        //String ---> int
        int i = Integer.parseInt("120");
        System.out.println(i);

        //parseInt方法注意事项：转换的字符串必须是数字类型的字符串，例如一下做法就是错误：
        //java.lang.NumberFormatException: For input string: "itheima"
        /*int i1 = Integer.parseInt("itheima");
        System.out.println(i1);*/

        //扩展，字符串小数转换成double或者float
        double d = Double.parseDouble("13.14");
        System.out.println(d);

        float f = Float.parseFloat("5.20");
        System.out.println(f);
    }
}
