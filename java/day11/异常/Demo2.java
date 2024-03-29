/*
sun提供了很多的异常类给我们用于描述程序中各种的不正常情况，但是sun给我
提供异常类还不足以描述我们现实生活中所有不正常的情况，那么这时候我们就
需要自定义异常类。

需求：模拟feiQ上线的时候如果没有插上网线，那么就抛出一个没有插上网线的异常，
如果已经插上了网线，那么就正常显示好友列表。

自定义异常类的步骤：自定义一个类继承Exception即可。

	*/
//自定义一个没有网线的异常类
class NoIpException extends Exception{
	public NoIpException (String message){
		super(message);//调用了Exception一个参数的构造方法
	}
}
class Demo2 
{
	public static void main(String[] args) throws NoIpException
	{
		String ip = "192.168.10.100";
		ip = null;
		//try{
			
			feiQ(ip);
		/*
			} catch(NoIpException e){

			e.printStackTrace();
			System.out.println("马上插上网线！！");
		}
		*/

	}
	public static void feiQ(String ip) throws NoIpException {
		if (ip == null)
		{
			//抛出一个没有插上网线的异常
			throw new NoIpException("没有查网线！！");
		}
		System.out.println("正常显示好友列表..");
	}
}
