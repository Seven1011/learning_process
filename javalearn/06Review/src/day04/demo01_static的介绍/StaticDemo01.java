package day04.demo01_static的介绍;
/*
    1、static的介绍
                static：关键字，静态的
                static的作用是用来修饰类中的成员
     2、以前我们要访问一个类的成员变量
        需要先创建对象，在通过对象调用成员变量
    3、如果一个类的成员变量被static修饰了，那么想访问这个成员
            直接通过类名.成员变量
        比如：
                    定义一个类,CZStudent(传智学生类)
                        		成员: age,name,id,school(就读学校)
                    什么时候类的成员需要用static修饰呢？
                            如果这个成员，特不属于某一个对象，而是属于所有对象共有的，那么需要加上static修饰

         比如：
                    定义一个类,Chinese(中国人类)
                            成员:
                                age,name,job(工作),nation(国籍)

        总结：
            1、如果一个类的成员被static修饰了，怎么访问？类名.成员变量名
            2、什么时候需要用static修饰成员变量，成员是某一个对象自己的，还是所有对象共享的
            3、被static修时候成员的特点：
                                    类名.成员变量名(推荐)
                                    对象.成员变量名


            被static修饰的成员变量/成员方法的使用

            1 、建议直接用类名调用
                    类名.静态成员变量名
                    类名.静态成员方法名（参数）
                    也可以通过对象（不建议）

*/

public class StaticDemo01 {
    public static void main(String[] args) {
        Chinese ch1 = new Chinese();
        ch1.age = 18;
        ch1.job = "歌手";
        ch1.name = "张三";
        //修改张三的国籍
        ch1.nation = "小米共和国";
        System.out.println(ch1.age + "...." + ch1.nation);
        Chinese ch2 = new Chinese();
        ch2.job = "演员";
        ch2.name = "Jack chen";
        ch2.age = 20;
        System.out.println(ch2.age + "......" + ch2.nation);
    }
}
