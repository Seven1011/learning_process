package day03.demo09_笔记本案例最后实现;

public class YinXiang implements USBInterface {
    @Override
    public void open() {
        System.out.println("音箱打开了.....");
    }

    @Override
    public void use() {
        System.out.println("音响嗷嗷嗷叫.....");
    }

    @Override
    public void close() {
        System.out.println("音响关闭了....");
    }
}
