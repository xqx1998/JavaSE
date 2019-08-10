package CourseLearn.xqx_1.homework_4;

/**
 * 第四题：生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
 *         打印效果如下：
 *             随机数为：
 *             86.217840985496
 *             转换为：
 *             86.21
 *         提示：将随机数结果转换成String字符串，查阅String类进行字符串截取即可   subString(int start,int end)
 */
public class HomeWork4 {

    public static void main(String[] args) {
        //1 使用math的方法生成0-100之间的随机数
        double num=Math.random()*100;
        System.out.println("随机数为：");
        System.out.println(num);
        //2 将随机数转换成字符串
        String s=num+"";
        //3 获取小数点的位置
        int index = s.indexOf(".");
        //4 字符串截取，保留两位小数
        String newS = s.substring(0, index + 3);
        System.out.println("转换为：");
        System.out.println(newS);
    }
}
