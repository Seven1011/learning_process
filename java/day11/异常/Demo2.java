/*
sun�ṩ�˺ܶ���쳣��������������������и��ֵĲ��������������sun����
�ṩ�쳣�໹����������������ʵ���������в��������������ô��ʱ�����Ǿ�
��Ҫ�Զ����쳣�ࡣ

����ģ��feiQ���ߵ�ʱ�����û�в������ߣ���ô���׳�һ��û�в������ߵ��쳣��
����Ѿ����������ߣ���ô��������ʾ�����б�

�Զ����쳣��Ĳ��裺�Զ���һ����̳�Exception���ɡ�

	*/
//�Զ���һ��û�����ߵ��쳣��
class NoIpException extends Exception{
	public NoIpException (String message){
		super(message);//������Exceptionһ�������Ĺ��췽��
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
			System.out.println("���ϲ������ߣ���");
		}
		*/

	}
	public static void feiQ(String ip) throws NoIpException {
		if (ip == null)
		{
			//�׳�һ��û�в������ߵ��쳣
			throw new NoIpException("û�в����ߣ���");
		}
		System.out.println("������ʾ�����б�..");
	}
}
