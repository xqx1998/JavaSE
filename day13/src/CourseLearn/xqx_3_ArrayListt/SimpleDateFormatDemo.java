package CourseLearn.xqx_3_ArrayListt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    SimpleDateFormat:格式化日期对象，Date对象或者解析时间字符串成Date对象。
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //创建Date对象
        Date d1=new Date();
        System.out.println(d1);

        //格式化
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd EE HH:mm:ss");
        //调用format方法
        String s = sdf.format(d1);
        System.out.println(s);


        //解析时间字符串  "2019-08-06 周二 14:13:20"
        //注意：如果字符串和SimpleDateFormat构造中的模式不一致，就会出现ParseException解析异常。
        Date d2 = sdf.parse("2019-08-06 周二 14:13:20");
        System.out.println(d2);
    }
}
