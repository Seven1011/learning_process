package day08.demo00_反馈和回顾;
/*
    泛型不能是基本类型

    类中各种成员的初始化的顺序

    1、如果类中存在继承关系（向Son 继承Father） 则首先会初始化导出来（Son）的基类（Father），然后再是导出来
    2、在基类首先会初始化 静态 的东西  静态代码快>静态变量  而且只初始化一次（因为静态的东西都是跟着类的加载而加载的）
    3、随后就是初始化导出类的静态东西  跟基类的静态初始化一样（同上）
    4、初始化基类无惨构造器（调用有参就初始化有参构造器）
    5、初始化导出来的无惨构造器（注意：导出类的成员变量和代码块都试试壁构造函数的初始化要早...看输出结果可知）


*/

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 9};  //错的
        Integer[] arr1 = {2, 6, 7, 9};  //对的
        //funtion(arr,1,3);
        funtion(arr1, 1, 3);
    }

    private static <E> void funtion(E[] e, int a, int b) {

    }

    public static int demo01() {
        return 10;
    }
}
