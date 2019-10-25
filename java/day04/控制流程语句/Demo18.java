/*
continue关键字

continue的适用范围：用于循环语句

continue的作用：终止本次循环，执行下一次循环。


continue要注意的事项：
		1、在一种情况下，continue后面不能跟有其他语句，因为永远无法得到执行
		2、continue 也是可以配合标记使用的

	*/
class Demo18 
{
	public static void main(String[] args) 
	{
		/*
		outer:for (int i = 0; i < 3 ;i++ )
		{
			innre:for (int j = 0; j<2  ; j++ )
			{
				System.out.println("Hello");
				continue outer;
			}
		}

		需求：计算1-100的偶数总和
		*/
	
	  int sum = 0 ;
	  for (int num = 1; num<=100  ; num++ )
	  {
		  if (num%2!=0)
		  {
			  continue;//如果是奇数就跳出循环
		  }
	   sum = sum+num;
	  }
		System.out.println("总和是："+sum);
	}
}
