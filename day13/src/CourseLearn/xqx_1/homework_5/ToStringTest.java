package CourseLearn.xqx_1.homework_5;

public class ToStringTest{
        static int i = 1;
        public static void main(String args[]){
            /*
                1 执行new ToStringTest()创建对象  相当于ToStringTest tst=new ToStringTest()
                2 将"love "和tst做字符串拼接，会调用对象的toString方法，将对象转换成字符串
                    调用同 String方法会发生如下事情：
                        1、打印 I
                        2 返回Java字符串，然后在main的第一行代码中就相当于System.out.println("love " + "Java"））；

                3 将最终的拼接结果进行输出
                    I love java
             */
            System.out.println("love " + new ToStringTest());//love java
            ToStringTest a = new ToStringTest();
            a.i++;//i=2
            System.out.println("me " + a.i);//me 2
             // me 2
        }
        public String toString(){
            System.out.print("I ");//I
            return "java ";
        }
    }