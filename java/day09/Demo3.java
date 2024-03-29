/*
目前存在的问题：
		1、动物类的run方法描述的不正确
		2、没有强制要子类一定要重写run方法

解决方案：我们在描述一类事物的时候，发现这种事物确实存在某种行为，但是
这种行为目前是不具体的，那么我们可以抽取这种行为的生命，但是不去实现该种行为，
这时候这种行为被我们称作为抽象的行为，我们就需要使用抽象类。

抽象类的好处：强制要求子类一定要实现指定的方法

抽象类要注意的细节：
		1、如果一个函数没有方法体，那么该函数必须要使用abstract修饰，把该函数修饰成抽象的函数。。
		2、如果一个类出现了抽象的函数，那么该类也必须使用abstra修饰
		3、如果一个非抽象类继承了抽象类，那么必须要把抽象类的所有抽象方法全部实现
		4、抽象类可以存在非抽象的方法，也可以存在抽象的方法。
		5、抽象类可以不存在抽象的方法。
		6、抽象类是不能创建对象的。
		7、抽象类是存在构造函数的，其构造函数是提供给子类创建对象的时候初始化父类的属性的。


	疑问：抽象类为什么不能创建对象呢？
		  因为抽象类是存在抽象方法的，如果能让周祥磊创建对象的话，那么使用抽象的对象调用抽象的方法是没有
		  任何意义的。


	*/

//动物类
abstract class Animal
{
	String name;

	String color;
	
	public Animal(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	public abstract void run();
		
}
class Dog extends Animal
	{
		public Dog(String name,String color){
			super(name,color);
		}

		public void run(){
			System.out.println(name+"四条腿跑的很快！！");
		}
	}

class Fish extends Animal{

		public Fish(String name,String color){
			super(name,color);
		}

		public void run(){
			System.out.println(name+"摆动尾巴游啊游！！");
		}
	}

class Demo3 
{
	public static void main(String[] args) 
	{
		/*
		Dog d = new Dog("牧羊犬","棕色");
		d.run();

		//创建一个鱼对象
		Fish f = new Fish("锦鲤","金黄色");
		f.run();
		*/
		Animal a = new Animal();   //报错  抽象的无法实例化
	}
}
