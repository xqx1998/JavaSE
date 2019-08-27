package homework.homework_7;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 21:00
 * description:
 * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
 * 提示：两个明确
 * <p>
 * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
 */
public class Test {
    public static void main(String[] args) {
        Generic generic = new Generic<>();
        String[] strs = {"hello", "world", "Java", "web", "dev"};
        System.out.println("原数组：");
        for (String str : strs) {
            System.out.print(str + "  ");
        }
        //测试指定位置交换元素
        strs = (String[]) generic.change(strs, 0, 4);
        //遍历数组
        System.out.println();
        System.out.println("指定位置交换元素后：");
        for (String str : strs) {
            System.out.print(str + "  ");
        }
        System.out.println();


        //测试反转 字符串数组
        strs = (String[]) generic.reserves(strs);
        System.out.println("指定位置交换元素并反转数组后：");
        for (String str : strs) {
            System.out.print(str + "  ");
        }

        System.out.println();
        //测试反转 整型数组
        Integer[] ints = new Integer[]{1,2,3,4,5,6};
        System.out.println("原数组：");
        for (Integer integer : ints) {
            System.out.print(integer+"  ");
        }
        System.out.println();
        ints = (Integer[]) generic.reserves(ints);
        System.out.println("反转数组后：");
        for (Integer i : ints) {
            System.out.print(i + "  ");
        }
    }
}
/**
 原数组：
 hello  world  Java  web  dev
 指定位置交换元素后：
 dev  world  Java  web  hello
 指定位置交换元素并反转数组后：
 hello  web  Java  world  dev
 原数组：
 1  2  3  4  5  6
 反转数组后：
 6  5  4  3  2  1
 */