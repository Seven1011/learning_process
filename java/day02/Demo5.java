/*
在现实生活中有很多数据时经常会发生变化的。
比如：天气、心情、时间、股市。。。

变量：字啊程序运行过程中，其值可以发生变化的量。

变量就是一个存储数据的容器

容器具备什么特点：
  1.必须要有容量（大小）。
  2.存储一定格式的数据。
  3.名字。

声明（定义）一个变量的格式：

 容量 变量名字=数据。

 变量名的命名规范：首单词小写，其他单词首字母大写，其他小写

 java表示一个变量的容量多大是使用了数据类型描述的。
     基本数据类型
	 引用数据类型

java中的八种基本的数据类型：
  整数的数据类型：
    byte(字节)    8位（bit）  2^8=256  -128~127
    short(短整型)  16位    2^16=65536
	int(整型)    32bit 
	long(长整型) 64bit    2^64 
	
	注意：如果一个整数没有加上任何标识的时候，那么默认是int类型的数据
	如果要把该数据表示成一个long类型的数据，那么需要数据后面加L表示
	L不区分大小写 建议写大写。
	
	疑惑：存储整数可以使用四种数据类型，具体使用？

	选用数据类型的原则：在满足需求情况的需求下，能小就小。

	   
   小数的数据类型：
      float(单精度浮点型) 32bit

	  double(双精度浮点型) 64bit
	  保留小数位不一样

	  注意：如果一个小数没有加上任何标识的时候，那么该小数默认是double类型的数据，如果需要
	  表示成Float类型的需要在数据后面加上f,f不区分大小写.

	  布尔类型：布尔类型只有两个值 ture  false

	  boolean    1字节或者4个字节

	  如果使用boolean声明一个基本类型的变量时，那么该变量占4个字节
	  如果使用boolean声明一个数组类型的时候，那么该数组的元素占一个字节

	  字符类型
	    char 2字节（16bit）

	  八种基本的数据类型：
	  整数：byte short int long 
	  小数：float double 
	  布尔：boolean
	  字符：char

	  字符串的数据类型是：string  引用数据类型 不属于基本数据类型


	  java规范2.0（java白皮书）






*/
class  Dmeo5
{
	public static void main(String[] args) 
	{
		//需求1：定义一个变量存储一个正常人的年龄。
		byte age=120;//声明了一个byte类型的变量，该变量的名称为age 
		//改变变量的值
		age = 121;

		//需求2：定义一个变量存储老师口袋里的钱。
		short money=128;

		//需求3：定义一个变量存储老李的钱
		int bossMoney=100000000;
		
		//需求4：定义一个变量存储周小川的钱

		long allmoney=100000000000000000L;

		//储存小数
		float f=3.14f;
		
		double d=3.1415926;

		boolean b=true;

		char c='a'

		String str="hellow world"
	

		System.out.println(age);
		System.out.println(money);
		System.out.println(bossMoney);
		System.out.println(allmoney);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
	}
}
