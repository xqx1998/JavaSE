/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/20 11:16
 * description:
 * ��ӡ�žų˷���
 */
public class ForTest04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+"  ");
            }
            System.out.println();
        }
    }
}
