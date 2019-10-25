package Day02.demo03_方法重写的引用_手机案例;
/*
    3、方法的重写：
            a、为神魔要进行方法的重写
                    当子类发现从父类继承过来的方法不适用时那么紫烈需要自己去重写这些方法

                案例：手机案例
                父类：手机类
                子类：智能机

     4、注意事项：
                a、权限问题：子类重写方法的权限>=父类中方法权限
                            java中游四种权限：     从大到小
                                public  prtect  default  private

*/

public class TestDemo {
    public static void main(String[] args) {
        //测试：AndroidPhone
        AndroidPhone vivo9s = new AndroidPhone();
        vivo9s.brand = "vivo大神机";
        vivo9s.price = 998.99;

        vivo9s.call();

        vivo9s.sendMsg();
    }
}
