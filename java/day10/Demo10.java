/*

���ʣ� �������Ϣ��ͨ��printStackTrace������ӡ��������ô�쳣����Ӻζ����أ� 
	Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo10.div(Demo10.java:10)
        at Demo10.main(Demo10.java:5)
	
jvm���е�a/b�������ʱ�򣬷���bΪ0������Ϊ0��������ʵ������������
�������������jvmһ�����������ֲ����������ʱ����ôjvm�ͻ����ϴ���
һ����Ӧ���쳣���󣬲��һ��������쳣���� ��printStackTrace�ķ���������

�쳣�Ĵ��� 
	
		��ʽһ��������

			������ĸ�ʽ��
				
					try{
					���ܷ����쳣�Ĵ���
					}cash�������쳣����  ��������{
						�����쳣�Ĵ���...
					}


				������Ҫע���ϸ�ڣ�
					1�����try���������쳣�����˴���֮����ôtry-catch������Ĵ����������ִ��
					2�����try���г����쳣�Ĵ��룬��ô��try�г����쳣�������Ĵ����ǲ���ִ����
					3��һ��try������ǿ��Ը��ж��catch��ģ�Ҳ����һ��try����Բ�������쳣������


		��ʽ�����׳�����

����һ���쳣�Ĵ���о�û�ж������ã���Ϊ�о��������һ�仰���ѣ�
		�쳣����ǳ����ã�ֻ��������������Ŀǰ���Ӵ���֪ʶ��̫�����޶���

���ʶ����Ժ󲶻����ʱ���Ƿ���ǲ���Exception���ɣ�
		��ģ���Ϊ��������ʾ������������ͬ���쳣���͵�ʱ�������������в�ͬ�Ĵ���ʽ
		����Ҫ�ֿ���ͬ���쳣���ʹ���


	*/
class Demo10 
{
	public static void main(String[] args) 
	{
		div(4,0);
	}
	 public static void div(int a, int b){
		int c = 0;
		try{
			 c = a/b; //jvm����仰��ʱ�����˲��������������ô�ͻᴴ��һ����Ӧ���쳣����
			 System.out.println("����ĳ���"+arr.length);
		}cash(ArithmeticException e){
			//�����쳣�Ĵ���...
			System.out.println("toString:"+e.tostring());
		}cash(NullPointerException e){
			System.out.println("�����˿�ָ���쳣");
		}

		 System.out.println("c = "+c);
	 }
}
