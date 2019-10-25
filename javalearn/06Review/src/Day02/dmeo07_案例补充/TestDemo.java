package Day02.dmeo07_案例补充;
/*
    什么是面向对象
           核心理念，谁的功能谁负责

     案例：
            武警开着堂课打飞机
             战士拿着枪打鬼子
             小偷拿着青龙偃月刀去撬门

      分析：
            1、名词提炼
                    武警：Soldier
                    坦克：


*/

public class TestDemo {
    public static void main(String[] args) {
        Plane p = new Plane();
        p.name = "歼-20";

        Tank t = new Tank();
        t.type = "天启坦克";

        Soldier so = new Soldier();
        so.level = 99;
        so.name = "许三多";
        so.driveTankAndPlane(t, p);

    }

}
