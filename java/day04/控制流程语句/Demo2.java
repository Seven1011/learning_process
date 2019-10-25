/*
控制流程语句之----switch判断语句

switch 语句的格式
  
    switch（你的选择）{
		case 值1：
		    符合值1执行的代码
		     break;
		case 值2：
		    符合值2执行的代码
             break;
		.....
		default:
		    你的选择都不符合上述选项时执行的代码;
         break;
        }
switch语句要注意的事项：
1、switch语句使用的变量只能是byte、char、short、int、String数据类型，String数据类型是从jdk 7.0 的时候开始使用的
2、case后面跟的数据必须是一个常量。
3、switch语句的停止条件：
   switch语句以单匹配上了其中的一个case，那么就会执行对应的case，执行完毕后如果没有遇到break关键字或者结束switch的大括号，那么switch语句不会在判断，按照
   按照代码从上往下的顺序执行所有的代码。直到遇见break或者是阶数switch语句的大括号为止。
4、在switch语句中，永远都是会先判断case语句，在没有符合的选择是才会运行default


if---else if---else if语句与switch 语句非常相似：

  



判断下列哪些不是计算机语言（ D）

   A Java    B C#  C javascript  D android


   */

class  Demo2
{
	public static void main(String[] args) 
	{
		int option= 4; //定义一个变量存储你的选择
		switch (option){
		case 1:
		  System.out.println("java");
		break;
        case 2:
		  System.out.println("C#");
		break;
		case 3:
		  System.out.println("javascript");
		break;
		case 4:
		  System.out.println("android");
		break;
		default:
           System.out.println("你的选择有误");
		break;
		}
		
	}
}
