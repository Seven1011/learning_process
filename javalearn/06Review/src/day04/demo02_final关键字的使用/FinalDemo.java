package day04.demo02_final关键字的使用;
/*
        final：最终得，终极的           黑客--->（红客，骇客）   黑鹰基地
        final可以修饰
                类 成员变量  成员方法    局部变量（基本类型   引用类型）

         1、final修饰类（太监类）：不能被继承，但是并不是不能作为其他类的子类

         2、final修饰成员变量
                2.1 被final修饰的成员变量，必须在创建对象之前有确定的值
                2.2被final修饰的成员变量，只能赋值一次

         3、fianl修饰的成员方法（牛逼方法）
                        不能被子类重写
         4、final修饰基本类型局部变量：
                被final修饰的基本类型局部变量       只能赋值一次

          5、final修饰引用类型的局部变量
                        被final修饰的引用类型局部变量       只能赋值一次
                        但是引用类型所指的对象中内容是可以改变的

*/

public class FinalDemo {
    public static void main(String[] args) {
        //1.使用final修饰的类型
        Test tt = new Test();
        //tt.aa = 10;
        System.out.println(tt.aa);
        //2使用final修饰基本类型
        final int a;
        a = 20;
        //a = 30;
        //3使用final修饰引用类型
        final Dog dd = new Dog();
        //dd = new Dog();
        dd.age = 20;
        dd.age = 30;
    }
}
