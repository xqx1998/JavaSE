package com.xqx.abstractDemo;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 15:16
 * description: ������
 * �������ʵ�ֳ����������г��󷽷�
 * �������п����о��巽��
 * ��Ա���� �����Ǳ��� Ҳ�����ǳ���
 * �й��췽�������ǲ���ʵ���� ���ã�����������ʸ������ݵĳ�ʼ��
 * ���췽����û�д�����jvmҲ������һ����������
 * ��Ա����
 *      �����г��󷽷����޶�����������ĳЩ����
 *      Ҳ�����зɳ��󷽷�����ߴ��븴����
 */
public abstract class Animal {
    private String city = "beijing";
    private final int age = 20;

    public void show(){
        city = "yunnan";
        // age = 18;
        System.out.println("city="+city+"  age="+age);
    }

    public abstract void eat();
}
