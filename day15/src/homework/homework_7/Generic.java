package homework.homework_7;
import java.util.Arrays;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 21:01
 * description:
 * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
 * 提示：两个明确
 *
 * 编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
 */
public class Generic<T> {
    /**
     * 实现任意引用类型数组指定位置元素交换
     * @param ts
     * @param index1
     * @param index2
     * @return
     */
    public T[] change(T [] ts, int index1, int index2){
        //创建临时变量
        T t = ts[index1];
        ts[index1] = ts[index2];
        ts[index2] = t;
        return ts;
    }

    /**
     * 接收一个任意引用类型的数组，并反转数组中的所有元素
     * @param ts
     * @return
     */
    public T[] reserves(T [] ts){
        //获取数组长度
        int len = ts.length;
        //复制生成一个新数组，重新开辟一个新空间
        T[] ts1 = Arrays.copyOf(ts, len);
        //反转操作
        for (int i = 0; i < len ; i++) {
            ts1[i] = ts[len-(i+1)];
        }
        return ts1;
    }
}
