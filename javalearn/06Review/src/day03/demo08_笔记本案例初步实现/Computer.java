package day03.demo08_笔记本案例初步实现;
/*
    电脑类
*/

public class Computer {
    public void start() {
        System.out.println("电脑开机了....");
    }

    public void useMouse(Mouse m) {
        m.close();
        m.open();
        m.use();
    }

    public void close() {
        System.out.println("电脑关机了....");

    }
}
