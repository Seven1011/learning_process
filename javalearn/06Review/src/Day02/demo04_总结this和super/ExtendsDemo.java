package Day02.demo04_总结this和super;
/*
 * this:区分成员变量和局部变量的同名情况
 * super:区分子类成员变量和父类成员变量同名的情况
 *
 * 用法:
 * 	this.xxx : 访问本类的成员变量
 * 	this.aaa();调用本类的成员方法(this可以省略)
 *
 *  super.xxx: 访问父类的成员变量
 *  super.aaa();调用父类的成员方法(super不能省略)
 *
 *  高级使用: this和super的语句形式
 * 	 	this(参数); 用来调用本类的其他构造
 * 			其他构造是指哪一个构造?  有this()中的参数决定
 * 		需求:
 * 			无论调用者通过何种方式 创建对象 要求这个对象的名字必须是"旺财" 年龄必须是18
 *  	super(); 用来调用父类的其他构造
 *  		无论调用子类的哪一个构造,都会先执行父类的无参构造
 *  		java这么设计类,是有原因:单一职责原则,
 *  				一个类不能太累,一个类只负责给本类的成员变量赋值
 *
 *  		super();//调用父类的无参构造(默认的)
 *
 *  		super(参数);//调用父类的有参构造
 *  					具体调用哪一个有参构造,有参数的类型决定
 *
 *
 *
 */

public class ExtendsDemo {
    public static void main(String[] args) {
        Pig p1 = new Pig("小旺财");
        System.out.println(p1.age + "..." + p1.name);
        //super()的使用
        //创建子对象
        Zi z1 = new Zi();
        Zi z2 = new Zi("旺财");
        // Zi  z2= new Zi("旺财",18);
        //调用子类全参的构造
        Zi zz = new Zi(18, "旺财", 100);
    }

}
