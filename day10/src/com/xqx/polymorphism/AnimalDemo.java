package com.xqx.polymorphism;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 14:38
 * description: ������ĺô���׶�
 * �ô������෽������չ
 * �׶ˣ��������еķ�������ֱ�ӵ���
 */
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal cat = new Cat();
        ao.eat(cat);

        Dog dog = new Dog();
        ao.eat(dog);

        //����ת�� ������󸳸���������
        Animal pig = new Pig();
        ao.eat(pig);

        pig.eat();
        //����ת�� �������ø�����������
        Pig p = (Pig) pig;
        p.play();

        //Exception in thread "main" java.lang.ClassCastException
        //����ǿתΪè
        Cat c = (Cat) pig;
        c.eat();
    }
}
