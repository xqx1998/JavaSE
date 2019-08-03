package com.xqx_6;

public class UserTest {
    public static void main(String[] args) {
        //创建对象
        User user=new User();
        //调用set方法赋值
        user.setName("迪丽热巴");
        user.setAge(20);
        //调用get方法打印成员变量
//        System.out.println(user.getName()+","+user.getAge());
        System.out.println(user);


        //创建对象
        User u=new User("古力娜扎",20);
        //打印结果
//        System.out.println(u.getName()+","+u.getAge());
        System.out.println(u);
    }
}
