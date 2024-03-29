/*
目前的问题：父类的功能无法满足子类的需求。

方法重写的前提：必须要存在继承

方法的重写：子父类出了同名的函数，这个我们就称作为方法的重写。

什么时候要使用方法的重写：父类的功能无法满足子类的需求时。

方法重写要注意的事项：
		1、方法重写时，方法名与形参列表必须要一致。
		2、方法重写时，子类的权限修饰符必须要大于或者等于父类的权限修饰符。
		3、方法重写时，子类的返回值类型必须要小于或者等于父类的返回值类型。
		4、方法重写时，子类抛出的异常类型要小于或者等于父类抛出的异常类型。
			Exception(最坏)
			RuntimeException(小坏)

方法的重载：在一个类中存在两个或者两个以上的同名函数，称作方法的重载。

方法重载的要求：
	1、函数名要一致。
	2、形参列表不一致（形参的个数或形参的类型不一致）
	3、与返回值类型无关。

	*/
class Animal{//大的数据类型
}
class Fish extends Animal{//晓得数据类型
}

class Fu{

	String name;
	
	public Fu(String name){
		this.name = name;//指定调用父类带参的构造方法
	}
	public Animal eat() throws Exception{
		System.out.println(name+"吃番薯..");
		return new Animal();
	}
}

class Zi extends Fu{
		String num;

		public Zi(String name){
			super(name);//指定调用父类的构造方法
		}

	//重写父类的eat方法
	public Animal eat() throws RuntimeException{
		System.out.println("吃点开胃菜..");
		System.out.println("喝点汤....");
		System.out.println("吃点龙虾..");
		System.out.println("吃点青菜..");
		System.out.println("吃点甜点..");
		return new Animal();
	}
}

class Demo10 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi("大头儿子");
		z.eat();
	}
}
