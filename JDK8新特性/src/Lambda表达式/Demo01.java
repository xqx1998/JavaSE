package Lambda���ʽ;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 10:12
 * description:�������﷨
 * <p>
 * (�����б�) -> {�����}
 */
public class Demo01 {
    public static void main(String[] args) {
        //����һ������
        List<Integer> list = Arrays.asList(10, 5, 25, -15, 20);
        //ʾ��1���������
        // ʹ�������ļ���API��sort(Comparator c) ����������һ���Ƚ�����������Lambda������Comparator �������ڲ��ࣺ
        list.sort((i1, i2) -> {
            return i1 - i2;
        });
        System.out.println(list);

        // ʾ��2����������
        // ���������е�Ԫ�� jdk1.8�����������һ��������foreach() ������һ����Ԫ�ؽ��в����ĺ���
        //void accept(T t);
        list.forEach(i -> System.out.println(i));

        // ʵ��3����Lambda��ֵ������
        // Lambda���ʽ��ʵ����ʵ���������ڲ��࣬���Կ��԰�Lambda���ʽ��ֵ��ĳ������
        Runnable task = () -> {
            System.out.println("hello lambda");
        };
        new Thread(task).start();

        /**
         * ʾ��4����ʽfinal
         * Lambda���ʽ��ʵ����ʵ���������ڲ��࣬�������ڲ����ڷ����ⲿ�ֲ�����ʱ��Ҫ�������������Ϊ final ��
         * ����������ʹ��Lambda���ʽʱ�������� final ��
         * �Ⲣ����˵Υ���������ڲ���Ĺ�����ΪLambda�ײ����ʽ�İѱ�������Ϊ final ��
         * �ں����Ĳ����У�һ�������޸ĸñ�����
         */
        // ��ȷʾ��
        int num = -1;
        Runnable r = () -> {
            // ��lambda���ʽ��ʹ�þֲ�����num��num�ᱻ��ʽ����Ϊfinal
            System.out.println("num = " + num);
        };
        new Thread(r).start();//-1

        // ����ʾ��
       /* int num1 = -1;
        Runnable r1 = () -> {
            // ��lambda���ʽ��ʹ�þֲ�����num��num�ᱻ��ʽ����Ϊfinal
            System.out.println("num = " + num1++);
        };
        new Thread(r1).start();//-1*/

       
    }

}
