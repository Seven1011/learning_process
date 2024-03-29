/*
目前多态情况下不能访问子类特有的成员。

如需要访问子类特有的成员，那么需要进行类型强制转换

基本数据类型的转换

	小数据类型---->大数据类型	自动类型转换	
	大数据类型---->小数据类型	强制类型转换   小数据类型	变量名 = （小数据类型） 大数据类型

引用数据类型的转换
	
	小数据类型---->大数据类型	自动类型转换	
	大数据类型---->小数据类型	强制类型转换


	*/
/动物类
abstract class Animal{

	String name;

	public Animal(String name){
		this.name = name;
	}

	public abstract void run();
}

//老鼠
class  Mouse extends Animal{


	public Mouse(String name){
		super(name);
	}
	
	public  void run(){
		System.out.println(name+"四条腿慢慢的走!");
	}

	//老鼠特有方法---打洞
	public void dig(){
		System.out.println("老鼠在打洞..");
	}
}



//鱼
class Fish extends Animal{

	public Fish(String name){
		super(name);
	}

	public  void run(){
		System.out.println(name+"摇摇尾巴游啊游 !");
	}


	//吹泡泡
	public void bubble(){
		System.out.println(name+"吹泡泡...!");
	}

}




class Demo2 
{
	public static void main(String[] args) 
	{
		/*
		Animal a = new Mouse("老鼠");  //多态
		//调用子类特有的方法
		Mouse m  = (Mouse)a;  //强制类型转换
		m.dig();
		*/

		Mouse m = new Mouse("米老鼠");
		Fish f = new Fish("草鱼");

		print(f);

	}


	//需求： 定义一个函数可以接收任意类型的动物对象，在函数内部要调用到动物特有的方法。
	public static void print(Animal a){ // Animal a   = new Mouse("米老鼠");
		if(a instanceof Fish){
			Fish f = (Fish)a;
			f.bubble();
		}else if(a instanceof Mouse){
			Mouse m = (Mouse)a;
			m.dig();
		}
	}


}
