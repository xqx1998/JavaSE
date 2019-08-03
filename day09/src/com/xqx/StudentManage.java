package com.xqx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/29 9:58
 * description:
 */
public class StudentManage {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("----------------");
            System.out.println("��ӭ����ѧ������ϵͳ");
            System.out.println("ѡ��������еĲ�����");
            System.out.println("1.���ѧ����Ϣ��");
            System.out.println("2.ɾ��ѧ����Ϣ��");
            System.out.println("3.��ѯѧ����Ϣ��");
            System.out.println("4.�޸�ѧ����Ϣ��");
            System.out.println("5.�˳���");
            System.out.println("������ָ�(�����س���)");
            String choose = scanner.next();
            switch (choose) {
                case "1":
                    add(students);
                    break;
                case "2":
                    delete(students);
                    break;
                case "3":
                    find(students);
                    break;
                case "4":
                    update(students);
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("ָ������");
            }
        }
    }

    /**
     * ����ѧ����Ϣ
     * @param students
     */
    private static void update(ArrayList<Student> students) {
        System.out.println("������Ҫ���µ�ѧ����Ϣѧ�ţ�");
        String id = scanner.next();
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())){
                System.out.println("ѡ���ѧ��Ϊ��");
                System.out.println(students.get(i).toString());
                System.out.println("��������������");
                students.get(i).setName(scanner.next());
                System.out.println("�������������䣺");
                students.get(i).setAge(scanner.nextInt());
                System.out.println("�������µ�ַ��");
                students.get(i).setAddress(scanner.next());
                System.out.println("ѧ��Ϊ"+students.get(i).getId()+"��ѧ����Ϣ�޸ĳɹ���");
                System.out.println("����ϢΪ��");
                System.out.println(students.get(i).toString());
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("δ�ҵ�ѧ��Ϊ"+id+"��ѧ����Ϣ");
    }

    /**
     * ��ѯѧ����Ϣ
     * @param students
     */
    private static void find(ArrayList<Student> students) {
        System.out.println("������ָ�1.��ѯ����ѧ����Ϣ 2.��ѧ�Ų�ѯ 3.��������ѯ 4.�������ѯ 5.����ַ��ѯ");
        String choose = scanner.next();
        switch (choose){
            case "1":
                foreach(students);
                break;
            case "2":
                System.out.println("������ѧ�ţ�");
                find(students, "2",  scanner.next());
                break;
            case "3":
                System.out.println("������������");
                find(students, "3", scanner.next());
                break;
            case "4":
                System.out.println("���������䣺");
                find(students, "4", scanner.nextInt());
                break;
            case "5":
                System.out.println("�������ַ��");
                find(students, "5", scanner.next());
                break;
            default:
                System.out.println("������������������");
        }
    }

    /**
     * �鿴����ѧ����Ϣ
     * @param students
     */
    private static void foreach(ArrayList<Student> students) {
        if (students.size()>0) {
            for (Student student : students) {
                System.out.println(student);
            }
        }else{
            System.out.println("��û��ѧ����Ϣ��");
        }
    }

    /**
     * �� ѧ�� �� ���� �� ��ַ����
     * @param students
     * @param choice
     * @param next
     */
    private static void find(ArrayList<Student> students, String choice,  String next) {
        int count = 0;
        //��ѧ�Ų���
        if(choice.equals("2")){
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getId())) {
                    System.out.println(students.get(i));
                    count++;
                }
            }
        }
        if(choice.equals("3")){  //����������
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getName())) {
                    System.out.println(students.get(i));
                    count++;
                }
            }
        }
        if(choice.equals("5")){  //����ַ����
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getAddress())) {
                    System.out.println(students.get(i));
                    count++;
                }
            }
        }

        if (count==0){
            System.out.println("��ѯʧ�ܣ� δ�ҵ���Ӧ��Ϣ");
        }
    }

    /**
     * ���������
     * @param students
     * @param choice
     * @param next
     */
    private static void find(ArrayList<Student> students, String choice, int next) {
        int count = 0;
        //���������
        if(choice.equals("4")){
            for (int i = 0; i < students.size(); i++) {
                if (next==(students.get(i).getAge()))
                    System.out.println(students.get(i));
            }
        }
        if (count==0){
            System.out.println("��ѯʧ�ܣ� δ�ҵ���Ӧ��Ϣ");
        }
    }

    /**
     * ��ѧ�� �� ����ɾ��
     * @param students
     */
    private static void delete(ArrayList<Student> students) {
        System.out.println("������ָ�1.��ѧ��ɾ�� 2.������ɾ��");
        String choose = scanner.next();
        switch (choose){
            case "1":
                System.out.println("������ѧ�ţ�");
                delete(students, "1", scanner.next());
                break;
            case "2":
                System.out.println("����������: ");
                delete(students, "2", scanner.next());
                break;
            default:
                System.out.println("ָ������! ����������");
        }
    }

    /**
     * ��ѧ�� ���� ɾ��
     * @param students
     * @param choice
     * @param next
     */
    private static void delete(ArrayList<Student> students, String choice, String next) {
        boolean flag = false;
        if ("1".equals(choice)){
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getId())) {
                    students.remove(i);
                    System.out.println("ɾ���ɹ���");
                    flag = true;
                }
            }
        }
        if ("2".equals(choice)){
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getName())) {
                    students.remove(i);
                    System.out.println("ɾ���ɹ���");
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println("ɾ��ʧ�ܣ� δ�ҵ���Ӧ��Ϣ");
    }

    /**
     * ���
     * @param students
     */
    private static void add(ArrayList<Student> students) {
        while (true) {
            boolean flag = false;
            Student student = new Student();
            System.out.println("������ѧ��ѧ�ţ�");
            student.setId(scanner.next());
            for (int i = 0; i < students.size(); i++) {
                if (student.getId().equals(students.get(i).getId())){
                    System.out.println("ѧ���Ѵ��ڣ�����������");
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println("������ѧ��������");
                student.setName(scanner.next());
                System.out.println("������ѧ�����䣺");
                student.setAge(scanner.nextInt());
                System.out.println("������ѧ����ַ��");
                student.setAddress(scanner.next());
                students.add(student);
                System.out.println("��ӳɹ���");
                break;
            }
        }
    }
}
