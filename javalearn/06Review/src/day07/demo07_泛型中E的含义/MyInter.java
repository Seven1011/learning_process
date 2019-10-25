package day07.demo07_泛型中E的含义;

public interface MyInter<Q> {
    public abstract void show(Q q);

    //1、当子类实现接口的时候，确定接口上的泛型
    class MyClass1 implements MyInter<String> {
        @Override
        public void show(String s) {

        }
    }

    //2、当子类实现接口的时候，还是不确定泛型，把接口的泛型继续实现下来
    //挡视线类创建对象的时候
    class MyClass2<Q> implements MyInter<Q> {
        @Override
        public void show(Q q) {

        }
    }
}
