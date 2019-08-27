package com.xqx_6;
/*
    成员变量：
        String name;
        int age;
    成员方法：
        study()
        doHomework()
 */
public class Student {
    //定义成员变量
    private String name;
    private int age;
    private String phone;
    private String email;
    private String address;

    public Student(){
        System.out.println("空参构造方法执行");
    }

    public Student(String name,int age,String phone,String email,String address){
        System.out.println("4个参数的构造方法执行");
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }


    //给私有的成员变量提供public修饰的get和set方法用于对成员变量赋值和取值
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age<0 || age>120){
            System.err.println("你设置的年龄不合法！");
        }else{
            this.age=age;
        }
    }
    public int getAge(){
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
