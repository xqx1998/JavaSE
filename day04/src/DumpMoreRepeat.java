/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/21 10:28
 * description: 一次性跳出多重循环
 */
public class DumpMoreRepeat {
    public static void main(String[] args) {
        method1();
        System.out.println("----------------");
        method2();
    }

    //方法一：  利用标签
    public static void method1() {
        //创建标签
        OK:
        for (int i = 0; i < 10; i++) {
            System.out.println("i="+i+"---------");
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.println("i=" + i + ",j=" + j + ",k=" + k);
                    if (k == 3) {
                        //跳到循环外的标签OK处，即终止整个循环
                        break OK;
                    }
                }
            }
        }
    }

    //方法二：  增加循环条件判断
    public static void method2() {
        boolean temp = false;
        for (int i = 0; i < 10 && !temp; i++) { //增加temp条件判断
            System.out.println("i="+i+"---------");
            for (int j = 0; j <= i && !temp; j++) { //增加temp条件判断
                for (int k = 0; k <= j; k++) {
                    System.out.println("i=" + i + ",j=" + j + ",k=" + k);
                    if (k==3) {
                        //找到7，使外层循环判断条件变为false则终止整个循环
                        temp = true;
                        //跳出当前for循环，外层还有一个循环用temp判定是否继续循环
                        break;
                    }
                }
            }
        }
    }
}
