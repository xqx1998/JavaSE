package com.xqx.inherit;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/2 10:58
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
        System.out.println("努力学习，天天向上");
    }

    void learnScore(){
        System.out.println(getName()+"   "+getAge()+" 成绩："+getScore());
        System.out.println("努力学习，成绩好好");
    }
}
