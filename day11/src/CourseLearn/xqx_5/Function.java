package CourseLearn.xqx_5;

public interface Function {
    /**
     * 呼吸的功能
     */
    public abstract void breath();

    //默认方法，了解
    default void show(){
        System.out.println("show");
    }
    //静态方法，了解
    static void method(){
        System.out.println("method");
    }
}
