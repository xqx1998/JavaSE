package CourseLearn.xqx_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils(){}

    //对外提供一个将Date转换成String的方法
    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

    //对外提供一个将String转换成Date的方法
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        Date date = sdf.parse(s);
        return date;
    }
}
