/*
 循环语句-----while循环语句

 while 循环语句的格式：
    
	   while（循环的条件）{
		   循环语句;
		   }

while循环语句要注意的事项：
 1、while循环语句一般是通过一个变量来控制其循环的次数
 2、while循环语句的循环体代码如果只有一个语句的时候，那么可以省略大括号。但是不建议大家省略。
 3、while循环雨的的判断条件后不能跟分号，否则会影响执行的效果。

 需求： 在控制上打印五句hello world.


 */
class  Demo5
{
	public static void main(String[] args) 
	{
		int count = 0;
		while(count<5){
			System.out.println("Hello World!");
			count++;
		}
		
	}
}
