package Test02;

import java.util.ArrayList;

/**
 *���������Test,�������Ҫ��
 * �ٶ��巽����public static ArrayList<User> getUser(ArrayList<User> users)�����������ڵ���18�꣬
 * �����Ա�Ϊ ���С���User�������µļ��ϲ����ء�
 * ?? ����main������������¹��ܣ�����5��User���󲢸�ֵ������ArrayList<User>�����У�
 * ����getUser()�������������ص��¼���,����¼���������Ԫ����Ϣ��
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("�Ƿ�", 20, "��");
        User user2 = new User("����", 18, "��");
        User user3 = new User("����", 19, "��");
        User user4 = new User("������", 18, "Ů");
        User user5 = new User("����ˮ", 23, "Ů");
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
            if (users.get(i).getAge()>=18 && users.get(i).getSex().equals("��")){
                newUsers.add(users.get(i));
            }
        }
        return newUsers;
    }
}
