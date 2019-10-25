package day03.demo05_多态中的注意事项;
/*
        什么叫做多态：
            一个对象的多种形态
        两个前提：
                1、必须有继承
                2、必须有方法重写
                3、代码体现
                            父类类型 变量名    =   new 子类类型


         注意事项：
                    使用多态调用成员变量
                            编译时  看父类  看左边

                    使用多态调用成员方法
                              编译时  看父类  看左边
                              运行时   看子类 看右边

        总结：
            多态使用变量  编译运行都看父类
            多台调用方法  编译看父类   运行看子类

         多态的弊端：
                多态只能调用子类共有的方法，不嗯呢该调用子类特有的方法


*/

public class DuoTaiDemo {
    public static void main(String[] args) {
        //使用多态创建一个狗
        Animal an = new Dog();
        //  System.out.println(an.age);
        an.eat();
        //an.lookHome();
    }

}
