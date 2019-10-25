package cn.ithema.Demo3.getName;

public class Demo3GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法，开启新线程，执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();

    }
}
