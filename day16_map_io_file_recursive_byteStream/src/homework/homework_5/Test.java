package homework.homework_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/11 21:06
 * description:��ϰ�壺Map���ϵ�ʹ�ã��ģ�
 * �塢����Map���������Ĺ��ܣ�
 * �������ж���һ���ַ�������ʾһ����ݣ������������籭�ھ�����֧��ӣ�������ĸ�������
 * �����?��û�оٰ����籭���������û�оٰ����籭��
 * //tips:����Map�ӿ�containsKey(Object key)����?
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<WorldBar> worldBars = getData("day16\\src\\homework\\homework_5\\data.txt");
        System.out.println("������һ����ݣ�");
        String next = new Scanner(System.in).next();
        if (next.charAt(next.length()-1)!='��')
            next = next + "��";
        boolean flag = false;
        for (WorldBar worldBar : worldBars) {
            if (next.equals(worldBar.getYear())) {
                System.out.println("�ھ���" + worldBar.getChampion());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("û�оٰ����籭");
        }

    }

    /**
     * ��ȡ����
     * @param path �����ļ�·��
     * @return
     * @throws IOException
     */
    public static ArrayList<WorldBar> getData(String path)throws IOException{
        //��������������ַ�������ȡ���� "day16\\src\\homework\\homework_5\\data.txt"�������ļ������·��
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        //����list���ϴ洢����
        ArrayList<WorldBar> worldBars = new ArrayList<>();
        //ѭ����ȡ�����ļ���ÿһ������
        while (bufferedReader.ready()){
            // System.out.println(bufferedReader.readLine());
            //�����ַ������������ȡ�ı�������
            String s = bufferedReader.readLine();
            //�ַ�����"="�ָ�Ϊ����
            String[] split = s.split("=");
            //�������ÿһ��Ԫ��һһ��Ӧ�����籭�������
            worldBars.add(new WorldBar(split[0],split[1],split[2],split[3]));
        }
        return worldBars;
    }
}
