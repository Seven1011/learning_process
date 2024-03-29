/*
抽象类：

什么时候使用抽象类
	描述一类事物的时候，发现该事物确实存在着某种行为，但是目前这种是不具体
	的这时候，应该抽取这种行为的声明，而不去实现该种行为，这时候这种行为，我
	们能把他称为抽象的行为，这时候应该使用抽象类

抽想类要注意的细节：
	1、如果一个类没有方法体，那么该方法必须使用abstract修饰
	2、如果一个类函数抽象方法，那么这个类肯定是一个抽想类或者接口
	3、抽想类不能创建对象
	4、抽想类是含有构造方法的
	5、抽想类可以存在非抽象方法与抽象方法

接口与类之间的关系： 实现关系

注意：一个类可以实现多个接口

接口与接口之间的关系：继续关系

注意：一个接口可以继承多个接口

多态：父类的引用类型变量指向了子类的对象，或者是接口的引用对象指向了实现接口的引用对象

多态要注意细节：
	1、多态情况下，如果子父类存在同名的成员变量时，访问的是父类的成员变量
	2、多态情况下，如果子父类存在同名的非静态函数时，访问的是子类的成员函数
	3、2、多态情况下，如果子父类存在同名的静态函数时，访问的是父类的成员函数

多态的应用：
	1、多态用于形参类型的时候，可以接受更多类型的数据
	2、多态用于返回值类型的时候，可以返回更多类型的数据

	*/
class Demo1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
