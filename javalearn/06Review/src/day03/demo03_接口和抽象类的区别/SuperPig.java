package day03.demo03_接口和抽象类的区别;

public class SuperPig extends AbstractPig {
    @Override
    public void eat() {
        System.out.println("三秒钟吃完....");
    }

    @Override
    public void sleep() {
        System.out.println("站着能睡着...");
    }

    public void jiDu() {
        System.out.println("慢一点，我跑不动...");
    }

    public void biuBiuBiu() {
        System.out.println("超级猪猪侠....");
    }
}
