package CourseLearn.xqx_1.homework;

import java.util.Calendar;

/*
练习三：Calendar类方法的使用
    用程序判断2018年2月14日是星期几。
 */
public class HomeWork3 {
    public static void main(String[] args) {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        //调用成员方法：set、get、add
        c.set(2018,1,14);
        //c.add(Calendar.DATE,3);
        //获取这一天是一个星期的第几天get
        int day = c.get(Calendar.DAY_OF_WEEK);
        //System.out.println(day);
        //定义一个数组，保存星期数
        String[] weeks={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        System.out.println(weeks[day-1]);
    }
}
