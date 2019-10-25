package day04.demo02_final关键字的使用;

public class Test {
    final int aa;

    public Test() {
        aa = 20;
    }

    //final修饰的方法，不能被子类重写
    public final void show() {

    }
}
