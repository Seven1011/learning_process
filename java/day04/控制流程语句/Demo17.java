/*
break、continue关键字

break使用范围：只能用于switch或者是循环语句中

break作用：
		1、break用于switch语句的作用是阶数一个switch语句
		2、break用于循环雨的坐拥世界树当前所在的循环语句


笔试题目：break目前位于内层的for循环，如何才能让break作用于外层的for循环
		可以配合标记解决

标记的命名只要符合标识符的命名规则就可以


    */
class Demo17 
{
	public static void main(String[] args) 
	{
	  outre:for(int j = 0 ; j<3 ; j++){
		intre:for(int i = 0 ; i<2 ; i++ ){
			System.out.println("Hello World!");
			break outre;
		}
	  }
	}
}
