package CourseLearn.xqx_5;

public class Plant implements Function{
    private String type;

    public Plant(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void breath() {
        System.out.println(type+"吸二氧化碳");
    }
}
