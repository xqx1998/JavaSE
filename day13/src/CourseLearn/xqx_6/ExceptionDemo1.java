package CourseLearn.xqx_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        System.out.println("开始");

        try {

            int[] arr={1,2,3};
            System.out.println(arr[2]);

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd EE HH:mm:ss");
            Date d=sdf.parse("2019-08-06 12:12:12");


        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (ParseException e2){
            System.out.println("解析错误");
        }

        System.out.println("结束");
    }
}
