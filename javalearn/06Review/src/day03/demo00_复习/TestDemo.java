package day03.demo00_复习;
/*
        1、this和super
                this：
                super:
        2、内存图

        3、方法的重写

        4、抽象类（abstract class）

                    被abstract修饰的类
        5、案例

*/

public class TestDemo {
    public static void main(String[] args) {
        C cc = new C();
        cc.printAA();

    }

}

class A {
    int aa = 10;
}

class B extends A {
    int bb = 10;
/*    public void show(){
        super.aa
    }*/
}

class C extends B {
    int cc = 30;

    public void printAA() {
        System.out.println(super.bb);
    }
}
