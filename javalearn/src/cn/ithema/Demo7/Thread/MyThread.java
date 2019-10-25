package cn.ithema.Demo7.Thread;

//1.创建一个Thread类的子类
public class MyThread extends Thread {
    //2.在Thread的子类中重写Thread类中的run方法，设置线程任务（开启县城要做什么？）

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:" + i);
        }
    }
}
