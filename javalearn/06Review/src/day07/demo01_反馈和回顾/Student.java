package day07.demo01_反馈和回顾;

public class Student {

    static {    //静态代码块     1、只会执行一次    2、第一次使用到这个类
        System.out.println("Student 类的静态代码块...");   //3
    }

    public Student() {
        System.out.println("Student 类的构造方法...");
    }

    public Student(String methodName) {
        System.out.println("在" + methodName + "创建Student对象调用的");
    }
}
