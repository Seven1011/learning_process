package day03.demo07_向上向下转型;
/*
        多态的弊端：
                不能调用子类特有的方法

          弊端的解决方案：
                    向上转型：强制类型转换  int a=(int)  3.14

                    向下转型(就是多态)： 自动类型转换  double  d=10;
                            Animal an = new Dog();

         向下转型也有弊端：
                    把父类的变量转成子类的类型的时候    编译器直接编译通过

          java中解决向下转型弊端的方法：
                        一个关键字   instanceof  运算符

                    作用：判断某个变量是不是该类的类型
                    格式：
                                boolean  b=an instanceof 类名


          总结：
                    多态的好处：提高程序的灵活性，扩展性，复用性
                                        因为父类的变量  可以接受任何一个子类对象

                   多态的弊端：
                                    不能调用子类特有的方法
                            向上向下转型：
                                        向上转型: 多态
        	               	            向下转型: 子类类型 变量名 =(子类类型)父类类型的变量;
                     			                        变量名.子类特有方法();

                            向下转型过程中 很容易出现  类型转换的异常 Cat can not be cast to DO

                            关键字：运算符 instanceof
                                            判断某一个对象是不是属于一个类
                                            格式：
                                                        boolean  b=变量名  instanceof  类名

*/

public class DuoTaiDemo {
    public static void main(String[] args) {
        Animal an = new Cat();
        an.eat();
        //Dog  cannot be cast Cat  狗不能转换成猫
        Cat cc = (Cat) an;    //告诉编译器  an是猫
        cc.catchMouse();

//        an.lookHome();
        Dog dog = (Dog) an;
        dog.lookHome();
        //		//创建猫 使用多态
//		Animal an1 = new Cat();
//		an1.eat();
//		Cat cc = (Cat)an1;
//
//		cc.catchMouse();
    }
}
