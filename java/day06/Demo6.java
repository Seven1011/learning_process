/*
需求：使用java类描述一个计算机类，计算机具备操作数1，操作数2，操作符3、三个公共属性
还具备计算的功能行为


要求：不能直接对操作数1、操作数2、运算符这些属性进行直接赋值，要封装起来。（+、-、*、/）

根据需要提供get或者set方法

	需要提供set方法
  */

//计算器类
class Calculator
{
	private int num1; //操作数1

	private int num2;//操作数2

	private char option;//运算符

	//提供公共的方法设置属性值...
	public void initCalaculator(int n1,int n2,char o){
		num1 = n1;
		num2 = n2;
		if (o == '+'||o == '-'||o == '*'||o == '/')
		{
			option = o;
		} else {
			option = '+';
		}
	}

	//计算的功能
	public void calculate(){
		switch(option){
			case '+':
				System.out.println("做加法运算，结果是："+(num1+num2));
				break;
			case '-':
				System.out.println("做减法运算，结果是："+(num1-num2));
				break;
			case '*':
				System.out.println("做乘法运算，结果是："+(num1*num2));
				break;
			case '/':
				System.out.println("做除法运算，结果是："+(num1/num2));
				break;
			}
	}

}

class  Demo6
{
	public static void main(String[] args) 
	{
		//创建了一个计算机对象
		Calculator c = new Calculator();
		//设置属性值
		c.initCalaculator(89, 2, '/');
		//调用计算器的计算功能
		c.calculate();
	}
}
