package CourseLearn.xqx_3_ArrayListt;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        //创建Date对象，当前时间
        Date d1=new Date();
        System.out.println(d1);

        //将d1转换成毫秒值
        long time = d1.getTime();
        //将毫秒值加 + 24*60*60*1000
        long newTime=time+24*60*60*1000;
        //重新创建Date对象，传递计算后的毫秒值就是明天的此时此刻
        Date d2=new Date(newTime);
        System.out.println(d2);
    }
}
