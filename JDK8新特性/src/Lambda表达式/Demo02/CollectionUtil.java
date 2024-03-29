package Lambda表达式.Demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/4 10:43
 * description:
 */
public class CollectionUtil {
    /**
     * 利用function将list集合中的每一个元素转换后形成新的集合返回
     * @param list 要转换的源集合
     * @param function 转换元素的方式
     * @param <T> 源集合的元素类型
     * @param <R> 转换后的元素类型
     * @return
     */
    public static <T,R> List<R> convert(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        list.forEach(t -> result.add(function.apply(t)));
        return result;
    }

/*    public static <T,R> R convertOne(T t, Function<T,R> function){
        R result = null;
        return () -> result = {function.apply(t);};
    }*/
}
