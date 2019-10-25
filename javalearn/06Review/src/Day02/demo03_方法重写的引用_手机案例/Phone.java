package Day02.demo03_方法重写的引用_手机案例;

/*
 * 父类：手机类
 * */
public class Phone {
    double price;
    String brand;//品牌

    //方法
    //打电话
    void call() {
        //1000行代码
        System.out.println("正在给138383835438打电话....");
    }

    //发短信
    public void sendMsg() {
        //500行代码
        System.out.println("呱呱，晚上一块吃饭...");
    }
}
