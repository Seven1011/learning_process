/*
数组的初始化方式：


	动态初始化：
		数据类型[] 变量名 = {元素1，元素2...};
	静态初始化：
		数据类型[] 变量名 = {元素1，元素2...};
		
如果程序一开始就已经确定了数据，那么就可以使用静态初始化	
否则如果数据一开始还不太明确 ，那么就是使用动态初始化


	
	
	*/
class  Demo7
{
	public static void main(String[] args) 
	{
		//动态初始化
		//int[] arr = new int[10];

		//静态初始化
		int[] arr = {10,20,30,40,50};
		for(int index = 0; index<arr.lrngth ; index++){
				System.out.println(arr[index]+",");
		}
	}
}
