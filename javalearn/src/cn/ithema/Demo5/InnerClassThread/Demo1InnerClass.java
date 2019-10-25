package cn.ithema.Demo5.InnerClassThread;
/*  匿名颞部类方式实现线程的创建

    匿名：没有名字
    内部类：写在其它类内部的类

    匿名内部类作用：简化代码
           把实现子类继承父类、重写父类的方法，创建子类对象合一步完成
*  匿名内部类的最终产物：子类/实现类对象


        格式：
                    new   父类/接口(){
                    重复父类/接口中的方法
                    }；

*/

public class Demo1InnerClass {
    public static void main(String[] args) {
        //线程是父类Thread
        //new MyThread().start();
        new Thread() {
            //重写run方法，设置线程任务

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "----->" + "黑马");
                }
            }
        }.start();

        //线程的接口Runnable
        //Runnable r = new Runnable(); //多态
        new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "----->" + "传智");
                }
            }
        };

        new Thread().start();

        //简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "----->" + "程序员");
                }
            }
        }).start();

    }

}
