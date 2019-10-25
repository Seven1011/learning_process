/*
finally 块；

finally块的使用前提是必须要存在try块才能使用。

finally块的代码在任何情况下都会执行的，除了jvm退出的情况。

finally非常适合做资源释放的工作，这样子可以保证资源文件在任何情况下都会被释放。


	*/
class Demo5
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
