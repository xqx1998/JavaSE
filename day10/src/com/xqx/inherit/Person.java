package com.xqx.inherit;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 10:58
 * description: ����
 */
public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Ĭ�ϳ�Ա�����������ֱ�ӵ��ã������δʷ�Χ����С�ڱ���Ա������Χ
    void speak(){
        System.out.println("�ҽ�"+getName());
        eat();
    }
    //˽�г�Ա�����������޷�����,ֻ���ڱ�����ʹ��
    private void eat(){
        System.out.println("�ҽ�"+getName()+"  �Һ��ܳ�");
    }


}
