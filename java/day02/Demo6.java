/*
声明变量的方式：
  声明变量的方式一:
    
	   数据类型 变量名=数据;
  
  声明变量的方式二：
      
	   数据类型 变量一 变量二...

  注意：
     1.变量必须先声明再使用。
	 2.在一个作用域中不能声明同名的变量。





   */
class Demo6 
{
	public static void main(String[] args) 
	{
           //int age=12; 声明一个变量
		   int age,height;//声明了变量
           //给变量赋值
		   age=10;
		   height=175;
		System.out.println(age);
		System.out.println(height);
	}
}
