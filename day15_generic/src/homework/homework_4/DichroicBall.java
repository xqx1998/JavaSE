package homework.homework_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/9 19:49
 * description:�ġ�˫ɫ�����˫ɫ��ÿעͶע������6����ɫ������1����ɫ�������ɡ�
 * ��ɫ������1��33��ѡ����ɫ������1��16��ѡ�����������һע˫ɫ����롣��Ҫ��ͬɫ���벻�ظ���
 */
public class DichroicBall {
    //������򼯺�
    private HashSet<Integer> hashSet = new HashSet<Integer>();
    private ArrayList<Integer> nums = new ArrayList<Integer>();
    private Random random = new Random();
    //��ȡ����
    public HashSet<Integer> getHashSet() {
        while (hashSet.size()<6)
            hashSet.add(random.nextInt(33)+1);
        return hashSet;
    }

    public ArrayList<Integer> getNums(){
        hashSet = getHashSet();
        for (Integer integer : hashSet) {
            nums.add(integer);
        }
        nums.add(random.nextInt(16)+1);
        return nums;
    }
}
