package Test;

/**
 * createAuthor：xingquanxiang
 * createTime：2019/7/18 19:42
 * description:
 */
/*
 * 斗地主
 */
import java.util.ArrayList;
import java.util.Collections;

public class T6 {
    public static void main(String[] args) {
        //1.准备牌
        ArrayList<String> poker = new ArrayList<>();

        //2.定义两个String类型的数组，用来存储牌的花色和序号
        String[] colors = {"","","",""};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //大王、小王
        poker.add("大王");
        poker.add("小王");

        //4.将52张牌装入poker中
        for (String num : numbers) {
            for (String color : colors) {
                poker.add(color+num);
            }
        }

        //5.打乱牌的顺序
        Collections.shuffle(poker);

        //6.发牌
        //定义四个集合存储三个玩家的牌和底牌
        ArrayList<String> landlord = new ArrayList<>();
        ArrayList<String> farmer01 = new ArrayList<>();
        ArrayList<String> farmer02 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            if(i<51){
                //每次发一张，轮流发给三个玩家
                if(i%3==0){
                    landlord.add(poker.get(i));
                }else if(i%3==1){
                    farmer01.add(poker.get(i));
                }else{
                    farmer02.add(poker.get(i));
                }
            }else{
                //将最后三张牌放入底牌
                dipai.add(poker.get(i));
            }
        }

        //6.看牌
        System.out.println("倖权祥：" + landlord);
        System.out.println("杨   清：" + farmer01);
        System.out.println("何永辉：" + farmer02);
        System.out.println("底   牌：" + dipai);
    }

}
