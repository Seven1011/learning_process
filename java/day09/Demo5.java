/*
直交换：调用一个方法的时候，传递给方法的参数，实际上传递变量所存储的值。

需求1：定义一个函数交换两个基本类型变量的值。


如果是不同的引用类型的变量操作同一个对象，那么肯定会影响到结果。

	*/
class Demo5 
{
	public static void main(String[] args) 
	{
		int a = 3;
		int b = 5;
		changeValue(a,b);
		System.out.println("交换之后的值：")
	}
		//需求：定义一个函数交换两个基本类型变量的值
		public static void changeValue(int a , int b){
			int temp = a;
			a = b;
			b = temp;
			System.out.println("方法内部交换的值：a = "+a+"b = "+b);
		}
}
