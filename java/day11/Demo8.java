/*
权限修饰符：权限修饰符就是控制被修饰的成员的范围可见性。

权限修饰符有四个：public（公共）   protected（受保护）     default(缺省)     private

同一个类			true	

同一个包			true	

子父类				true

不同包				true

	*/
class  Demo8
{
	public static void main(String[] args) 
	{
		private int i = 10;
		System.out.println("Hello World!");
	}
}
