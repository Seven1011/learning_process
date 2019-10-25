/*
需求：使用java类描述百合网的会员

权限修饰符：权限修饰符就是控制变量可见范围的。

public：公共的。public修饰的成员变量或者方法任何人都可以直接访问


private：私有的。 private修饰的成员变量只能在本类中进行直接访问。
	
	封装的步骤：
		1、使用private修饰需要被封装的属性
		2、提供一个公共的方法设置或者获取该私有的成员属性
			命名规范：
				set属性名（）；
				get属性名（）；

疑问：封装一定要提供get或者set方法吗？？？
		不一定，根据需求而定的。

	
在现实开发中一般实体类的所有属性（成员变量）都要封装起来。

实体类：实体类就使用与描述一类事物，就成为实体类。

工具类（Arrays数组工具类）：
	
封装的好处：
		1、提高数据的安全性。
		2、操作简单。
		3、隐藏了实现。
需求：使用java类描述一个计算机类，计算机具备操作数1，操作数2，操作符3、三个公共属性
还具备计算的功能行为


要求：不能直接对操作数1、操作数2、运算符这些属性进行直接赋值，要封装起来。（+、-、*、/）
	
	*/


class Member
{
	public String name;//名字
	private String sex;//性别
	public int salary;//薪水
	
}



class Demo5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
