package com.xqx.A11_HashDemo;


/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 22:34
 * description:
 * ��ϣֵ����JDK���ݶ����ַ�����ַ������������������int���͵���ֵ
 *
 * Object������public int hashCode() ���ض���Ĺ�ϣֵ
 */
public class HashDemo {
    public static void main(String[] args) {
        // ����ѧ������
        Student student = new Student("��Ȩ��", 21);

        // ͬһ�������ε��� hashCode() �������ص�ֵ����ͬ��
        System.out.println("student.hashCode() = " + student.hashCode());
        System.out.println("student.hashCode() = " + student.hashCode());
        System.out.println("----------");

        Student student1 = new Student("zhangyaxing", 22);

        // Ĭ������£���ͬ����Ĺ�ϣֵ�ǲ�ͬ��
        // ͨ��������д�������ǲ�ͬ����Ĺ�ϣֵ��ͬ
        System.out.println("student1.hashCode() = " + student1.hashCode());

        
    }
}
