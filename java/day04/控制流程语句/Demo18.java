/*
continue�ؼ���

continue�����÷�Χ������ѭ�����

continue�����ã���ֹ����ѭ����ִ����һ��ѭ����


continueҪע������
		1����һ������£�continue���治�ܸ���������䣬��Ϊ��Զ�޷��õ�ִ��
		2��continue Ҳ�ǿ�����ϱ��ʹ�õ�

	*/
class Demo18 
{
	public static void main(String[] args) 
	{
		/*
		outer:for (int i = 0; i < 3 ;i++ )
		{
			innre:for (int j = 0; j<2  ; j++ )
			{
				System.out.println("Hello");
				continue outer;
			}
		}

		���󣺼���1-100��ż���ܺ�
		*/
	
	  int sum = 0 ;
	  for (int num = 1; num<=100  ; num++ )
	  {
		  if (num%2!=0)
		  {
			  continue;//���������������ѭ��
		  }
	   sum = sum+num;
	  }
		System.out.println("�ܺ��ǣ�"+sum);
	}
}
