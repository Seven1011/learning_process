/*
	static（静态、修饰符）

		static修饰成员变量时：static修饰成员变量时，该成员变量的数据就是一个共享数据

		静态成员变量的访问方式：
				
				方式一：使用对象进行访问。
						对象.属性名
				方式二：可以使用类名进行访问
						类名.属性名
		注意：
			1、费静态成员变量不能类名直接访问，只能使用对象进行访问
			2、千万不要为了方便访问成员变量而使用static修饰，一定要是该数据是共享数据时才
		
		static修饰方法（静态的成员方法）：

			访问方式：
					
					方式一：可以使用对象进行访问。
							对象.静态的函数名（）;
					方式二：可以使用类名进行访问。
							类名.静态函数名（）;

					推荐使用类名直接访问静态的成员。

	静态函数要注意的事项：
			1、静态函数是可以调用类名或者对象进行调用的，非静态函数只能使用对象进行调用
			2、静态的函数可以直接访问静态的成员，但不能直接访问非静态的成员。
			3、非静态的函数是可以访问静态与非静态的成员。
			4、静态函数不能出现this或者super关键字。

						
		*/
class Student
{
	String name;//名字

	static String country = "中国";//国籍
	
	//构造函数
	public Student(String name){
		this.name = name;
	}

	//非静态的成员函数
	public void study(){
		System.out.println(name+"好好学习");
	}

	//静态方法
	public static void sleep(){
		System.out.println("呼呼大睡...");
	}
	}


class Demo2
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	}
}
