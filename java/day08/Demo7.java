/*
目前存在的问题：
	1、无法描述清楚这两个类之间的继承关系
	2、存在重复的代码

面向对象三大特征：
	1、封装
	2、继承
	3、多态

继承：及城市通过关键字extends体现的

继承的格式：

		class 类名1 extends 类名2{
		
		}


继承要注意的事项：
	1、千万不要为了减少重复代码而去继承，只有真正存在继承关系的时候再去继承。
	2、父类私有的成员不能被继承。
	3、父类的构造方法不能被继承。
	4、创建子类对象时默认会先调用父类无参的构造函数。




	*/
//人类
class Person{
	String name;

	private int age;

	public Person(String name){
			this.name = name;
	}

	public Person(){
		System.out.println("Person类的构造方法被调用了...");
	}
	public void eat(){
		System.out.println(name+"在吃饭...");
	}
}

//学生类
class Student extends Person{
	int num; //学号

	public Student(){
		System.out.println("Student类的构造方法被调用了...");
	}

	public void study(){
		System.out.println(name+"good good study , day day up!!!");		
	}
}
class  Demo7
{
	public static void main(String[] args) 
	{
		Student s = new Student();

		/*
		s.name = "狗娃";
		System.out.println("名字："+s.name);
		s.eat();
		*/
	}
}
