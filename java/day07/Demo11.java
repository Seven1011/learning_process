/*
����ͳ��һ���౻ʹ���˶��ٴδ�������,���������ʾ�������Ĵ���

	*/

class Emp
{
	//�Ǿ�̬��Ա����
	static	int count = 0; //������
	
	String name;
	
	//��������
	{
		count++;
	}
	public Emp(){

	}
	public void showCount(){
		System.out.println("������"+count+"������");
	}
}
class Demo11 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		e3.showCount();

	}
}