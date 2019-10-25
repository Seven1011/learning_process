package day03.demo07_向上向下转型;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("鱼骨头，真好吃.....");
    }

    public void catchMouse() {
        System.out.println("杰瑞，弄死你......");

    }
}
