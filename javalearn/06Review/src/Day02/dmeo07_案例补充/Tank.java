package Day02.dmeo07_案例补充;

public class Tank {
    String type;

    public void FilePlane(Plane p) {
        System.out.println(type + "发出一发发炮弹，飞机冒出浓浓黑烟...");
        p.boom();
    }
}
