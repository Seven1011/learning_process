/*
break��continue�ؼ���

breakʹ�÷�Χ��ֻ������switch������ѭ�������

break���ã�
		1��break����switch���������ǽ���һ��switch���
		2��break����ѭ�������ӵ��������ǰ���ڵ�ѭ�����


������Ŀ��breakĿǰλ���ڲ��forѭ������β�����break����������forѭ��
		������ϱ�ǽ��

��ǵ�����ֻҪ���ϱ�ʶ������������Ϳ���


    */
class Demo17 
{
	public static void main(String[] args) 
	{
	  outre:for(int j = 0 ; j<3 ; j++){
		intre:for(int i = 0 ; i<2 ; i++ ){
			System.out.println("Hello World!");
			break outre;
		}
	  }
	}
}
