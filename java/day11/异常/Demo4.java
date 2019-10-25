/*
异常体系：
---------|Throwable 所有错误或者异常的父类
-----------| Error（错误）
-----------| Exception(异常)  异常一般都通过代码处理

--------------|  运行时异常：如果一个方法内部抛出了一个运行时异常，那么方法上可以声明也可以不声明，调用者可以处理也可以不处理
--------------|   编译时异常（非运行时异常、受检异常）：如果一个方法内部抛出了一个编译时异常，那么方法上必须进行声明，调用者也必须进行处理

运行时异常：RuntimeException以及RUNtimeException子类 都是属于运行时异常
	*/
class Demo4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
