/*
数组的特点：
		1、数组只能存储同一种数据类型的数据
		2、数组时会给出存到数组中的元素分配一个索引值的，索引值从0开始，最大的索引值是length-1；
		3、数组一旦初始化，长度固定。
		4、数组中元素与元素之间的内存地址是连续的。
	*/
class Demo17
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
		arr = new int[4];
		System.out.println(arr.length);//输出为4
	}
}