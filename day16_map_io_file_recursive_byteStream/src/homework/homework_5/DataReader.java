package homework.homework_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/12 9:24
 * description:
 */
public class DataReader {
    public static void main(String[] args) throws IOException {
        ArrayList<WorldBar> worldBars = getData("day16\\src\\homework\\homework_5\\data.txt");
        worldBars.forEach(data -> System.out.println(data));

    }
    /**
     * 读取数据
     * @param path 数据文件路径
     * @return
     * @throws IOException
     */
    public static ArrayList<WorldBar> getData(String path)throws IOException {
        //提升，这里可用字符流来读取数据 "day16\\src\\homework\\homework_5\\data.txt"是数据文件的相对路径
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        //创建list集合存储数据
        ArrayList<WorldBar> worldBars = new ArrayList<>();
        //循环读取数据文件中每一行数据
        while (bufferedReader.ready()){
            // System.out.println(bufferedReader.readLine());
            //创建字符串变量保存读取的本行数据
            String s = bufferedReader.readLine();
            //字符串以"="分割为数组
            String[] split = s.split("=");
            //将数组的每一个元素一一对应到世界杯类对象中
            worldBars.add(new WorldBar(split[0],split[1],split[2],split[3]));
        }
        bufferedReader.close();
        return worldBars;
    }
}
