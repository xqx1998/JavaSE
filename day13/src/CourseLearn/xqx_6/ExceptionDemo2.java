package CourseLearn.xqx_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        System.out.println("开始");

        parseDate();

        System.out.println("结束");
    }

    private static void parseDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = sdf.parse("2019-08-06 12:12:12");
            System.out.println(d);
        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println("出现异常了");
        } finally {
            System.out.println("这是finally代码块");
        }
    }
}
