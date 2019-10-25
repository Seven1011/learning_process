package cn.ithema.Demo2MyThread;

public class MyThread extends Thread {
    /*
    利用继承中的特点
        将线程名称传递    进行设置

    */
    public MyThread(String name) {
        super(name);
    }

    /* 重写run方法
         定义线程要执行的代码
     */
    public void run() {
        for (int i = 0; i < 20; i++) {
            //getName()方法  来自父类
            System.out.println(getName() + i);
        }
    }
}
