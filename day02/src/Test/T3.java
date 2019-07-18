package Test;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/18 19:11
 * description:
 */
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = o.nextInt();
        System.out.println("请输入第二个数：");
        int b = o.nextInt();
        System.out.println("请输入第三个数：");
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
        System.out.println("最小数："+min+"，中数："+z+"，最大数："+max);
    }
}

