package com.xqx.A01_api.object;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/3 9:49
 * description:
 */
/*
    Object �����νṹ�ĸ���ÿ���඼���Խ� Object ��Ϊ���ࡣ�����඼ֱ�ӻ��߼�ӵļ̳��Ը���

    ������Դ�룺ѡ�з���������Ctrl+B

    ��������������д�˷�����toString()

    ��ô��д�أ��Զ����ɼ���
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        // s.setName("��Ȩ��");
        s.setAge(18);
        System.out.println(s); //com.itheima_01.Student@3f3afe78
        System.out.println(s.toString()); //com.itheima_01.Student@3f3afe78

        /*
        public void println(Object x) { //x = s;
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) { //obj = x;
            return (obj == null) ? "null" : obj.toString();
        }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
         */

       Student s1 = new Student();

        s1.setAge(18);
        System.out.println(s.equals(s1));

    }
}
