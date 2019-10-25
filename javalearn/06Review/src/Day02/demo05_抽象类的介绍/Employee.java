package Day02.demo05_抽象类的介绍;

public abstract class Employee {
    int age;
    String name;
    int id;

    //方法工作，不知道怎么去实现，定义成抽象方法
    public abstract void work();
}
