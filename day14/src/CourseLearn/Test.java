package CourseLearn;

import java.util.ArrayList;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/9 9:30
 * description:
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(13);
        nums.add(33);
        nums.add(20);
        nums.add(28);
        nums.add(17);
        nums.add(521);
        nums.add(520);
        nums.forEach(num -> System.out.print(num+"  "));
        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i)%2==0){
                nums.remove(i);
                // continue; 此处不能跳过，依旧会i++
                i--;
            }
        }
        nums.forEach(num -> System.out.print(num+"  "));
        System.out.println();
    }
}
