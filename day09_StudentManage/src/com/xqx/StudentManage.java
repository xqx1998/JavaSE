package com.xqx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/29 9:58
 * description:
 */
public class StudentManage {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("----------------");
            System.out.println("欢迎进入学生管理系统");
            System.out.println("选择你想进行的操作：");
            System.out.println("1.添加学生信息；");
            System.out.println("2.删除学生信息；");
            System.out.println("3.查询学生信息；");
            System.out.println("4.修改学生信息；");
            System.out.println("5.退出；");
            System.out.println("请输入指令：(并按回车键)");
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
                    System.out.println("指令有误");
            }
        }
    }

    /**
     * 更新学生信息
     * @param students
     */
    private static void update(ArrayList<Student> students) {
        System.out.println("请输入要更新的学生信息学号：");
        String id = scanner.next();
        boolean flag = false;
        for (int i = 0; i < students.size(); i++) {
            if (id.equals(students.get(i).getId())){
                System.out.println("选择的学生为：");
                System.out.println(students.get(i).toString());
                System.out.println("请输入新姓名：");
                students.get(i).setName(scanner.next());
                System.out.println("”请输入新年龄：");
                students.get(i).setAge(scanner.nextInt());
                System.out.println("请输入新地址：");
                students.get(i).setAddress(scanner.next());
                System.out.println("学号为"+students.get(i).getId()+"的学生信息修改成功！");
                System.out.println("新信息为：");
                System.out.println(students.get(i).toString());
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println("未找到学号为"+id+"的学生信息");
    }

    /**
     * 查询学生信息
     * @param students
     */
    private static void find(ArrayList<Student> students) {
        System.out.println("请输入指令：1.查询所有学生信息 2.按学号查询 3.按姓名查询 4.按年龄查询 5.按地址查询");
        String choose = scanner.next();
        switch (choose){
            case "1":
                foreach(students);
                break;
            case "2":
                System.out.println("请输入学号：");
                find(students, "2",  scanner.next());
                break;
            case "3":
                System.out.println("请输入姓名：");
                find(students, "3", scanner.next());
                break;
            case "4":
                System.out.println("请输入年龄：");
                find(students, "4", scanner.nextInt());
                break;
            case "5":
                System.out.println("请输入地址：");
                find(students, "5", scanner.next());
                break;
            default:
                System.out.println("输入有误！请重新输入");
        }
    }

    /**
     * 查看所有学生信息
     * @param students
     */
    private static void foreach(ArrayList<Student> students) {
        if (students.size()>0) {
            for (Student student : students) {
                System.out.println(student);
            }
        }else{
            System.out.println("还没有学生信息！");
        }
    }

    /**
     * 按 学号 或 姓名 或 地址查找
     * @param students
     * @param choice
     * @param next
     */
    private static void find(ArrayList<Student> students, String choice,  String next) {
        int count = 0;
        //按学号查找
        if(choice.equals("2")){
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getId())) {
                    System.out.println(students.get(i));
                    count++;
                }
            }
        }
        if(choice.equals("3")){  //按姓名查找
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getName())) {
                    System.out.println(students.get(i));
                    count++;
                }
            }
        }
        if(choice.equals("5")){  //按地址查找
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getAddress())) {
                    System.out.println(students.get(i));
                    count++;
                }
            }
        }

        if (count==0){
            System.out.println("查询失败！ 未找到对应信息");
        }
    }

    /**
     * 按年龄查找
     * @param students
     * @param choice
     * @param next
     */
    private static void find(ArrayList<Student> students, String choice, int next) {
        int count = 0;
        //按年龄查找
        if(choice.equals("4")){
            for (int i = 0; i < students.size(); i++) {
                if (next==(students.get(i).getAge()))
                    System.out.println(students.get(i));
            }
        }
        if (count==0){
            System.out.println("查询失败！ 未找到对应信息");
        }
    }

    /**
     * 按学号 或 姓名删除
     * @param students
     */
    private static void delete(ArrayList<Student> students) {
        System.out.println("请输入指令：1.按学号删除 2.按姓名删除");
        String choose = scanner.next();
        switch (choose){
            case "1":
                System.out.println("请输入学号：");
                delete(students, "1", scanner.next());
                break;
            case "2":
                System.out.println("请输入姓名: ");
                delete(students, "2", scanner.next());
                break;
            default:
                System.out.println("指令有误! 请重新输入");
        }
    }

    /**
     * 按学号 姓名 删除
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
                    System.out.println("删除成功！");
                    flag = true;
                }
            }
        }
        if ("2".equals(choice)){
            for (int i = 0; i < students.size(); i++) {
                if (next.equals(students.get(i).getName())) {
                    students.remove(i);
                    System.out.println("删除成功！");
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println("删除失败！ 未找到对应信息");
    }

    /**
     * 添加
     * @param students
     */
    private static void add(ArrayList<Student> students) {
        while (true) {
            boolean flag = false;
            Student student = new Student();
            System.out.println("请输入学生学号：");
            student.setId(scanner.next());
            for (int i = 0; i < students.size(); i++) {
                if (student.getId().equals(students.get(i).getId())){
                    System.out.println("学号已存在，请重新输入");
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println("请输入学生姓名：");
                student.setName(scanner.next());
                System.out.println("请输入学生年龄：");
                student.setAge(scanner.nextInt());
                System.out.println("请输入学生地址：");
                student.setAddress(scanner.next());
                students.add(student);
                System.out.println("添加成功！");
                break;
            }
        }
    }
}
