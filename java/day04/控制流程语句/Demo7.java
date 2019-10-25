/*


需求1：计算1-100,7的倍数总和

需求2：实现猜数字游戏,如果没有猜对可以继续输入你猜的数字，如果猜对了，游戏结束

 如何产生一个随机数。
 步骤：
    1、创建一个随机数对象。
	2、调用随机数对象的nextInt方法。
	3、导包。

  */
import java.util.*;
class  Demo7
{
	public static void main(String[] args) 
	{
		//创建一个随机数对象
		Random random = new Random();
		//调用随机数对象的nextInt方法，产生一个随机数
		int num = random.nextInt(11);//产生0-10(11-1)之间的随机数
		System.out.println("随机数："+num);
	}
}
