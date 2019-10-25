/*
控制流程语句----do  while循环语句

 格式：
    do{
	
	}while（判断条件）；

需求：在控制上打印五句 hello world


while循环语句与do while循环语句的区别：
   while循环语句是先判断后执行循环语句的，do while循环语句
   是先执行，后判断。不管条件是否满足，至少执行一次。
  */
class Demo9  
{
	public static void main(String[] args) 
	{
		/*
		int count = 0;
		do{
		System.out.println("Hello World!");
		count++;
		} while (count<5);
		*/
		boolean flag = false;
		do{
		System.out.println("Hello World!");
		}while(flag);
	}
}
