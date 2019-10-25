package day07.demo07_泛型中E的含义;

public class Person<E> {
    E aaa;

    public E getAaa() {
        return aaa;
    }

    public void setAaa(E aaa) {//使用了类的泛型的方法
        this.aaa = aaa;
    }

    public <T> void show(T t) {//泛型的方法
        System.out.println(t);
    }
}
