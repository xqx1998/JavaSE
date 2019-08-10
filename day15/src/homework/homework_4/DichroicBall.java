package homework.homework_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 19:49
 * description:四、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
 */
public class DichroicBall {
    //定义红球集合
    private HashSet<Integer> hashSet = new HashSet<Integer>();
    private ArrayList<Integer> nums = new ArrayList<Integer>();
    private Random random = new Random();
    //获取红球
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
