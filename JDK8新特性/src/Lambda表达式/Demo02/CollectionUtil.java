package Lambda���ʽ.Demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/4 10:43
 * description:
 */
public class CollectionUtil {
    /**
     * ����function��list�����е�ÿһ��Ԫ��ת�����γ��µļ��Ϸ���
     * @param list Ҫת����Դ����
     * @param function ת��Ԫ�صķ�ʽ
     * @param <T> Դ���ϵ�Ԫ������
     * @param <R> ת�����Ԫ������
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
