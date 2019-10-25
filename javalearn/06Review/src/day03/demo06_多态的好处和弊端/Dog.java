package day03.demo06_多态的好处和弊端;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("骨头 真好吃,......");
    }
}
