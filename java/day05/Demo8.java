/*
需求：定义一个函数接受一个int类型的数组对象，找出数组对象中的最大元素
	  返回给调用者。

直接排序（选择排序）：定义一个变量用于纪录最大值，然后使用该变量与数组中的没一个元素进
行比较。如果发现有元素闭幕前所记录的值要大的，马默该变量记录目前比较的值

	*/
class  Demo8
{
	public static void main(String[] args) 
	{
		int[] arr = {12,14,26,5,4}
		 int max = getMax(arr);
		 System.out.println("最大值："+max);
	}


	public static int getMax(int[] arr){
	  int max = arr[0];//用于纪录最大值
	  for (int i = 1; i<arr.length ; i++ )
	  {
		  if (arr[i]>max)  //如果发现元素比max大，那么max记录该元素。
		  {
			  max = arr[i];
		  }
	  }
		 return max;
	}



}
