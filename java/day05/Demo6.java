/*
数组中最常见的问题：
   1、NullPointerException 空指针异常
	 原因：引用类型变量没有指向任何对象，而访问了对象的属性或者调用了对象的方法
   2、ArrayIndexOutOfBoundsException 索引值越界
   访问了不存在的索引值



	*/

class  Demo6
{
	public static void main(String[] args) 
	{
		/*
		int[] arr = new int[2];
		arr = null ;//null 让该变量不要饮用任何的对象
		arr[1] = 10;
		System.out.println(arr[1]);
		*/
		int [] arr = new int[4];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		//System.out.println(arr[4]);//访问索引值为4的内存空间储存的值
		for (int index = 0; index<=arr.length ; index++ )//遍历导致越界
		{
			System.out.println(arr[index]+",");
		}
	}
	}
