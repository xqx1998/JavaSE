package com.xqx.inherit;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 10:58
 * description:��ʦ�࣬�̳�������
 */
public class Teacher extends Person{
    public Teacher() {
        //���ø���ղι���
        super();
    }

    public Teacher(String name, int age) {
        //���ø����вι���
        super(name, age);
    }
    //�����Ա����
    void teach(){
        System.out.println(getName() + "  "+ getAge());
        System.out.println("���Ľ���ÿһλݷݷѧ��");
    }

    // ��д�����Ա���� ������д�ķ������δ����÷�Χ����С�ڸ���  private--->Ĭ��--->protect--->public
    // ���಻��ֱ�ӵ��ø����Ա����
    @Override
    void speak() {
        super.speak();
        System.out.println("������Ϊÿһλѧ�ӽ��");
    }


}
