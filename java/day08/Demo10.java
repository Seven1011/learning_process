/*
Ŀǰ�����⣺����Ĺ����޷��������������

������д��ǰ�᣺����Ҫ���ڼ̳�

��������д���Ӹ������ͬ���ĺ�����������Ǿͳ���Ϊ��������д��

ʲôʱ��Ҫʹ�÷�������д������Ĺ����޷��������������ʱ��

������дҪע������
		1��������дʱ�����������β��б����Ҫһ�¡�
		2��������дʱ�������Ȩ�����η�����Ҫ���ڻ��ߵ��ڸ����Ȩ�����η���
		3��������дʱ������ķ���ֵ���ͱ���ҪС�ڻ��ߵ��ڸ���ķ���ֵ���͡�
		4��������дʱ�������׳����쳣����ҪС�ڻ��ߵ��ڸ����׳����쳣���͡�
			Exception(�)
			RuntimeException(С��)

���������أ���һ�����д������������������ϵ�ͬ���������������������ء�

�������ص�Ҫ��
	1��������Ҫһ�¡�
	2���β��б�һ�£��βεĸ������βε����Ͳ�һ�£�
	3���뷵��ֵ�����޹ء�

	*/
class Animal{//�����������
}
class Fish extends Animal{//������������
}

class Fu{

	String name;
	
	public Fu(String name){
		this.name = name;//ָ�����ø�����εĹ��췽��
	}
	public Animal eat() throws Exception{
		System.out.println(name+"�Է���..");
		return new Animal();
	}
}

class Zi extends Fu{
		String num;

		public Zi(String name){
			super(name);//ָ�����ø���Ĺ��췽��
		}

	//��д�����eat����
	public Animal eat() throws RuntimeException{
		System.out.println("�Ե㿪θ��..");
		System.out.println("�ȵ���....");
		System.out.println("�Ե���Ϻ..");
		System.out.println("�Ե����..");
		System.out.println("�Ե����..");
		return new Animal();
	}
}

class Demo10 
{
	public static void main(String[] args) 
	{
		Zi z = new Zi("��ͷ����");
		z.eat();
	}
}
