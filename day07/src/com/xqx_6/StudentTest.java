package com.xqx_6;

public class StudentTest {
    public static void main(String[] args) {

        //创建对象
        Student s=new Student("菜虚昆",20,"13355556666","123456@itcast.cn","湖北武汉");
        //访问成员变量
        System.out.println(s);//地址值
        //赋值
        /*s.setName("菜虚昆");
        s.setAge(20);
        s.setPhone("13478913456");
        s.setEmail("123456@itcast.cn");
        s.setAddress("湖北武汉");*/
        //打印
        System.out.println(s.getName());
        System.out.println(s.getAge());

    }
}
