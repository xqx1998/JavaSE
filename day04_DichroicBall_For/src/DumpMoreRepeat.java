/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/21 10:28
 * description: һ������������ѭ��
 */
public class DumpMoreRepeat {
    public static void main(String[] args) {
        method1();
        System.out.println("----------------");
        method2();
    }

    //����һ��  ���ñ�ǩ
    public static void method1() {
        //������ǩ
        OK:
        for (int i = 0; i < 10; i++) {
            System.out.println("i="+i+"---------");
            for (int j = 0; j <= i; j++) {
                for (int k = 0; k <= j; k++) {
                    System.out.println("i=" + i + ",j=" + j + ",k=" + k);
                    if (k == 3) {
                        //����ѭ����ı�ǩOK��������ֹ����ѭ��
                        break OK;
                    }
                }
            }
        }
    }

    //��������  ����ѭ�������ж�
    public static void method2() {
        boolean temp = false;
        for (int i = 0; i < 10 && !temp; i++) { //����temp�����ж�
            System.out.println("i="+i+"---------");
            for (int j = 0; j <= i && !temp; j++) { //����temp�����ж�
                for (int k = 0; k <= j; k++) {
                    System.out.println("i=" + i + ",j=" + j + ",k=" + k);
                    if (k==3) {
                        //�ҵ�7��ʹ���ѭ���ж�������Ϊfalse����ֹ����ѭ��
                        temp = true;
                        //������ǰforѭ������㻹��һ��ѭ����temp�ж��Ƿ����ѭ��
                        break;
                    }
                }
            }
        }
    }
}
