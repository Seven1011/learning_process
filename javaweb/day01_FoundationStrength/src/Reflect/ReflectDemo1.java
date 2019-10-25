package Reflect;
/*
        获取对象的方式：
            1、Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
            2、类名.Class：通过雷鸣的属性class获取
            3、对象.getClass():getClass()方法在Object类中定义着

*/

import DoMain.Person;
import DoMain.Student;

public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        //1、Class.forName("全类名")
        Class cls1 = Class.forName("DoMain.Person");
        System.out.println(cls1);
        //2、类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);
        //3、对象.getclass()
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //比较三个对象
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

        //结论：
        //      同一个字节码文件（*.class）在一次程序运行过程中，只会被加载一次，不论通过那一种方式获取的class对象都是同一个

        Class c = Student.class;
        System.out.println(c == cls1);
    }
}
