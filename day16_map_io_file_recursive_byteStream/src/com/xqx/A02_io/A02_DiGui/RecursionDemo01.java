package com.xqx.A02_io.A02_DiGui;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 14:18
 * description:�ݹ鰸��1
 *  �Ա�̵ĽǶ��������ݹ�ָ���Ƿ��������е��÷������������
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        //�ع˲����������⣬���20�������ӵĶ���
        //ÿ���µ����Ӷ�����1,1,2,3,5,8��...
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));
    }

    /*
        �ݹ������⣬���Ⱦ���Ҫ����һ��������
            ����һ������f(n)����ʾ��n���µ����Ӷ���
            ��ô����n-1���µ����Ӷ�������α�ʾ�أ�f(n-1)
            ͬ����n-2���µ����Ӷ�������α�ʾ�أ�f(n-2)

        StackOverflowError:����ջ�������ʱ�׳�һ��Ӧ�ó���ݹ�̫��
     */
    public static int f(int n) {
        if(n==1 || n==2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}
