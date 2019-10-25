package Day02.demo06_案例实现;

/*
   测试类
*/
public class TestDemo {
    public static void main(String[] args) {
        //测试JavaEE
        JavaEE ee = new JavaEE();
        ee.id = 10086;
        ee.age = 18;
        ee.name = "狗娃";
        ee.work();

        //测试NetRepair
        NetRepair nr = new NetRepair();
        nr.age = 23;
        nr.id = 10010;
        nr.name = "张三";
        nr.work();

    }

}
