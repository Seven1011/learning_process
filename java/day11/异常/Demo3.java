/*
����ģ����ȥ��ľͰ���������Ǯ����10�飬��ô���׳�һ��û�д���Ǯ���쳣����
��������ˣ���ô�Ϳ��Գ���������ĵع���ľͰ��...

	
	*/
class NoMoneyException extends Exception{
	public NoMoneyException(String message){
		super(message);
	}
}
class Demo3 
{
	public static void main(String[] args) 
	{
		try{
			eat(8);
		}catch(NoMoneyException e){
			e.printStackTrace();
			System.out.println("ϴ��һ���£���");
		}
	}
	public static void eat(int money) throws NoMoneyException{
		if (money<10)
		{
			throw new NoMoneyException("�԰����ͣ���");
		}
			System.out.println("����������ĵع���ľͰ������");
	}

}
