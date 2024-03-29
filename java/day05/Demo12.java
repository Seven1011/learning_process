/*
需求：定义一个函数接受一个数组对象与一个要查找的目标元素，函数要返回该目标元素在
	  数组中的索引值，如果目标元素不在数组中，那么返回-1表示


	*/
class Demo12 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,16,19,23,54};
		int index = halfSearch(arr,23);
		System.out.println("元素所在的索引值："+index);

	}
	public static int halfSearch(int[] arr, int target){
		//定义三个变量分别记录最大、最小、中间的查找范围索引值
		int max = arr.length-1;
		int min = 0;
		int mid = (max+min)/2;
		while (true)
		{
			if (target>arr[mid])
			{
				min = mid+1;
			} else if (target<arr[mid])
			{
				max = mid-1;
			}else{
			//找到了元素
				return mid;
			}
			//没有找到的情况
			if (max<min)
			{
				return -1;
			}
			//重新计算索引值
			mid = (max+min)/2;
		}
	}
	


	public static int searchEle(int[] arr, int target){
		for (int i = 0; i<arr.length ; i++ )
		{
			if (arr[i]==target)
			{
				return i;
			}
		}
		return -1;
	}
}
