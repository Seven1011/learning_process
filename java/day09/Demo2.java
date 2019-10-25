/*
final(最终的、修饰符)

final关键字的用法：
		1、final关键字秀是一个基本类型的变量时，该变量不能重新赋值，第一次的值是最终得。
		2、final关键字秀是一个引用类型变量时，该变量不能指向新的对象.
		3、final关键字秀是一个函数的时候，该函数不能被重写。
		4、final关键字修饰一个类的时候，该类不能被继承。

常量的修饰符一般为： public static final

				



*/

class Circle
{
	double r; //半径

	private double pi=3.14; //固定不变的

	public Circle(double r){
		this.r = r;
	}
	//计算面积
	public final void getArea(){
		 System.out.println("圆形的面积是"+r*r*pi);
	}
}
class Demo2 extends Circle
{
	public Demo2(double r){
		super(r);
	}

	public static void main(String[] args) 
	{
		/*
		final Circle c = new Circle(4,0);
		test(c);
		//System.out.println("Hello World!");
		*/
		Demo2 c = new Demo2(4.0);
		c.getArea();
	}

	public static void test(Circle c){
		c = new Circle(5.0); //c变量又重新指向新的对象
		c.getArea();
	}
}
