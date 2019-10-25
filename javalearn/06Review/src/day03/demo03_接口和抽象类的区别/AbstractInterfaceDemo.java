package day03.demo03_接口和抽象类的区别;
/*
           接口类和抽象类的区别：
           1、相同点：
                a、都不能创建对象
                b、都是作为父类/父接口
                c、子类/实现类    都必须重写抽象方法 然后才能创建对象

            2、不同点：
                a、抽象类用关键字abstact        接口用关键字interface
                b、抽象类中可以有抽象方法，可以没有抽象方法，也可有部分是抽象方法，部分不是抽象方法
                                接口只要有方法，必须是抽象的
                 c、抽象类可以定义任意成员变量，接口的成员变量必须用public static final修饰
                 d、类和抽象类之间的关系是单继承，类和接口之间的关系是多继承
                 e、思想上的区别
                            1、抽象类中必须定义整个继承体系的共性内容
                            2、接口中定义整个集成体系之外的额外的扩展的功能



*/

public class AbstractInterfaceDemo {
    public static void main(String[] args) {
        //测试子类
        SuperDog sd = new SuperDog();

        sd.bark();
        sd.eat();
        sd.jiDu();
    }
}
