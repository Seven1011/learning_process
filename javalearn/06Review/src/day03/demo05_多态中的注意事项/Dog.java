package day03.demo05_多态中的注意事项;

public class Dog extends Animal {
    int age = 1000;

    @Override
    public void eat() {
        System.out.println("狗狗在吃饭.....");
    }

    public void lookHome() {
        System.out.println("在看门....");
    }
}
