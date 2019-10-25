package day03.demo09_笔记本案例最后实现;

public class KeyBoard implements USBInterface {
    @Override
    public void open() {
        System.out.println("键盘通电了.....");
    }

    @Override
    public void use() {
        System.out.println("键盘邦邦响....");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭了.....");
    }
}
