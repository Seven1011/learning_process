/*
����ʵ�������кܶ�����ʱ�����ᷢ���仯�ġ�
���磺���������顢ʱ�䡢���С�����

�������ְ��������й����У���ֵ���Է����仯������

��������һ���洢���ݵ�����

�����߱�ʲô�ص㣺
  1.����Ҫ����������С����
  2.�洢һ����ʽ�����ݡ�
  3.���֡�

���������壩һ�������ĸ�ʽ��

 ���� ��������=���ݡ�

 �������������淶���׵���Сд��������������ĸ��д������Сд

 java��ʾһ�����������������ʹ�����������������ġ�
     ������������
	 ������������

java�еİ��ֻ������������ͣ�
  �������������ͣ�
    byte(�ֽ�)    8λ��bit��  2^8=256  -128~127
    short(������)  16λ    2^16=65536
	int(����)    32bit 
	long(������) 64bit    2^64 
	
	ע�⣺���һ������û�м����κα�ʶ��ʱ����ôĬ����int���͵�����
	���Ҫ�Ѹ����ݱ�ʾ��һ��long���͵����ݣ���ô��Ҫ���ݺ����L��ʾ
	L�����ִ�Сд ����д��д��
	
	�ɻ󣺴洢��������ʹ�������������ͣ�����ʹ�ã�

	ѡ���������͵�ԭ����������������������£���С��С��

	   
   С�����������ͣ�
      float(�����ȸ�����) 32bit

	  double(˫���ȸ�����) 64bit
	  ����С��λ��һ��

	  ע�⣺���һ��С��û�м����κα�ʶ��ʱ����ô��С��Ĭ����double���͵����ݣ������Ҫ
	  ��ʾ��Float���͵���Ҫ�����ݺ������f,f�����ִ�Сд.

	  �������ͣ���������ֻ������ֵ ture  false

	  boolean    1�ֽڻ���4���ֽ�

	  ���ʹ��boolean����һ���������͵ı���ʱ����ô�ñ���ռ4���ֽ�
	  ���ʹ��boolean����һ���������͵�ʱ����ô�������Ԫ��ռһ���ֽ�

	  �ַ�����
	    char 2�ֽڣ�16bit��

	  ���ֻ������������ͣ�
	  ������byte short int long 
	  С����float double 
	  ������boolean
	  �ַ���char

	  �ַ��������������ǣ�string  ������������ �����ڻ�����������


	  java�淶2.0��java��Ƥ�飩






*/
class  Dmeo5
{
	public static void main(String[] args) 
	{
		//����1������һ�������洢һ�������˵����䡣
		byte age=120;//������һ��byte���͵ı������ñ���������Ϊage 
		//�ı������ֵ
		age = 121;

		//����2������һ�������洢��ʦ�ڴ����Ǯ��
		short money=128;

		//����3������һ�������洢�����Ǯ
		int bossMoney=100000000;
		
		//����4������һ�������洢��С����Ǯ

		long allmoney=100000000000000000L;

		//����С��
		float f=3.14f;
		
		double d=3.1415926;

		boolean b=true;

		char c='a'

		String str="hellow world"
	

		System.out.println(age);
		System.out.println(money);
		System.out.println(bossMoney);
		System.out.println(allmoney);
		System.out.println(f);
		System.out.println(d);
		System.out.println(b);
		System.out.println(c);
	}
}