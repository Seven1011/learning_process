package day03.demo03_接口和抽象类的区别;

public class SuperDog extends AbstractDog {
    @Override
    public void eat() {
        System.out.println("一秒钟吃完.....");
    }

    @Override
    public void bark() {
        System.out.println("站住，不许动....");
    }

    public void jiDu() {
        System.out.println("有毒品，不许动...");
    }

    public void biuBiuBiu() {
        System.out.println("再跑我就开枪了...");
    }
}
