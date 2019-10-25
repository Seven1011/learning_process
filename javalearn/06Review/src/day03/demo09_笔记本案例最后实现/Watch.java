package day03.demo09_笔记本案例最后实现;

public class Watch implements USBInterface {
    @Override
    public void open() {
        System.out.println("手表打开了....");
    }

    @Override
    public void use() {
        System.out.println("手表开始工作了....");
    }

    @Override
    public void close() {
        System.out.println("手表关闭了....");
    }
}
