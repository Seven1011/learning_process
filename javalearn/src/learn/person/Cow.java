package learn.person;

public class Cow {
    private double weight;

    //外部类的两个重载的构造器
    public Cow() {
    }

    public Cow(double weight) {
        this.weight = weight;
    }

    //定义一个非静态的内部类
    private class CowLeg {
        private double length;
        private String color;

        //非静态内部类的两个重载的构造器
        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.length = length;
            this.color = color;
        }
        //length、color的setter和getter方法

        public void setLength(double length) {
            this.length = length;
        }

        public void setterColor(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }

        public double getLength() {
            return length;
        }

        //非静态内部类的实例方法
        public void info() {
            System.out.println("当前牛腿的颜色是：" + color + ",高：" + length);
            //直接访问外部的private修饰的成员变量
            System.out.println("本牛腿所在奶牛重：" + weight);
        }
    }

    public void test() {
        CowLeg cl = new CowLeg(1.12, "黑白相间");
        cl.info();
    }

    public static void main(String[] args) {
        Cow cow = new Cow(378.9);
        cow.test();
    }
}
