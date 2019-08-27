package homework.homework_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/8/11 20:07
 * description:练习一：HashMap存储键是自定义对象值是String
 * 一、请使用Map集合存储自定义数据类型Car（包含name和color成员变量）做键，对应的价格做值。并使用keySet和entrySet两种方式遍历Map集合。
 */
public class Test {
    public static void main(String[] args) {
        //创建hashmap对象
        HashMap<Car, Double> cars = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Car car = new Car();
            System.out.println("请输入第"+(i+1)+"辆小车的品牌");
            car.setName(scanner.next());
            System.out.println("请输入第"+(i+1)+"辆小车的颜色");
            car.setColor(scanner.next());
            System.out.println("请输入第"+(i+1)+"辆小车的价格");
            cars.put(car, scanner.nextDouble());
        }
        //keySet遍历
        for (Car car : cars.keySet()) {
            System.out.println(car + "  价格："+ cars.get(car));
        }
        //entrySet遍历
        Set<Map.Entry<Car, Double>> entries = cars.entrySet();
        for (Map.Entry<Car, Double> entry : entries) {
            System.out.println(entry.getKey()+"  价格："+entry.getValue());
        }

    }

}

/**
 运行结果：
 请输入第1辆小车的品牌
 别克
 请输入第1辆小车的颜色
 黑
 请输入第1辆小车的价格
 199999.9
 请输入第2辆小车的品牌
 大众
 请输入第2辆小车的颜色
 珍珠白
 请输入第2辆小车的价格
 200000.0
 请输入第3辆小车的品牌
 路虎揽胜
 请输入第3辆小车的颜色
 黑
 请输入第3辆小车的价格
 1530000
 Car{name='别克', color='黑'}  价格：199999.9
 Car{name='大众', color='珍珠白'}  价格：200000.0
 Car{name='路虎揽胜', color='黑'}  价格：1530000.0
 Car{name='别克', color='黑'}  价格：199999.9
 Car{name='大众', color='珍珠白'}  价格：200000.0
 Car{name='路虎揽胜', color='黑'}  价格：1530000.0
 */
