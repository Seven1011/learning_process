import java.util.*;
class  homework1
{
	public static void main(String[] args) 
	{
		//创建一个随机数对象
		Random random = new Random();
		//调用随机数对象的nextInt方法，产生一个随机数
		int randomNum = random.nextInt(10)+1;//产生1-10之间的随机数
	    Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while(flag){
		System.out.println("请输入你猜的数字：");
	    int guessNum=scanner.nextInt();
		if(guessNum>randomNum){
            System.out.println("猜大了..");
		}else if(guessNum<randomNum){
	        System.out.println("猜小了..");
		}else{
         	System.out.println("恭喜你，猜对了！");
			flag = false;
		 }
		}
	}
}