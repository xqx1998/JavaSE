package A01_If;

import java.util.Scanner;

/*
	需求：使用键盘录入一个学生的成绩，判断该学生是否及格?(大于60分表示及格)
	if(关系表达式){//关系表达式也叫做判断条件
		//语句体：打印该学生的成绩及格了。
	}
	
*/
public class IfDemo01{
	public static void main(String[] args){
		//1.Scanner键盘录入的三步
		//导包
		//创建对象
		Scanner sc = new Scanner(System.in);
		//接收数据
		System.out.println("请输入成绩：");
		float grade = sc.nextFloat();
		//if判断，判断条件>=60
		if(grade>=60.0){
			System.out.println("该学生的成绩及格了");
		}/*else{
			System.out.println("该学生的成绩未及格");
		}*/
	}
}