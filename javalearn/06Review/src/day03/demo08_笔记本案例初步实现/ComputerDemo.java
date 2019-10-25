package day03.demo08_笔记本案例初步实现;
/*
    模拟电脑类使用鼠标
*/

public class ComputerDemo {
    public static void main(String[] args) {
        //测试电脑使用鼠标
        Computer haier = new Computer();

        Mouse mm = new Mouse();
        //电脑使用鼠标
        haier.start();

        haier.useMouse(mm);
        haier.close();
    }
}
