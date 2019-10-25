package day03.demo09_笔记本案例最后实现;

//电脑类
public class Computer {
    //自己的功能
    public void open() {
        System.out.println("电脑打开了....准备开始工作");
    }

    public void useUSB(USBInterface usb) {
        usb.open();
        usb.use();
        usb.close();
    }

    public void end() {
        System.out.println("电脑关闭了....");
    }
}
