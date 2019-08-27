package Test02;

import java.util.ArrayList;

/**
 *定义测试类Test,完成以下要求：
 * ①定义方法，public static ArrayList<User> getUser(ArrayList<User> users)，获得年龄大于等于18岁，
 * 并且性别为 “男”的User，加入新的集合并返回。
 * ?? ②在main方法中完成以下功能：创建5个User对象并赋值，加入ArrayList<User>集合中，
 * 调用getUser()方法，遍历返回的新集合,输出新集合中所有元素信息，
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("乔峰", 20, "男");
        User user2 = new User("段誉", 18, "男");
        User user3 = new User("虚竹", 19, "男");
        User user4 = new User("王语嫣", 18, "女");
        User user5 = new User("李秋水", 23, "女");
        ArrayList<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        ArrayList<User> newUsers = getUser(users);
        for (int i = 0; i < newUsers.size(); i++) {
            System.out.println(newUsers.get(i));
        }
    }

    public static ArrayList<User> getUser(ArrayList<User> users){
        ArrayList<User> newUsers = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge()>=18 && users.get(i).getSex().equals("男")){
                newUsers.add(users.get(i));
            }
        }
        return newUsers;
    }
}
