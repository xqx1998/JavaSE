package com.xqx.inherit;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/2 10:58
 * description:
 */
public class Student extends Person{
    private int score;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, int score){
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    void learn(){
        System.out.println(getName()+"   "+getAge());
        System.out.println("Ŭ��ѧϰ����������");
    }

    void learnScore(){
        System.out.println(getName()+"   "+getAge()+" �ɼ���"+getScore());
        System.out.println("Ŭ��ѧϰ���ɼ��ú�");
    }
}
