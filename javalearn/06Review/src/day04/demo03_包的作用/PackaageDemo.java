package day04.demo03_包的作用;
/*
    1、 包的本质是什么？
                就是文件夹，在报名中是以.来区分上下级文件夹关系

      2、为什么要用包？
                分类管理文件

      3、包的声明：
                格式：package  包名
                作用：只是   某个类  在那个包下
                包的声明    必须和 类所有的实际位置保持一致

      4、包的导入
                用来告诉编译器     我们要使用的类在哪一个包下
                格式：
                        import  包名.类名

      5、全限定类名
            格式： 包名.类名





*/

public class PackaageDemo {
    public static void main(String[] args) {
        //使用ArrayList
        java.util.ArrayList<String> arr = new java.util.ArrayList<String>();

        java.util.Random rd = new java.util.Random();
    }
}
