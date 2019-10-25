package day03.demo07_向上向下转型;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("香肠真好吃......");
    }

    public void lookHome() {
        System.out.println("汪汪，站住......");
    }
}
