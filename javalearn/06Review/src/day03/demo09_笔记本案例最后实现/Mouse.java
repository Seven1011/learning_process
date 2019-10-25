package day03.demo09_笔记本案例最后实现;

public class Mouse implements USBInterface {
    @Override
    public void open() {
        System.out.println("鼠标打开了");
    }

    @Override
    public void use() {
        System.out.println("鼠标满屏跑.....");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭了.....");
    }
}
