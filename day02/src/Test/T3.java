package Test;

/**
 * createAuthor��xingquanxiang
 * createTime��2019/7/18 19:11
 * description:
 */
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("�������һ������");
        int a = o.nextInt();
        System.out.println("������ڶ�������");
        int b = o.nextInt();
        System.out.println("���������������");
        int c = o.nextInt();
        int max,min,z;
        if(a>b){
            if(b>c){max = a;min = c;z = b;}
            else if(c<a){max = c;min =b;z = a;}
            else{max = a;min =b;z = c; }
        }
        else{
            if(b<c){ max = c;min = a;z = b;}
            else if(a<c){max = b;min = a;z = c;}
            else{max = b;min =c;z = a;}
        }
        System.out.println("��С����"+min+"��������"+z+"���������"+max);
    }
}

