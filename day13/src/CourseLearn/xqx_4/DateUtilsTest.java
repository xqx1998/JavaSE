package CourseLearn.xqx_4;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) throws ParseException {
        //创建Date对象
        Date d1=new Date();

        //格式化
        String s = DateUtils.dateToString(d1, "yyyy-MM-dd EE HH:mm:ss");
        System.out.println(s);


        //解析时间字符串  "2019-08-06 周二 14:13:20"
        Date d2 = DateUtils.stringToDate("2019-08-06 周二 14:13:20", "yyyy-MM-dd EE HH:mm:ss");
        System.out.println(d2);



    }

}
