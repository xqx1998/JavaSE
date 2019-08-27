package homework.homework_7;
import java.util.Arrays;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 21:01
 * description:
 * ��дһ�����ͷ�����ʵ������������������ָ��λ��Ԫ�ؽ�����
 * ��ʾ��������ȷ
 *
 * ��дһ�����ͷ���������һ�������������͵����飬����ת�����е�����Ԫ��
 */
public class Generic<T> {
    /**
     * ʵ������������������ָ��λ��Ԫ�ؽ���
     * @param ts
     * @param index1
     * @param index2
     * @return
     */
    public T[] change(T [] ts, int index1, int index2){
        //������ʱ����
        T t = ts[index1];
        ts[index1] = ts[index2];
        ts[index2] = t;
        return ts;
    }

    /**
     * ����һ�������������͵����飬����ת�����е�����Ԫ��
     * @param ts
     * @return
     */
    public T[] reserves(T [] ts){
        //��ȡ���鳤��
        int len = ts.length;
        //��������һ�������飬���¿���һ���¿ռ�
        T[] ts1 = Arrays.copyOf(ts, len);
        //��ת����
        for (int i = 0; i < len ; i++) {
            ts1[i] = ts[len-(i+1)];
        }
        return ts1;
    }
}
