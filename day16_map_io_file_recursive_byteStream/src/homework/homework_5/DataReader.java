package homework.homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/8/12 9:24
 * description:
 */
public class DataReader {
    public static void main(String[] args) throws IOException {
        ArrayList<WorldBar> worldBars = getData("day16\\src\\homework\\homework_5\\data.txt");
        worldBars.forEach(data -> System.out.println(data));

    }
    /**
     * ��ȡ����
     * @param path �����ļ�·��
     * @return
     * @throws IOException
     */
    public static ArrayList<WorldBar> getData(String path)throws IOException {
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
        bufferedReader.close();
        return worldBars;
    }
}
