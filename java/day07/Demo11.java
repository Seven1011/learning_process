/*
需求：统计一个类被使用了多少次创建对象,该类对外显示被创建的次数

	*/

class Emp
{
	//非静态成员变量
	static	int count = 0; //计数器
	
	String name;
	
	//构造代码块
	{
		count++;
	}
	public Emp(){

	}
	public void showCount(){
		System.out.println("创建了"+count+"个对象");
	}
}
class Demo11 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		e3.showCount();

	}
}