/*


	*/
class Demo5 
{

	
	
	//构造函数
	public Demo5(){   //构造函数
		i = 300000000;	
	}
		
	//构造代码块   //构造代码块的初始化
	{
		i = 200000000;
	}
	
	int i = 100000000;	 //成员变量的显初始化

		

	public static void main(String[] args) 
	{
		Demo5 d = new Demo5();
		System.out.println("i = "+d.i); //    双、吴、刘 ：2000   ：
	}
}
