package com.xqx.A01_api.object;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/3 9:49
 * description:
 */
/*
    Object 是类层次结构的根，每个类都可以将 Object 作为超类。所有类都直接或者间接的继承自该类

    看方法源码：选中方法，按下Ctrl+B

    建议所有子类重写此方法：toString()

    怎么重写呢？自动生成即可
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        // s.setName("倖权祥");
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
