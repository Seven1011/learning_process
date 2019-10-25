/*
super关键字：

suoer关键字代表了父类空间的成员

super关键字的作用：
	1、子父类

super关键字调用父类构造方法要注意的事项：
	1、如果在子类的构造方法中没有指定调用父类的构造方法，那么java编译器会在自雷的构造方法上面加上super（）语句
	2、super关键字调用父类的构造函数时，该语句必须是子类构造函数中的第一个语句。
	3、super与this关键字不能同时出现在同一个构造函数中调用其他的构造函数。因为两个语句都需要在第一个语句。

super关键字与this关键字的区别：
	1、代表事物不一致。
			1、super关键字代表得是父类空间的引用。
			2、this关键字代表的是所属函数的调用者对象。
	*/
class Demo9 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
