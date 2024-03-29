/*
面向对象的三大特征：
		1、封装
		2、继承
		3、多态
		
多态：一个对象具备多种形态。（父类的引用类型变量指向了子类的对象或者是接口引用类型指向了接口实现类的对象）

多态的前提：必须存在继承或者实现关系。

	动物 a =  new 狗();


多态需要注意的细节：
		1、多态情况下，子父类存在同名的成员变量是，访问的是父类的成员变量。
		2、多台情况下，子父类存在同名的非静态的成员函数时，访问的是子类的成员函数
		3、多台情况下，子父类存在同名的静态的成员函数时，访问的时父类的成员函数。

		总结：多台情况下，子父类存在同名的成员时，访问的都是父类的成员，除了在同名非静态函数时采访问子类。

编译看左边，运行不一定看右边

编译看左边：java编译器在编译的时候，会检查引用类型变量所属的类是否具备指定的成员，如果不具备马上编译报错。




	*/
class Animal{
	String name;

	public Animal(String name)
}

class  Demo11
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
