package Day02.demo03_方法重写的引用_手机案例;

public class AndroidPhone extends Phone {
    //重写打电话的方法

    @Override
    protected void call() {
        super.call();
        //500行代码
        System.out.println("看见一张张萌萌的脸...");

    }

    //重写 发短信
    //发短信

    @Override
    public void sendMsg() {
        super.sendMsg();
        //500行代码  发语音
        System.out.println("哈哈哈，晚饭真好吃哦....");
        //500行代码 发图片
        System.out.println("一张吃晚饭的照片，晚饭真好吃....");
        //500行代码  发视频
        System.out.println("发一个吃完饭的视频....");
    }
}

