package Day02.demo01_复习子父类;
/*
        继承中子父类出现同名的成员变量时
                    通过子类对象优先使用子类自己的成员变量
         1、this：区分本类中的成员变量和局部变量同名情况
         2、super：区分子类中的成员变量和父类中的成员变量
*/

public class ExtendDemo {
    public static void main(String[] args) {
        //子父类成员变量同名
        Zi zz = new Zi();
        zz.showNum();
    }
}
