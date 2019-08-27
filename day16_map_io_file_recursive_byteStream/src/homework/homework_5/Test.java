package homework.homework_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 21:06
 * description:练习五：Map集合的使用（四）
 * 五、利用Map，完成下面的功能：
 * 从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队（见后面的附件）。
 * 如果该?年没有举办世界杯，则输出：没有举办世界杯。
 * //tips:参阅Map接口containsKey(Object key)方法?
 */
public class Test {
    public static void main(String[] args) throws IOException {
        ArrayList<WorldBar> worldBars = getData("day16\\src\\homework\\homework_5\\data.txt");
        System.out.println("请输入一个年份：");
        String next = new Scanner(System.in).next();
        if (next.charAt(next.length()-1)!='年')
            next = next + "年";
        boolean flag = false;
        for (WorldBar worldBar : worldBars) {
            if (next.equals(worldBar.getYear())) {
                System.out.println("冠军：" + worldBar.getChampion());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("没有举办世界杯");
        }

    }

    /**
     * 读取数据
     * @param path 数据文件路径
     * @return
     * @throws IOException
     */
    public static ArrayList<WorldBar> getData(String path)throws IOException{
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
        return worldBars;
    }
}
