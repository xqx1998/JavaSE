package homework.homework_5;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 20:42
 * description:
 * 五、将下列四位同学存储到集合中，并对成绩做降序排序，如果成绩一样，那在成绩排序的基础上按照年龄由小到大排序。
 * 姓名（String）	年龄（int）	分数（float）
 * liusan	            20	        90.0F
 * lisi	                22	        90.0F
 * wangwu	            20	        99.0F
 * sunliu	            22	        100.0F
 */
public class Student {
    private String name;
    private Integer age;
    private Float score;

    public Student() {
    }

    public Student(String name, Integer age, Float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


}
