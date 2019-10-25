/*

需求：描述一个图形、圆形、矩形三个类。不管哪种图形	都会具备计算面积与周长的行为，只不过美中图形的计算方式不一致而已。	

常量命名规范：全部子母大写，单词与单词之间使用下划线分割

abstract不能与一下关键字共同修饰一个方法：
		1、abstract不能与private共同修饰一个方法。
		2、abstract不能与static共同修饰一个方法。
		3、abstract不能与final共同修饰一个方法。

	*/

//abstract  抽象

//图形类
abstract class MyShape{

	String name;

	public MyShape(String name){
		this.name = name;
	}

  public abstract void getArea();

  public abstract void getLength();

}

//圆形 是图形的一种
class Circle extends MyShape{
	double r;

	public static final double PI = 3.14;

	public Circle(String name, double r){
		super(name);
		this.r = r;
	}
	public void getArea(){
		System.out.println("圆形的面积是："+PI*r*r);
	}

	public void getLength(){
		System.out.println("圆形的周长是："+2*PI*r);
	}
  }


//矩形是图形的一种
class Rect extends MyShape
{
	int wide;
	int height;

	public Rect(String name, int wide , int height){
		super(name);
		this.wide = wide;
		this.height = height;
	}
	public void getArea(){
		System.out.println("矩形的面积是："+wide*height);
	}

	public void getLength(){
		System.out.println("矩形的周长是："+2*(wide+height));
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		Circle c = new Circle("圆形",4.0);
		c.getArea();
		c.getLength();

		Rect r = new Rect("矩形",7,9);
		r.getArea();
		r.getLength();
	}
}
