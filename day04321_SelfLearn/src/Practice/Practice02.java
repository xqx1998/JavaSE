package Practice;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 15:10
 * description:�ڶ���:
 * 	����1��200֮�䣨����1��200�����������֣�ͳ���ܱ�7������ż���ĸ�������󽫸��������ֶ���ӡ�ڿ���̨
 */
public class Practice02 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("1~200�ܱ�7������ż��:");
        for (int i = 1; i <= 200; i++) {
            if (i%7==0 && i%2==0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("һ���У�"+count+"��");
    }
}
