package com.xqx.A03_TreeSet.Test2;

/**
 * createAuthor£ºxingquanxiang
 * createTime£º2019/8/4 21:05
 * description:
 */
public class Student /*implements Comparable<Student>*/ {
    private String name;
    private float chineseScore;
    private float mathScore;

    public Student() {
    }

    public Student(String name, float chineseScore, float mathScore) {
        this.name = name;
        this.chineseScore = chineseScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(float chineseScore) {
        this.chineseScore = chineseScore;
    }

    public float getMathScore() {
        return mathScore;
    }

    public void setMathScore(float mathScore) {
        this.mathScore = mathScore;
    }

    public float getTotalScore() {
        return  this.chineseScore + this.mathScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chineseScore=" + chineseScore +
                ", mathScore=" + mathScore +
                ", totalScore=" + getTotalScore() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Float.compare(student.chineseScore, chineseScore) != 0) return false;
        if (Float.compare(student.mathScore, mathScore) != 0) return false;
        return name != null ? name.equals(student.name) : student.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (chineseScore != +0.0f ? Float.floatToIntBits(chineseScore) : 0);
        result = 31 * result + (mathScore != +0.0f ? Float.floatToIntBits(mathScore) : 0);
        return result;
    }


   /* @Override
    public int compareTo(Student o) {
        int num = (int) (o.totalScore*10-this.totalScore*10)*10;
        int num2 = num==0 ? (int)(o.chineseScore-this.chineseScore)*10 : num;
        int num3 = num2==0 ? (int)(o.mathScore-this.mathScore)*10 : num2;
        return num;
    }*/
}

