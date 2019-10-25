package Day02.dmeo07_案例补充;

public class Soldier {
    String name;
    int level;  //等级

    public void driveTankAndPlane(Tank tk, Plane p) {
        System.out.println(name + "开着" + tk.type + "坦克准备去打飞机");
        //打飞机
        tk.FilePlane(p);
    }
}
